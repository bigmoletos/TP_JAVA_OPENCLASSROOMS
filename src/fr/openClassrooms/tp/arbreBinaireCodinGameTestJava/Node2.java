/**
 * https://www.developpez.net/forums/d1779011/java/general-java/creation-d-arbre-binaire-java/
 * http://www-sop.inria.fr/lemme/personnel/Guillaume.Dufay/MASS2/tp11/Arbre.java
 *http://www-sop.inria.fr/oasis/personnel/Guillaume.Dufay/MASS2/tp11/index.html
 *http://gallium.inria.fr/~maranget/X/421/poly/arbre-bin.html
 */
package fr.openClassrooms.tp.arbreBinaireCodinGameTestJava;

import java.io.File;

import fr.openClassrooms.tp.arbreBinaire.Pile;

/**
 * @author franck Desmedt question 19 testCodingame JAva SQL
 *
 */
public class Node2 {

	// keep these fiedls

	//////////////////////////

	private Node2 gauche;
	private Node2 droit;
	int value;

	//////////////////////
	int element;

//		 constructeur
	/**
	 * 
	 */
	public Node2() {
		value = 0;
		gauche = null;
		droit = null;

	}

// surcharge constructeur
	/**
	 * @param g
	 * @param c
	 * @param d
	 */
	public Node2(Node2 g, int c, Node2 d) {
		gauche = g;
		value = c;
		droit = d;
	}

	public static void creerNode() {
		Node2 A;
		Node2 racine;
		int value = 0;
		int element;
		int x;
		// arbre vide
		racine = new Node2(null, value, null);

	}

	////////////////////////////
//	L’arbre de	la figure 5.1 est créé par
	public static void representeArbreEx() {
		Node2 A;
		Node2 racine;
		int value = 0;
		int element;
		int x;
		racine = new Node2(
				new Node2(new Node2(null, 3, null), 5,
						new Node2(new Node2(new Node2(null, 6, null), 8, null), 12, new Node2(null, 13, null))),
				20, new Node2(new Node2(null, 21, null), 25, new Node2(null, 28, null)));
	}

	/////////////////////////
//	fonctions caractérisent les arbres: composer, cle, gaucheauche, droitroit. Elles s’implantent facilement:

	static Node2 composer(Node2 g, int c, Node2 d) {
		return new Node2(g, c, d);
	}

	static int cle(Node2 a) {
		return a.value;
	}

	static Node2 gaucheauche(Node2 a) {
		return a.gauche;
	}

	static Node2 droitroit(Node2 a) {
		return a.droit;
	}
//		Les quatre fonctions sont liées par les équations suivantes:

//		cle(composer(g, c, d))	= c 	 	 	 	 	 	 	 	 	 
//		gaucheauche(composer(g, c, d))	= g 	 	 	 	 	 	 	 	 	 
//		droitroit(composer(g, c, d))	= d 	 	 	 	 	 	 	 	 	 
//		composer(gaucheauche(a), cle(a), droitroit(a))	= a;   (a ≠ null)	 

	static void parcoursPréfixe(Node2 a) {
		if (a == null)
			return;
		System.out.print(a.value + " ");
		parcoursPréfixe(a.gauche);
		parcoursPréfixe(a.droit);
	}

	static void parcoursInfixe(Node2 a) {
		if (a == null)
			return;
		parcoursInfixe(a.gauche);
		System.out.print(a.value + " ");
		parcoursInfixe(a.droit);
	}

	static void parcoursSuffixe(Node2 a) {
		if (a == null)
			return;
		parcoursSuffixe(a.gauche);
		parcoursSuffixe(a.droit);
		System.out.print(a.value + " ");
	}

	/**
	 * Le parcours en largeur d’un Node binaire s’écrit simplement avec une file. Le
	 * parcours préfixe s’écrit lui aussi simplement de manière itérative, avec une
	 * pile. Nous reprenons les classes Pile et File du chapitre 1, sauf que ce
	 * sont, cette fois-ci, des piles ou des files d’arbres. On écrit alors
	 *
	 *
	 */

	static void parcoursPréfixeI(Node2 a) {
		if (a == null)
			return;
		Pile p = new Pile();
		p.ajouter(a);
		while (!p.estVide()) {
			a = p.valeur();
			p.supprimer();
			System.out.print(a.value + " ");
			if (a.droit != null)
				p.ajouter(a.droit);
			if (a.gauche != null)
				p.ajouter(a.gauche);
		}
	}

	static void parcoursLargeurI(Node2 a) {
		if (a == null)
			return;
		File f = new File();
		f.ajouter(a);
		while (!f.estVide()) {
			a = f.valeur();
			f.supprimer();
			System.out.print(a.value + " ");
			if (a.gauche != null)
				f.ajouter(a.gauche);
			if (a.droit != null)
				f.ajouter(a.droit);
		}
	}

}
////////////////////////////

//profondeur 100 000, racine=0
// small;// noeud racine de l'arbre (2,5,6,7,8,9,13,17,16)
// large;// noeud racine d'un arbre de 100 000 noeuds, noeud le plus éloigné=0
//	Node n=small.find(8);
//	System.out.println("find returns "+ n.value);//	on doit obtenir 8
//	Node n=large.find(0);
//	System.out.println("find returns "+ n.value);//	on doit obtenir 0
