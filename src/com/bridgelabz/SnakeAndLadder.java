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
	 * The Player then checks for a Option. They are No Play, Ladder or Snake. - Use ((RANDOM)) to check for
	 */
	public static void main(String[] args) {
	final int noOfPlayer=1;
	int position =0;
	int diceno =0;
	int checkForOption;
	//  for dice
	Random r = new Random();
	diceno =r.nextInt(6)+1;
	System.out.println("diceno"+diceno);
	
	// for option
	Random r1 = new Random();
	checkForOption = r1.nextInt(2);
	System.out.println("option"+checkForOption);
	if(checkForOption == 0) {
		System.out.println("NO PLAY");
		position = 0;
		System.out.println("position"+position);
	}else if(checkForOption == 1) {
		System.out.println("LADDER");
		position= position+diceno;
		System.out.println("position"+position);
	}else if(checkForOption == 2){
		System.out.println("SNAKE");
		position= position+diceno;
		System.out.println("position"+position);
	}

	}

}
