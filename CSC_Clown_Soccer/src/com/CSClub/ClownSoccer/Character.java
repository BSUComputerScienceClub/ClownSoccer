package com.CSClub.ClownSoccer;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.math.*;
public class Character{
	//global instance vars
	private BodyDef bdef = new BodyDef();
	private Vector2 currentPos;
	/** Character Constructor
	 * Creates a character object which has a world (current level), starting position, physical body, and graphical interface/animations. Like a player or enemy
	 * @param world The level that the character is being made in. usually the currentWorld of a given Application page
	 * @param pos
	 */
	public Character(World world, Vector2 pos) 
	{
		bdef.position.set(pos);
		bdef.active = true;
		bdef.fixedRotation = true;
		bdef.type = BodyDef.BodyType.DynamicBody;
		world.createBody(bdef);
		
	}

}
