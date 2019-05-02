package fr.openClassrooms.tp;

import java.util.Scanner;

/**
 * 
 *
 */

/**
 * @author franck Desmedt
 *
 */
public class TpJava1 {
	/**
	 * @description module openclassrooms sur les boucles
	 *              https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20841-les-boucles
	 *
	 * @return void
	 *
	 * @method doubleBoucle
	 * @class DoubleWhile
	 * @version 1.0
	 * @date lundi 19 nov. 2018
	 * @see
	 *
	 **/
	public void doubleBoucle() {
//		System.out.println("double boucle while avec scanner ");
		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O') {
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");
			// Sans ça, nous n'entrerions pas dans la deuxième boucle
			reponse = ' ';

			// Tant que la réponse n'est pas O ou N, on repose la question
			while (reponse != 'O' && reponse != 'N') {
				// On demande si la personne veut faire un autre essai
				System.out.println("Voulez-vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
				// Affichage de n lignes
				int a = 0, n = 15;
				while (++a < n)
					System.out.println("coucou " + a + " fois !!");
			}
		}
		System.out.println("Au revoir…");
		System.out.println("\nfin \n ");
//		System.out.println("\nfin double boucle while avec scanner ");
	}

	/**
	 * @description module openclassrooms sur les boucles
	 *              https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20841-les-boucles
	 *
	 * @return void
	 *         https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20841-les-boucles
	 * @method boucleDoWhile
	 * @class OpenClassRoomsApprendreProgrammationJava
	 * @version 1.0
	 * @date lundi 19 nov. 2018
	 * @see
	 *
	 **/
	public void boucleDoWhile() {
		String prenom = new String();
		// Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
		char reponse = ' ';

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");
			// On vide la ligne avant d'en lire une autre
			sc.nextLine();
			do {
				System.out.println("Voulez-vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			} while (reponse != 'O' && reponse != 'N');

		} while (reponse == 'O');

		System.out.println("Au revoir…");
		System.out.println("\nfin \n ");
	}

	/**
	 * @description module openclassrooms sur les boucles
	 *              https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20841-les-boucles
	 *
	 * @return void
	 *
	 * @method boucleFor
	 * @class OpenClassRoomsApprendreProgrammationJava
	 * @version 1.0
	 * @param indice1, int indice2
	 * @date mardi 20 nov. 2018
	 * @see
	 *
	 **/
	public void boucleFor() {
//		indice1 = 0;
//		indice2 = 0;
		for (int indice1 = 0, indice2 = 2; (indice1 < 10 && indice2 < 6); indice1++, indice2 += 2) {
			// for (int indice1 = 0, indice2 = 2; (indice1 < 10 && indice2 < 6); indice1++,
			// indice2 += 2) {
			System.out.println("indice1 = " + indice1 + ", indice2 = " + indice2);
			System.out.println("\nfin \n ");
		}
	}

}
