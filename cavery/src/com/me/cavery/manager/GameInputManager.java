/**
 * 
 */
package com.me.cavery.manager;

import com.badlogic.gdx.InputProcessor;

/**
 * @author Toni
 *
 */
public class GameInputManager implements InputProcessor {
	
	
	private static String availableKeyCard ="ABCDEFGHIJKLMNOPQRSTUVWXYZ<>+-/?$():;,_-";	
	
	
	public static GameInputManager instance;
	
	public GameInputManager(){
		instance = this;
	}	

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#keyDown(int)
	 */
	@Override
	public boolean keyDown(int keycode) {		
		for (int i = 0; i < availableKeyCard.length(); i++) {
			if(availableKeyCard.getBytes()[i] == keycode)
				return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#keyUp(int)
	 */
	@Override
	public boolean keyUp(int keycode) {
		for (int i = 0; i < availableKeyCard.length(); i++) {
			if(availableKeyCard.getBytes()[i] == keycode)
				return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#keyTyped(char)
	 */
	@Override
	public boolean keyTyped(char character) {
		for (int i = 0; i < availableKeyCard.length(); i++) {
			if(availableKeyCard.getBytes()[i] == character)
				return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#touchDown(int, int, int, int)
	 */
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#touchUp(int, int, int, int)
	 */
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#touchDragged(int, int, int)
	 */
	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#mouseMoved(int, int)
	 */
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		
		return false;
	}

	/* (non-Javadoc)
	 * @see com.badlogic.gdx.InputProcessor#scrolled(int)
	 */
	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
