/**
 * 
 *
 */
package fr.openClassrooms.tp;

/**
 * @author franck Desmedt
 *
 */
public class StringUtilsQuestion5 {
//concateanates the given array of strings
//	question 5/29 test codingame Java Sql

//	static String[] a = { "f", "o", "o", "bar" };

	public static String concat(String[] strings) {
//		StringBuffer buffer = new StringBuffer();

		/*
		 * Le tampon est déclarer et initialiser vide, pas besoin de faire new String()
		 * c'est implicite.
		 */
		String chaineConcat = "";
		String[] a = { "f", "o", "o", "bar", " desmedt" };
		/*
		 * Pour tous les String de la liste a ... qui prend le nom de 'chaine' lors de
		 * la lecture.
		 */
		for (String i : a) {
//			chaineConcat=chaineConcat+i;
			chaineConcat += i;
		}
		System.out.println(chaineConcat);
		// Je retourne le tampon.
		return chaineConcat;
	}

//version sans les commentaires
	public static String concat3(String[] strings) {
		String chaineConcatene = "";
		String[] a = { "fr", "a", "n", "ck", " desmedt" };
		for (String i : a) {
//			chaineConcat=chaineConcat+i;
			chaineConcatene += i;
		}
		System.out.println(chaineConcatene);
		return chaineConcatene;

	}

//pour aller plus loin
	public static String concat2() {
		int monTab[] = new int[8];

		int nb = -10;
		for (int val : monTab) {
			System.out.println(nb);
			nb++;
			val++;
		}
		;

		int montab2[] = new int[5];
		int val2 = 10;
		for (int i : montab2) {
			System.out.println(val2++);

		}
		return null;
	}

}
//System.out.println(StringUtils.concat(a));
