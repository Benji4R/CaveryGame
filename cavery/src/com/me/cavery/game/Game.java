package com.me.cavery.game;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GL11;
import com.badlogic.gdx.graphics.GL20;
import com.me.cavery.enums.GameState;
import com.me.cavery.logger.GameLogger;

/**
 * 
 * Die Game Komponentenklasse stellt die direkte Schnittstelle zum Spiel dar.
 * Sie enthält alle Manager und alle Mehoden zur Darstellung des Spieles.
 * 
 * */
public class Game {

	//-----------------------------------------------------------------------------
	//	Definitionen
	//-----------------------------------------------------------------------------

	private float windowWidth;
	private float windowHeight;
	
	private GameState gameState;
	private GameLogger logger;
	
	private boolean runOnMobileDevice;
	private boolean isGL11Available;
	private boolean isGL20Available;
	
	
	

	//-----------------------------------------------------------------------------
	//	Konstruktor(en)
	//-----------------------------------------------------------------------------
	
	/**
	 * Erstellt ein neues Game Object
	 * */
	public Game() {
		this.windowWidth = 0.0f;
		this.windowHeight = 0.0f;
		gameState = GameState.INIT;
		logger = new GameLogger("gamelog.txt");
		runOnMobileDevice = (Gdx.app.getType() == ApplicationType.Android) || (Gdx.app.getType() == ApplicationType.iOS);
		logger.instance.writeLine("RUN ON MOBILE: "+runOnMobileDevice);
		isGL11Available = Gdx.graphics.isGL11Available();
		isGL20Available = Gdx.graphics.isGL20Available();
		logger.instance.writeLine("GL11 AVAILABLE: "+isGL11Available);
		logger.instance.writeLine("GL20 AVAILABLE: "+isGL20Available);

	}

	//-----------------------------------------------------------------------------
	//	Methoden
	//-----------------------------------------------------------------------------

	/**
	 * Initialisiert das Spiel und alle Manager.
	 * */
	public void initialize(float winWidth,float winHeight) {
		this.windowWidth = winWidth;
		this.windowHeight = winHeight;
	}

	/**
	 * Aktualisiert das Spiel bzw. den Lifecycle.
	 * */
	public void update() {

	}

	/**
	 * Zeichnet das aktuelle Spiel,Menü,...
	 * */
	public void render() {

		Gdx.gl.glClearColor(0,0,0, 1);
		
		if(isGL11Available){
			Gdx.gl.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		}else if(isGL20Available){
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		}else{
			Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		}
			


	}

	/**
	 * Pausiert das Spiel
	 * */
	public void pause() {

	}


	/**
	 * Lässt das Spiel aus dem pausiertem Zustand fortfahren.
	 * */
	public void resume() {

	}


	/**
	 * Beendet das Spiel
	 * */
	public void exit() {

	}

}
