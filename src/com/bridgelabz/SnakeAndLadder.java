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
	 * UC2
	 * The Player rolls the die to get a numberbetween 1 to 6. - Use ((RANDOM)) to get the number
	 */
	public static void main(String[] args) {
	final int noOfPlayer=1;
	int startpostion =0;
	int n=0;
	Random r = new Random();
	n=r.nextInt(6)+1;

	System.out.println(n);

	}

}
