package com.moustacheapps.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Scrollable {
	
	
	// Protected is similar to private, but allows inheritance by subclasses.
	protected Vector2 position;
	protected Vector2 velocity;
	protected Vector2 acceleration;
	protected int width;
	protected int height;
	protected boolean isScrolledLeft, isScrolledRight;

	public Scrollable(float x, float y, int width, int height, float scrollSpeed) {
		position = new Vector2(x, y);
		velocity = new Vector2(scrollSpeed, 0);
		this.width = width;
		this.height = height;
		isScrolledLeft = false;
		isScrolledRight = false;
	}

	public void update(float delta, int type) {
		if (type == 1) {
			position.add(velocity.cpy().scl(delta));

		// If the Scrollable object is no longer visible:
			if (position.x + width < 136) {
				isScrolledLeft = true;
			}
		} else {
			position.sub(velocity.cpy().scl(delta));
			
			if (position.x > 136) {
				isScrolledRight = true;
			}
		}
	}

	// Reset: Should Override in subclass for more specific behavior.
	public void reset(float newX, int type) {
		position.x = newX;
		if(type == 1) {
			isScrolledLeft = false;
		} else {
			isScrolledRight = false;
		}
	}
	
	public void setVelocityX(int x) {
		velocity.x = x;
	}
	
	public void setX(float x) {
		position.x = x;
	}

	public void stop() {
		velocity.x = 0;
	}
	
	public boolean isScrolledRight() {
		return isScrolledRight;
	}
	
	
	public void toggleScrolledLeft() {
		if (isScrolledLeft) {
			isScrolledLeft = false;
		} else {
			isScrolledLeft = true;
		}
	}

	// Getters for instance variables
	public boolean isScrolledLeft() {
		return isScrolledLeft;
	}

	public float getTailX(int type) {
		if (type == 1) {
			return position.x + width;
		} else {
			return position.x - width;
		}
	}

	public float getX() {
		return position.x;
	}

	public float getY() {
		return position.y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public Vector2 getVelocity() {
		return velocity;
	}

}
