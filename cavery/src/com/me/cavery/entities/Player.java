/**
 * 
 */
package com.me.cavery.entities;

import com.badlogic.gdx.math.Vector3;

/**
 * @author Sparky
 *
 */
public class Player {
	
	//-----------------------------------------------------------------------------
	//	Definitionen
	//-----------------------------------------------------------------------------

	public Vector3 position;
	public float rotationX = 0.0f;
	public float rotationY = 0.0f;
	public float rotationZ = 0.0f;
	public String name;
	public int id;
	
	//-----------------------------------------------------------------------------
	//	Konstruktor(en)
	//-----------------------------------------------------------------------------

	public Player(){
		this(new Vector3(),"Player_default",-1);	
	}
	
	public Player(Vector3 pos,String name,int id)
	{
		this.position = pos;
		this.name = name;
		this.id = id;
	}

	//-----------------------------------------------------------------------------
	//	Methoden
	//-----------------------------------------------------------------------------

	
	public void rotateX(float amount){
		this.rotationX = amount;
	}
	public void rotateY(float amount){
		this.rotationY = amount;
	}
	public void rotateZ(float amount){
		this.rotationZ = amount;
	}
	public void setPosX(float x){
		this.position.x = x;
	}
	public void setPosY(float y){
		this.position.y = y;
	}
	public void setPosZ(float z){
		this.position.z = z;
	}


}
