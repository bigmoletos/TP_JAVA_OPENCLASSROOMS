/**
 * 
 *
 */
package fr.openClassrooms.tp;

/**
 * @author franck Desmedt
 *
 */

/**
 * 
 */

public class Apple {

	static int bites = 0;

	public void takeBite() {
		bites++;
	}

	public static void main(String[] args) {
		// Instantiate red and green apples for our example public class
		Apple macintosh = new Apple();
		Apple grannySmith = new Apple();

		// Take a bite out of each of the two apples
		macintosh.takeBite();
		grannySmith.takeBite();

		// Display the contents of each class
		System.out.println("The Macintosh apple has " + macintosh.bites + " bite(s) out of it.");
		System.out.println("The Granny Smith apple has " + grannySmith.bites + " bite(s) out of it.");
	}
}
