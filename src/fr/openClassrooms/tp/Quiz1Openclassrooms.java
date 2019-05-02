/**
 * 
 *
 */
package fr.openClassrooms.tp;

/**
 * @author franck Desmedt apprenez-a-programmer-en-jav quizz 1 openclassrooms
 *         https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/exercises/99
 */
public class Quiz1Openclassrooms {
	public static void main(String[] args) {
//quizz 1 apprenez-a-programmer-en-jav
//		openclassroom https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/exercises/99
//		question 14
		int a = 10, b = 20;

		int max = (a < b) ? ((b < 20) ? b * 2 : ((b > 20) ? b % 3 : b / 4)) : ((a == 10) ? a / 2 : a % 3);

		System.out.println("question 14, la valeur de max est :" + max);
//		Le résultat vaut 5. Pour bien comprendre cette condition ternaire
//		absolument imbuvable, décortiquez-la ainsi :
//
//			 int max; 
//			 if (a < b){
//			 	 if(b < 20)
//			  	 max = b*2; 
//			  	else{ 
//			  	 if(b > 20)
//			  	  max = b % 3; 
//			   else 
//			  	 max = b / 4;
//			  } 
//			 } 
//			 else{ 
//			  	if (a == 10)
//			  	 max = a / 2;
//			 	 else 
//			  	 max = a % 3;
//			 } 
//			Avec la valeur de a et b, nous arrivons à l’instruction max = b / 4; 		

//		question 16		
		int i = 0, nbre = 0;
		while (i <= 9) {
			for (int j = 0; j < 10; j++)
				nbre++;

			i++;
		}
		System.out.println("question 16, le resultat est :" + nbre);
//		Nous avons ici deux boucles imbriquées l’une dans l’autre. 
//		La première doit faire 10 tours ( <= 9 donne 10 tours de boucle) et la seconde, idem, 
//		10 tours de boucle (< 10 donne 10 tours de boucle). 
//		Nous incrémentons notre variable à chaque tour de boucle, 
//		ce qui nous donne 10 tours * 10 tours soit 100 !

//		question 20
		String tab[][] = { { "toto", "titi", "tutu" }, { "tata", "tete", "tyty" } };

		for (String str[] : tab) {
			for (String str2 : str) {
				System.out.println("question 20 La valeur est  = " + str2);
			}

		}
//		Il s’agit ici d’une boucle for façon Java 7… Ce code fonctionne 
//		parfaitement et affichera l’intégralité du tableau bidimensionnel.

	}
}
