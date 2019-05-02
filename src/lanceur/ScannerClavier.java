package lanceur;
import fr.openClassrooms.tp.TpJava1;

/**
 * @author franck Desmedt
 *
 */
public class ScannerClavier {

	/**
	 * @description module openclassrooms sur les boucles
	 *              https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20841-les-boucles
	 * @return void
	 *
	 * @method main
	 * @class ScannerClavier
	 * @version 1.0
	 * @date lundi 19 nov. 2018
	 * @see
	 *
	 **/
	public static void main(String[] args) {
		System.out.println("double boucle while avec scanner ");
		TpJava1 firtsWhile = new TpJava1();
//		System.out.println("\nfin double boucle while avec scanner ");
		firtsWhile.doubleBoucle();
		System.out.println("double do while avec scanner ");
		firtsWhile.boucleDoWhile();
//		System.out.println("\nfin \n ");
	}

}
