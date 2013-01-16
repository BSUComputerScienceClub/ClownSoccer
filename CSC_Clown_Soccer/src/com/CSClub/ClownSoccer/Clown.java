package com.CSClub.ClownSoccer;

import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.math.*;
/**@author Matthew Ahrens, Mathew Peltier
 * @date 1/16/13
 * @purpose provide the functionality for a basic character with specific stats
 * Written by M. Peltier, re-purposed by M. Ahrens for expandibility.
 * 
 * MP: This class just has the basic stats that the clowns will use and I'm making specialized
 * classes with augmented abilities for fast clowns killer clowns stealthy clowns and flower clowns.
 */
public class Clown extends Character{

	/*Global variables for a basic clown */
	private int clown_speed = Constants.CLOWNSPEEDDEFAULT;
	private int clown_passballspeed= Constants.CLOWNPASSBALLSPEEDDEFAULT;
	private int clown_kickinggoalspeed= Constants.CLOWNKICKINGGOALSPEEDDEFAULT;
	private int clown_attack= Constants.CLOWNATTACKDEFAULT;
	
	private boolean clown_stunned=false;
	private boolean clown_invisable=false;
	//It's gonna take 4 clown attacks in order to destroy a clown. (which will be replaced within a minute of game time.
	int clown_hitpoints = Constants.CLOWNHITPOINTSDEFAULT;
	
	
    //================================================================================
    // Constructor(s)
    //================================================================================

	/** Clown
	 * The basic player and AI class. Takes position, image, animation, and level data from abstracted "Character class"
	 * Contains all the stat data of a particular character type: speed, accuracy, power, etc.
	 * Extend this class for specific types of clowns.
	 * @param world - The current level that the clown is called into
	 * @param pos - that starting position of the clown
	 */
	public Clown(World world, Vector2 pos)
	{
		super(world,pos);
	}
	
    //================================================================================
    // Getters and Setters
    //================================================================================

	public void setSpeed(int speed)
	{
		this.clown_speed = speed;
	}
	public void setPassBallSpeed(int speed)
	{
		this.clown_passballspeed = speed;
	}
	public void setKickingGoalSpeed(int speed)
	{
		this.clown_kickinggoalspeed = speed;
	}
	public void setAttack(int attack)
	{
		this.clown_attack = attack;
	}
	public void setHitPoints(int hp)
	{
		this.clown_hitpoints = hp;
	}
	
	public int getSpeed()
	{
		return this.clown_speed;
	}
	public int getPassBallSpeed()
	{
		return this.clown_passballspeed;
	}
	public int getKickingGoalSpeed()
	{
		return this.clown_kickinggoalspeed;
	}
	public int getAttack()
	{
		return this.clown_attack;
	}
	public int getHitPoints()
	{
		return this.clown_hitpoints;
	}
    //================================================================================
    // Play Logic
    //================================================================================

}
