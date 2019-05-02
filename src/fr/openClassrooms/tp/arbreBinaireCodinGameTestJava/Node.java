/**
 * @description question 23/23 du test java débutant de codin game arbre binaire
 *
 */
package fr.openClassrooms.tp.arbreBinaireCodinGameTestJava;

/**
 * @author franck Desmedt
 *
 */
public class Node {

	/**
	 * 
	 */

	// keep these​​​​​​‌​​​​‌‌‌​​‌​‌​‌​​‌​​‌​​​​ fields
	Node left, right;
	int value;

	static Node small;// noeud racine de l'arbre (2,5,6,7,8,9,13,17,16)
	static Node large;// noeud racine d'un arbre de 100 000 noeuds, noeud le plus éloigné=0
	// constructeur

	/**
	 * @param x
	 */
	public Node(int x) {
		value = x;
	}

	// surcharge construteur
	/**
	 * @param x
	 * @param left
	 * @param Right
	 */
	public Node(int x, Node left, Node Right) {
		value = x;
	}

	// getter
	public int getValue() {
		return value;
	}

	public Node getArbeGauche() {
		return left;
	}

	public Node getArbeRight() {
		return right;
	}

	// retourne le noeud si trouvé sinon retourne null
	public Node find(int v) {
		Node noeud = null;
		while (!(v == 0)) {
			if (value == getValue()) {

			} else {

				return null;
			}
		}
		return noeud;

	}

	// programme principal
	/**
	 * @description question 23/23 du test java débutant de codin game arbre binaire
	 *
	 * @return void
	 *
	 * @method main
	 * @class Node
	 * @version 1.0
	 * @date jeudi 02 mai 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {

		Node n = small.find(8);
		System.out.println("fin returns " + n.value);// 8

		n = large.find(0);
		System.out.println("find returns " + n.value);// 0

	}
}
