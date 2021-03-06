package com.moustacheapps.dfhelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {

	public static Texture texture, logoTexture;
	public static TextureRegion logo, zbLogo, mountain, cloud1, cloud2, cloud3,
			mountainf, cloud1f, cloud2f, cloud3f, grassL, grassR, bird,
			birdDown, birdUp, bird2, birdDown2, birdUp2, skullUp, skullDown,
			bar, playButtonUp, playButtonDown, easyButtonUp, easyButtonDown,
			hardButtonUp, hardButtonDown, xxxxButtonUp, xxxxButtonDown,
			hardButtonLockUp, hardButtonLockDown, xxxxButtonLockUp,
			xxxxButtonLockDown, backButtonUp, backButtonDown, powerUp,
			shuffleButtonLockedUp, shuffleButtonOffUp, shuffleButtonOnUp,
			shuffleButtonLockedDown, shuffleButtonOffDown, shuffleButtonOnDown,
			ready, gameOver, highScore, scoreboard, star, noStar, retry;
	public static Animation birdAnimation, birdAnimation2, bgAnimation,
			bgfAnimation;
	public static Sound dead, flap, coin, fall, powerUpSound;
	public static BitmapFont font, shadow, whiteFont;
	public static Preferences prefs;

	public static void load() {

		logoTexture = new Texture(Gdx.files.internal("data/logo.png"));
		logoTexture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

		logo = new TextureRegion(logoTexture, 0, 0, 256, 114);

		texture = new Texture(Gdx.files.internal("data/texture.png"));
		texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

		powerUp = new TextureRegion(texture, 272, 110, 12, 12);
		powerUp.flip(false, true);

		playButtonUp = new TextureRegion(texture, 156, 43, 29, 16);
		playButtonDown = new TextureRegion(texture, 185, 43, 29, 16);
		playButtonUp.flip(false, true);
		playButtonDown.flip(false, true);

		backButtonUp = new TextureRegion(texture, 156, 59, 29, 16);
		backButtonDown = new TextureRegion(texture, 185, 59, 29, 16);
		backButtonUp.flip(false, true);
		backButtonDown.flip(false, true);

		easyButtonUp = new TextureRegion(texture, 156, 75, 29, 16);
		easyButtonDown = new TextureRegion(texture, 185, 75, 29, 16);
		easyButtonUp.flip(false, true);
		easyButtonDown.flip(false, true);

		hardButtonUp = new TextureRegion(texture, 156, 91, 29, 16);
		hardButtonDown = new TextureRegion(texture, 185, 91, 29, 16);
		hardButtonUp.flip(false, true);
		hardButtonDown.flip(false, true);

		xxxxButtonUp = new TextureRegion(texture, 156, 107, 29, 16);
		xxxxButtonDown = new TextureRegion(texture, 185, 107, 29, 16);
		xxxxButtonUp.flip(false, true);
		xxxxButtonDown.flip(false, true);

		hardButtonLockUp = new TextureRegion(texture, 214, 91, 29, 16);
		hardButtonLockDown = new TextureRegion(texture, 243, 91, 29, 16);
		hardButtonLockUp.flip(false, true);
		hardButtonLockDown.flip(false, true);

		xxxxButtonLockUp = new TextureRegion(texture, 214, 107, 29, 16);
		xxxxButtonLockDown = new TextureRegion(texture, 243, 107, 29, 16);
		xxxxButtonLockUp.flip(false, true);
		xxxxButtonLockDown.flip(false, true);

		shuffleButtonLockedUp = new TextureRegion(texture, 214, 43, 29, 16);
		shuffleButtonLockedUp.flip(false, true);

		shuffleButtonOffUp = new TextureRegion(texture, 214, 75, 29, 16);
		shuffleButtonOffUp.flip(false, true);

		shuffleButtonOnUp = new TextureRegion(texture, 214, 59, 29, 16);
		shuffleButtonOnUp.flip(false, true);

		shuffleButtonLockedDown = new TextureRegion(texture, 243, 43, 29, 16);
		shuffleButtonLockedDown.flip(false, true);

		shuffleButtonOffDown = new TextureRegion(texture, 243, 75, 29, 16);
		shuffleButtonOffDown.flip(false, true);

		shuffleButtonOnDown = new TextureRegion(texture, 243, 59, 29, 16);
		shuffleButtonOnDown.flip(false, true);

		ready = new TextureRegion(texture, 59, 83, 34, 7);
		ready.flip(false, true);

		retry = new TextureRegion(texture, 59, 110, 33, 7);
		retry.flip(false, true);

		gameOver = new TextureRegion(texture, 59, 92, 46, 7);
		gameOver.flip(false, true);

		scoreboard = new TextureRegion(texture, 374, 86, 97, 37);
		scoreboard.flip(false, true);

		star = new TextureRegion(texture, 415, 73, 10, 10);
		noStar = new TextureRegion(texture, 428, 73, 10, 10);

		star.flip(false, true);
		noStar.flip(false, true);

		highScore = new TextureRegion(texture, 59, 101, 48, 7);
		highScore.flip(false, true);

		zbLogo = new TextureRegion(texture, 0, 55, 128, 24);
		zbLogo.flip(false, true);

		mountain = new TextureRegion(texture, 0, 28, 136, 15);
		mountain.flip(false, true);
		cloud1 = new TextureRegion(texture, 136, 0, 136, 43);
		cloud1.flip(false, true);
		cloud2 = new TextureRegion(texture, 272, 0, 136, 43);
		cloud2.flip(false, true);
		cloud3 = new TextureRegion(texture, 272, 43, 136, 43);
		cloud3.flip(false, true);

		mountainf = new TextureRegion(mountain);
		mountainf.flip(true, false);
		cloud1f = new TextureRegion(cloud1);
		cloud1f.flip(true, false);
		cloud2f = new TextureRegion(cloud2);
		cloud2f.flip(true, false);
		cloud3f = new TextureRegion(cloud3);
		cloud3f.flip(true, false);

		grassL = new TextureRegion(texture, 0, 43, 136, 11);
		grassL.flip(false, true);
		grassR = new TextureRegion(texture, 0, 43, 136, 11);
		grassR.flip(true, true);

		birdDown = new TextureRegion(texture, 272, 98, 17, 12);
		birdDown.flip(false, true);

		bird = new TextureRegion(texture, 289, 98, 17, 12);
		bird.flip(false, true);

		birdUp = new TextureRegion(texture, 306, 98, 17, 12);
		birdUp.flip(false, true);

		TextureRegion[] birds = { birdDown, bird, birdUp };
		birdAnimation = new Animation(0.10f, birds);
		birdAnimation.setPlayMode(Animation.LOOP_PINGPONG);

		bird2 = new TextureRegion(bird);
		bird2.flip(true, false);
		birdDown2 = new TextureRegion(birdDown);
		birdDown2.flip(true, false);
		birdUp2 = new TextureRegion(birdUp);
		birdUp2.flip(true, false);

		TextureRegion[] birds2 = { birdDown2, bird2, birdUp2 };
		birdAnimation2 = new Animation(0.10f, birds2);
		birdAnimation2.setPlayMode(Animation.LOOP_PINGPONG);

		skullUp = new TextureRegion(texture, 328, 100, 24, 14);
		// Create by flipping existing skullUp
		skullDown = new TextureRegion(skullUp);
		skullDown.flip(false, true);

		bar = new TextureRegion(texture, 352, 100, 22, 3);
		bar.flip(false, true);

		dead = Gdx.audio.newSound(Gdx.files.internal("data/dead.wav"));
		flap = Gdx.audio.newSound(Gdx.files.internal("data/flap.wav"));
		coin = Gdx.audio.newSound(Gdx.files.internal("data/coin.wav"));
		fall = Gdx.audio.newSound(Gdx.files.internal("data/fall.wav"));
		powerUpSound = Gdx.audio.newSound(Gdx.files
				.internal("data/powerup.wav"));

		font = new BitmapFont(Gdx.files.internal("data/text.fnt"));
		font.setScale(.25f, -.25f);

		whiteFont = new BitmapFont(Gdx.files.internal("data/whitetext.fnt"));
		whiteFont.setScale(.1f, -.1f);

		shadow = new BitmapFont(Gdx.files.internal("data/shadow.fnt"));
		shadow.setScale(.25f, -.25f);

		// Create (or retrieve existing) preferences file
		prefs = Gdx.app.getPreferences("ZombieBird");

		if (!prefs.contains("highScoreEasy")) {
			prefs.putInteger("highScoreEasy", 0);
		}
		if (!prefs.contains("highScoreHard")) {
			prefs.putInteger("highScoreHard", 0);
		}
		if (!prefs.contains("highScoreInsane")) {
			prefs.putInteger("highScoreInsane", 0);
		}
		if (!prefs.contains("timesPlayed")) {
			prefs.putInteger("timesPlayed", 0);
		}
	}

	public static int getTimesPlayed() {
		return prefs.getInteger("timesPlayed");
	}

	public static void setTimesPlayed(int val) {
		prefs.putInteger("timesPlayed", val);
		prefs.flush();
	}

	public static void setHighScoreAll() {
		prefs.putInteger("highScoreEasy", 0);
		prefs.flush();
		prefs.putInteger("highScoreHard", 0);
		prefs.flush();
		prefs.putInteger("highScoreInsane", 0);
		prefs.flush();
	}

	public static void setHighScore(int val) {
		if (InputHandler.state == 0) {
			prefs.putInteger("highScoreEasy", val);
			prefs.flush();
		} else if (InputHandler.state == 1) {
			prefs.putInteger("highScoreHard", val);
			prefs.flush();
		} else {
			prefs.putInteger("highScoreInsane", val);
			prefs.flush();
		}
	}

	public static int getHighScore() {
		if (InputHandler.state == 0) {
			return prefs.getInteger("highScoreEasy");
		} else if (InputHandler.state == 1) {
			return prefs.getInteger("highScoreHard");
		} else {
			return prefs.getInteger("highScoreInsane");
		}
	}

	public static int getHighScoreEasy() {
		return prefs.getInteger("highScoreEasy");
	}

	public static int getHighScoreHard() {
		return prefs.getInteger("highScoreHard");
	}

	public static void dispose() {
		// We must dispose of the texture when we are finished.
		texture.dispose();
		logoTexture.dispose();

		// Dispose sounds
		dead.dispose();
		flap.dispose();
		coin.dispose();
		fall.dispose();

		font.dispose();
		shadow.dispose();
	}

}