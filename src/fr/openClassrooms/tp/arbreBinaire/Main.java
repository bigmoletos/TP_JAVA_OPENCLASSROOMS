/**
 * 
 *
 */
package fr.openClassrooms.tp.arbreBinaire;

/**
 * @author franck Desmedt
 *
 */
public class Main {

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method main
	 * @class Main
	 * @version 1.0
	 * @date mercredi 06 mars 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		Arbre b = new Arbre(2, new Arbre(1), new Arbre(4, new Arbre(3), new Arbre(5)));
		Arbre c = new Arbre(10, new Arbre(8), new Arbre(12));
		Arbre a = new Arbre(6, b, c);

		System.out.println("L'arbre a est " + a);
		System.out.println("Le parcours infixe de l'arbre a donne :");
		a.ParcoursPrefixe();
		System.out.println("Le parcours infixe de l'arbre a donne :");
		a.ParcoursInfixe();
		System.out.println("Le parcours postfixe de l'arbre a donne :");
		a.ParcoursPostfixe();
		System.out.println("Le parcours en largeur de l'arbre a donne :");
		a.ParcoursLargeur();
		System.out.println("L'arbre a est-il egal a lui-meme? " + Arbre.arbresEgaux(a, a));
		System.out.println("Les arbres a et b sont-ils egaux? " + Arbre.arbresEgaux(a, b));
		System.out.println("La hauteur de l'arbre a est " + Arbre.hauteur(a));
		System.out.println("L'arbre a est-il un ABR? " + Arbre.estABR(a));
		System.out.println("7 est-il present dans a? " + a.recherche(7));
		System.out.println("12 est-il present dans a? " + a.recherche(12));
		a.insertion(7);
		System.out.println("Le resultat de l'ajout de 7 dans a " + a);
	}

}
