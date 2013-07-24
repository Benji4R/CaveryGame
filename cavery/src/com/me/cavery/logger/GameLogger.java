/**
 * 
 */
package com.me.cavery.logger;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

/**
 * 
 * Stellt Methoden zum Loggen von Meldungen die während
 * des Spieles erzeugt werden.
 * 
 * @author Toni
 *
 */
public class GameLogger {

	private FileHandle handle;	
	
	public static GameLogger instance;
	
	public GameLogger(String filename){
		this.instance = this;
		
		handle = Gdx.files.local(filename);
		handle.writeString("GAMELOGFILE:"+"\r\n", false);
	}
	
	public void writeLine(String message){
		if(handle != null){
			handle.writeString(message+"\r\n", true);
		}
	}
	
}
