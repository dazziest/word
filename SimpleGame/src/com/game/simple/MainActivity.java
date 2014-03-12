package com.game.simple;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.primitive.Rectangle;
import org.andengine.entity.scene.IOnAreaTouchListener;
import org.andengine.entity.scene.IOnSceneTouchListener;
import org.andengine.entity.scene.ITouchArea;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.AutoParallaxBackground;
import org.andengine.entity.scene.background.ParallaxBackground.ParallaxEntity;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.util.FPSLogger;
import org.andengine.extension.physics.box2d.PhysicsConnector;
import org.andengine.extension.physics.box2d.PhysicsFactory;
import org.andengine.extension.physics.box2d.PhysicsWorld;
import org.andengine.extension.physics.box2d.util.Vector2Pool;
import org.andengine.input.sensor.acceleration.AccelerationData;
import org.andengine.input.sensor.acceleration.IAccelerationListener;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;

import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga
 *
 * @author Nicolas Gramlich
 * @since 19:58:39 - 19.07.2010
 */
public class MainActivity extends SimpleBaseGameActivity implements IOnSceneTouchListener, IOnAreaTouchListener {
	// ===========================================================
	// Constants
	// ===========================================================

	private static int CAMERA_WIDTH;	//width
	private static int CAMERA_HEIGHT;	//height

	// ===========================================================
	// Fields
	// ===========================================================

	private BitmapTextureAtlas mBitmapTextureAtlas;
	private TiledTextureRegion mPlayerTextureRegion;
//	private TiledTextureRegion mEnemyTextureRegion;

	private BitmapTextureAtlas mAutoParallaxBackgroundTexture;

	private ITextureRegion mParallaxLayerBack;
	private ITextureRegion mParallaxLayerMid;
	private ITextureRegion mParallaxLayerFront;
	private PhysicsWorld mPhysicsWorld;
	private float mGravityX;
	private float mGravityY = 9.8f;
	private AnimatedSprite player;

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================
	
	

	@Override
	public EngineOptions onCreateEngineOptions() {
		WindowManager win = getWindowManager();
		Display d  = win.getDefaultDisplay(); 
    	d = win.getDefaultDisplay();
    	CAMERA_HEIGHT = d.getHeight();
    	CAMERA_WIDTH = d.getWidth();
    	
		final Camera camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);

