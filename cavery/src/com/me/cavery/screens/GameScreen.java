/**
 * 
 */
package com.me.cavery.screens;

import com.badlogic.gdx.Screen;
import com.me.cavery.manager.GameInputManager;

/**
 * @author Sparky
 *
 */
public class GameScreen implements Screen {
	
	
	private boolean isPaused;
	private GameInputManager input;
	
	
	public GameScreen(GameInputManager input){
		isPaused = false;
		this.input = input;
	}
	
	
	public void update(){
		
	}

	
	@Override
	public void render(float delta) {
	
	}

	
	@Override
	public void resize(int width, int height) {
		

	}

	
	@Override
	public void show() {
		

	}

	
	@Override
	public void hide() {
		

	}

	
	@Override
	public void pause() {
		
		isPaused = true;

	}


	@Override
	public void resume() {
		
		isPaused = false;

	}

	
	@Override
	public void dispose() {
		

	}

}
