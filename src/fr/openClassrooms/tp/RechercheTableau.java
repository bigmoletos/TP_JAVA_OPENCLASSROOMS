/**
 * 
 *
 */
package fr.openClassrooms.tp;

import java.util.Arrays;

/**
 * @author franck Desmedt
 *
 */
public class RechercheTableau {

	static boolean exists(int[] ints, int k) {

		for (int i = 0; i < ints.length; i++) {
			if (k == ints[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @description autre méthode avec Arrays.binarySearch ne fonctionne qu'avec un
	 *              tableau trié par ordre croissant
	 * @return boolean
	 *
	 * @method exists2
	 * @class RechercheTableau
	 * @version 1.0
	 * @date mardi 30 avr. 2019
	 * @see
	 *
	 **/
// autre méthode avec Arrays.binarySearch
	static public boolean exists2(int[] ints, int k) {
		// k=Integer.valueOf(ints[k]);
		// return Arrays.toString(ints).contains(k);
		// return Arrays.toString(ints).contains(k);
		// return Arrays.binarySearch(ints, k);
		for (int i = 0; i < ints.length; i++) {
			if (Arrays.binarySearch(ints, k) >= 0) {
				return true;
			}
		}
		return false;

	}

	/**
	 * @description autre méthode avec un for(int i: tableau) ou for(String
	 *              i:tableau),ne pas oublier le i++
	 *
	 * @return boolean
	 *
	 * @method exists3
	 * @class RechercheTableau
	 * @version 1.0
	 * @date mardi 30 avr. 2019
	 * @see
	 *
	 **/
// autre méthode 
	static public boolean exists3(int[] ints, int k) {
		// k=Integer.valueOf(ints[k]);
		// return Arrays.toString(ints).contains(k);
		// return Arrays.toString(ints).contains(k);
		// return Arrays.binarySearch(ints, k);
		for (int i : ints) {
			if (Arrays.binarySearch(ints, k) >= 0) {
				return true;
			}
			i++;
		}
		return false;

	}

	/**
	 * @description La recherche dichotomique ('recherche binaire', 'binary search')
	 *              Lors de la recherche dans un tableau de 1 048 576 éléments: le
	 *              pire des cas pour la recherche séquentielle peut entraîner 1 048
	 *              576 exécutions de la boucle. le pire des cas pour la recherche
	 *              dichotomique peut entraîner 20 exécutions de la boucle.
	 * @return boolean
	 *
	 * @method exists4
	 * @class RechercheTableau
	 * @version 1.0
	 * @param ints
	 * @param k
	 * @date mardi 30 avr. 2019
	 * @see
	 *
	 **/
//autre methode dichotomique 

	static public boolean exists4(int[] ints, int k) {
		int pivot = 0;
		int borneSuperieur = ints.length - 1;
		// int borneSuperieur = 4;
		int borneInferieur = 0;
		int position = -1;
		System.out.printf("methode exist4\nborneSuperieur " + borneSuperieur + "\nborneInferieur " + borneInferieur
				+ "\nposition " + position + " \npivot " + pivot + " \nvaleur " + k);
		/* Recherche de la position de la valeur */
		while ((borneInferieur <= borneSuperieur) && (position == -1)) {

			// for (int i : ints) {
			pivot = (borneSuperieur + borneInferieur) / 2;
			System.out.printf(" \npivot " + pivot + " \nvaleur " + k);
			if (k < ints[pivot]) {
				borneSuperieur = pivot - 1;
				System.out.printf("\nborneSuperieur " + borneSuperieur + "\n");
			} else if (k > ints[pivot]) {
				borneInferieur = pivot + 1;
				System.out.printf("\nborneInferieur " + borneInferieur + "\n");
			} else {
				position = pivot;
				System.out.printf(" \npivot " + pivot + " \n ");
			}
		}
		/* Edition du résultat */
		if (position == -1) {
			System.out.printf("La valeur recherchée ne se trouve pas dans le tableau.\n");
			return false;
		} else {
			System.out.printf("La valeur %d se trouve à la position %d. \n", k, position);
			return true;
		}
	}

	public static boolean isTwin(String a, String b) {
		a = "Hello";
		b = "world";
//		for (int i = 0; i < a; i++) {
//
//		}

		return false;
	}

	// question 22
//	static int closestToZero(int[] ints) {
//		int result = 0;
//		int plusProche=0;
//		
//		
//		for (int i : ints) {
//if() {
//			
//			
//		}
//		return result;
//	}

	/**
	 * @description programme principal lance les methodes exists
	 *
	 * @return void
	 *
	 * @method main
	 * @class RechercheTableau
	 * @version 1.0
	 * @date mardi 30 avr. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ints = { -9, 14, 37, 102, 110, 235, 236, 237, 238, 1500 };

		System.out.println("exists1 : " + RechercheTableau.exists(ints, 102)); // true
		System.out.println("exists1 : " + RechercheTableau.exists(ints, 36)); // false
		System.out.println("exists2 : " + RechercheTableau.exists2(ints, 0)); // false
		System.out.println("exists2 : " + RechercheTableau.exists2(ints, 37)); // false
		System.out.println("exists3 : " + RechercheTableau.exists3(ints, 0)); // false
		System.out.println("exists3 : " + RechercheTableau.exists3(ints, 37)); // false
		System.out.println("exists4 : " + RechercheTableau.exists4(ints, 2)); // false
		System.out.println("exists4 : " + RechercheTableau.exists4(ints, 1500)); // false

	}

}
