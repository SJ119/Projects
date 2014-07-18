package com.moustacheapps.gameobjects;

import java.util.Random;

import com.moustacheapps.gameworld.*;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;

public class Pipe extends Scrollable {

	private Random r;

	private Rectangle skullUp, skullDown, barUp, barDown;

	public static final int SKULL_WIDTH = 24;
	public static final int SKULL_HEIGHT = 11;
	public float gapSpace;
	private float groundY;

	private boolean isScored = false;

	// When Pipe's constructor is invoked, invoke the super (Scrollable)
	// constructor
	public Pipe(float x, float y, int width, int height, float scrollSpeed,
			float gapSpace, float groundY) {
		super(x, y, width, height, scrollSpeed);
		// Initialize a Random object for Random number generation
		r = new Random();
		skullUp = new Rectangle();
		skullDown = new Rectangle();
		barUp = new Rectangle();
		barDown = new Rectangle();
		this.gapSpace = gapSpace;

		this.groundY = groundY;
	}

	public float getGapSpace() {
		return this.gapSpace;
	}

	public void setGapSpace(int space) {
		this.gapSpace = space;
	}

	@Override
	public void update(float delta, int type) {
		// Call the update method in the superclass (Scrollable)
		super.update(delta, type);

		// The set() method allows you to set the top left corner's x, y
		// coordinates,
		// along with the width and height of the rectangle

		barUp.set(position.x, position.y, width, height);
		barDown.set(position.x, position.y + height + gapSpace, width, groundY
				- (position.y + height + gapSpace));

		// Our skull width is 24. The bar is only 22 pixels wide. So the skull
		// must be shifted by 1 pixel to the left (so that the skull is centered
		// with respect to its bar).

		// This shift is equivalent to: (SKULL_WIDTH - width) / 2
		skullUp.set(position.x - (SKULL_WIDTH - width) / 2, position.y + height
				- SKULL_HEIGHT, SKULL_WIDTH, SKULL_HEIGHT);
		skullDown.set(position.x - (SKULL_WIDTH - width) / 2, barDown.y,
				SKULL_WIDTH, SKULL_HEIGHT);

	}

	@Override
	public void reset(float newX, int type) {
		// Call the reset method in the superclass (Scrollable)
		super.reset(newX, type);
		// Change the height to a random number
		height = r.nextInt(((int) GameWorld.getMidPointY() * 2)
				- ((int) getGapSpace()) - 33) + 11;
		isScored = false;
	}

	public void onRestart(float x, int type, float scrollSpeed) {
		velocity.x = scrollSpeed;
		reset(x, type);
	}

	public Rectangle getSkullUp() {
		return skullUp;
	}

	public Rectangle getSkullDown() {
		return skullDown;
	}

	public Rectangle getBarUp() {
		return barUp;
	}

	public Rectangle getBarDown() {
		return barDown;
	}

	public boolean collides(Bird bird) {
		if (position.x < bird.getX() + bird.getWidth()) {
			return (Intersector.overlaps(bird.getBoundingCircle(), barUp)
					|| Intersector.overlaps(bird.getBoundingCircle(), barDown)
					|| Intersector.overlaps(bird.getBoundingCircle(), skullUp) || Intersector
						.overlaps(bird.getBoundingCircle(), skullDown));
		}
		return false;
	}

	public boolean isScored() {
		return isScored;
	}

	public void setScored(boolean b) {
		isScored = b;
	}

}
