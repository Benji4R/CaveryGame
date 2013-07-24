package com.me.cavery;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.me.cavery.game.Game;

public class CaveryApp implements ApplicationListener {

	private Game game;

	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();		

		game = new Game();
		game.initialize(w,h);


	}

	@Override
	public void dispose() {

		game.exit();

	}

	@Override
	public void render() {	
		game.render();
	}

	@Override
	public void resize(int width, int height) {

		game.update();
	}

	@Override
	public void pause() {

		game.pause();
	}

	@Override
	public void resume() {

		game.resume();

	}
}