		return new EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), camera);
	}

	@Override
	public void onCreateResources() {
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/");
		
		this.mBitmapTextureAtlas = new BitmapTextureAtlas(this.getTextureManager(), 1024, 1024, TextureOptions.BILINEAR);
		this.mPlayerTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(this.mBitmapTextureAtlas, this, "anoman.png", 0, 0, 6, 1);
//		this.mEnemyTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(this.mBitmapTextureAtlas, this, "enemy.png", 73, 0, 3, 4);
		this.mBitmapTextureAtlas.load();

		this.mAutoParallaxBackgroundTexture = new BitmapTextureAtlas(this.getTextureManager(), 1024, 2048);
		this.mParallaxLayerFront = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mAutoParallaxBackgroundTexture, this, "bg_front.png", 0, 0);
		this.mParallaxLayerBack = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mAutoParallaxBackgroundTexture, this, "bg_back.jpg", 0, 300);
		this.mParallaxLayerMid = BitmapTextureAtlasTextureRegionFactory.createFromAsset(this.mAutoParallaxBackgroundTexture, this, "bg_middle.png", 0, 950);
		this.mAutoParallaxBackgroundTexture.load();
	}

	@Override
	public Scene onCreateScene() {
		this.mEngine.registerUpdateHandler(new FPSLogger());
		
		//create Physic world
		this.mPhysicsWorld = new PhysicsWorld(new Vector2(0, SensorManager.GRAVITY_EARTH), true);
		//create scene
		final Scene scene = new Scene();
		final AutoParallaxBackground autoParallaxBackground = new AutoParallaxBackground(0, 0, 0, 5);
		final VertexBufferObjectManager vertexBufferObjectManager = this.getVertexBufferObjectManager();
		autoParallaxBackground.attachParallaxEntity(new ParallaxEntity(0.0f, new Sprite(0, CAMERA_HEIGHT - this.mParallaxLayerBack.getHeight(), this.mParallaxLayerBack, vertexBufferObjectManager)));
		autoParallaxBackground.attachParallaxEntity(new ParallaxEntity(-3.0f, new Sprite(0, 180, this.mParallaxLayerMid, vertexBufferObjectManager)));
		autoParallaxBackground.attachParallaxEntity(new ParallaxEntity(-10.0f, new Sprite(0, CAMERA_HEIGHT - this.mParallaxLayerFront.getHeight(), this.mParallaxLayerFront, vertexBufferObjectManager)));
		scene.setBackground(autoParallaxBackground);
		scene.setOnSceneTouchListener(this);
		
		//set rectangle boundary
		final Rectangle ground = new Rectangle(0, CAMERA_HEIGHT - 115, CAMERA_WIDTH, 0, vertexBufferObjectManager);
		final Rectangle roof = new Rectangle(0, 0, CAMERA_WIDTH, 0, vertexBufferObjectManager);
		final Rectangle left = new Rectangle(0, 0, 0, CAMERA_HEIGHT, vertexBufferObjectManager);
		final Rectangle right = new Rectangle(CAMERA_WIDTH - 0, 0, 0, CAMERA_HEIGHT, vertexBufferObjectManager);

		//create wall
		final FixtureDef wallFixtureDef = PhysicsFactory.createFixtureDef(0, 0, 0);
		PhysicsFactory.createBoxBody(this.mPhysicsWorld, ground, BodyType.StaticBody, wallFixtureDef);
		PhysicsFactory.createBoxBody(this.mPhysicsWorld, roof, BodyType.StaticBody, wallFixtureDef);
		PhysicsFactory.createBoxBody(this.mPhysicsWorld, left, BodyType.StaticBody, wallFixtureDef);
		PhysicsFactory.createBoxBody(this.mPhysicsWorld, right, BodyType.StaticBody, wallFixtureDef);

		scene.attachChild(ground);
		scene.attachChild(roof);
		scene.attachChild(left);
		scene.attachChild(right);

		scene.registerUpdateHandler(this.mPhysicsWorld);

		scene.setOnAreaTouchListener(this);

		/* Calculate the coordinates for the face, so its centered on the camera. */
		final float playerX = (CAMERA_WIDTH - this.mPlayerTextureRegion.getWidth()) / 2;
		final float playerY = (CAMERA_HEIGHT - this.mPlayerTextureRegion.getHeight()) / 2;

		/* Create two sprits and add it to the scene. */
		player = new AnimatedSprite(playerX, playerY, this.mPlayerTextureRegion, vertexBufferObjectManager);
		final FixtureDef objectFixtureDef = PhysicsFactory.createFixtureDef(500f, 0, 0);
		final Body body = PhysicsFactory.createBoxBody(this.mPhysicsWorld, player, BodyType.DynamicBody, objectFixtureDef);
		body.resetMassData();
		
		this.mPhysicsWorld.registerPhysicsConnector(new PhysicsConnector(player, body, true, true));
		player.setScaleCenterY(this.mPlayerTextureRegion.getHeight());
//		player.setScale(2);
		player.animate(new long[]{150, 150, 150, 150, 150, 150}, 0, 5, true);
		player.setUserData(body);
//		scene.registerTouchArea(player);

//		final AnimatedSprite enemy = new AnimatedSprite(playerX - 80, playerY, this.mEnemyTextureRegion, vertexBufferObjectManager);
//		enemy.setScaleCenterY(this.mEnemyTextureRegion.getHeight());
//		enemy.setScale(2);
//		enemy.animate(new long[]{200, 200, 200}, 3, 5, true);

		scene.attachChild(player);
//		scene.attachChild(enemy);
		
//		final VertexBufferObjectManager vertexBufferObjectManager = this.getVertexBufferObjectManager();
		

		return scene;
	}

	@Override
	public boolean onAreaTouched(TouchEvent pSceneTouchEvent, ITouchArea pTouchArea, float pTouchAreaLocalX, float pTouchAreaLocalY) {
//		if(pSceneTouchEvent.isActionDown()) {
//			final AnimatedSprite player = (AnimatedSprite) pTouchArea;
//			this.jumpFace(player);
//			return true;
//		}
		return false;
	}
	
	private void jumpFace(final AnimatedSprite face) {
		final Body faceBody = (Body)face.getUserData();

//		int jumpX = -50;
		int jumpY = -1;

		final Vector2 velocity = Vector2Pool.obtain(this.mGravityX , this.mGravityY * jumpY);
		faceBody.setLinearVelocity(velocity);
//		faceBody.applyForce(velocity, faceBody.getWorldCenter());
		Vector2Pool.recycle(velocity);
	}

	@Override
	public boolean onSceneTouchEvent(Scene pScene, TouchEvent pSceneTouchEvent) {
		if(this.mPhysicsWorld != null) {
			if(pSceneTouchEvent.isActionDown()) {
//				final AnimatedSprite player = (AnimatedSprite) pTouchArea;
				this.jumpFace(player);
			}
		}
		return false;
	}

//	@Override
//	public void onAccelerationAccuracyChanged(AccelerationData pAccelerationData) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void onAccelerationChanged(AccelerationData pAccelerationData) {
////		this.mGravityX = pAccelerationData.getX();
////		this.mGravityY = pAccelerationData.getY();
////
////		final Vector2 gravity = Vector2Pool.obtain(this.mGravityX, this.mGravityY);
////		this.mPhysicsWorld.setGravity(gravity);
////		Vector2Pool.recycle(gravity);
//	}
	
	@Override
	public void onResumeGame() {
		super.onResumeGame();

//		this.enableAccelerationSensor(this);
	}

	@Override
	public void onPauseGame() {
		super.onPauseGame();

		this.disableAccelerationSensor();
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
