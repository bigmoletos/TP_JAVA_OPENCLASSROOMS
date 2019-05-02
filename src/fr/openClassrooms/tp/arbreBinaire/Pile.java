/**
 * 
 *
 */
package fr.openClassrooms.tp.arbreBinaire;

import fr.openClassrooms.tp.arbreBinaireCodinGameTestJava.Node2;

/**
 * @author franck Desmedt
 *
 */
public class Pile {
	/**
	 * La pile est representee par un tableau ou les elements de la pile y sont
	 * rajoutes a la fin taille_courante est la taille actuelle de la pile
	 */
	int contenu[];
	int taille_courante;

	public static final int taille_max = 50;

	/**
	 * Contruit une pile vide pouvant contenir taille_max elements
	 */
	public Pile() {
		contenu = new int[taille_max];
		taille_courante = 0;
	}

	/**
	 * @return une String representant le contenu de la pile
	 */
	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < taille_courante - 1; i++)
			s += contenu[i] + ",";
		if (taille_courante > 0)
			s += contenu[taille_courante - 1];
		s += "]";
		return (s);
	}

	/**
	 * @return un booleen indiquant si la pile est vide
	 */
	public boolean estVide() {
		return (taille_courante == 0);
	}

	/**
	 * @return un booleen indiquant si la pile est pleine
	 */
	public boolean estPleine() {
		return (taille_courante == taille_max);
	}

	/**
	 * Rajoute un element dans la pile Cet element est ajoute a la fin du tableau
	 * 
	 * @param a element a rajouter dans la pile
	 */
	public void ajouter(Node2 a) {
		if (!estPleine()) {
			// contenu[taille_courante] = a;
			taille_courante++;
		}
	}

	/**
	 * Retire un element de la pile Cet element est retire de la fin du tableau
	 * 
	 * @return l'element retire de la pile, -1 si la pile est vide
	 */
	public int retirer() {
		if (!estVide()) {
			taille_courante--;
			return contenu[taille_courante];
		} else
			return -1;
	}

	/**
	 * @description
	 *
	 * @return Node2
	 *
	 * @method valeur
	 * @class Pile
	 * @version 1.0
	 * @date jeudi 02 mai 2019
	 * @see
	 *
	 **/
	public Node2 valeur() {
		System.out.println("affiche valeur noeud");
		return null;
	}

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method supprimer
	 * @class Pile
	 * @version 1.0
	 * @date jeudi 02 mai 2019
	 * @see
	 *
	 **/
	public void supprimer() {
		System.out.println("supprime valeur noeud");

	}
}
