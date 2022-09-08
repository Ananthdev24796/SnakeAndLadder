/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author Iam_A
 *
 */
public class SnakeAndLadder {

	/**
	 * UC3
	 * The Player then checks for a Option. They are No Play, Ladder or Snake. - Use ((RANDOM)) to check for
	 */
	public static void main(String[] args) {
	final int noOfPlayer=1;
	int position =0;
	int diceno =0;
	int positionmoved;
	int checkForOption;
	//  for dice
	Random r = new Random();
	diceno =r.nextInt(6)+1;
	System.out.println("diceno"+diceno);
	
	// for option
	Random r1 = new Random();
	checkForOption = r1.nextInt(3);
	System.out.println("option"+checkForOption);
	if(checkForOption == 0) {
		System.out.println("NO PLAY");
		positionmoved = 0;
		System.out.println("positionMoved"+positionmoved);
	}else if(checkForOption == 1) {
		System.out.println("LADDER");
		positionmoved= position+diceno;
		System.out.println("positionMoved"+positionmoved);
	}else if(checkForOption == 2){
		System.out.println("SNAKE");
		positionmoved= position-diceno;
		System.out.println("positionMoved"+positionmoved);
	}

	}

}
