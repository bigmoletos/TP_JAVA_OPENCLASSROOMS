/**
 * tp openClassrooms apprendre à programmer en java, Tp convertisseur celsus fahrenheit
 *
 */
package fr.openClassrooms.tp;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author franck Desmedt
 *
 */
public class ConvertisseurCelsiusFahrenheit {

	/**
	 * Constantes
	 */
	double temperatureSaisie = 0;
	double temperatureConvertie = 0;
	static double temperatureConvertieArrondie;
	char reponse;
	int chiffreApresLaVirgule = 2;
	Scanner scanner;
	int choixConversion;

	/**
	 * @description
	 *
	 * @method menuConvert
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public void menuConvert() {

		Scanner scanner = new Scanner(System.in);
		do {
			while (choixConversion != 1 && choixConversion != 2) {
				choixConversion = saisieClavierintChoixConversion();

				// if (!scanner.hasNextInt()) {
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				// scanner.nextLine();
				if (choixConversion == 1) {
					System.out.println("Veuillez entrer la température en °C Celsus");
					temperatureSaisie = saisieClavierDoubleValeurTps();
					temperatureConvertie = convertCelsiusFahrenheit();
					System.out.printf("%.3f\t °C Celsus est équivalent à  %.3f\t °F Fahrenheit\n", temperatureSaisie,
							temperatureConvertieArrondie);
					/**
					 * On vide la ligne avant d'en lire une autre pour eviter une erreur
					 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
					 * peut aussi mettre nextLine()
					 **/
					scanner.nextLine();
				} else if (choixConversion == 2) {
					System.out.println("Veuillez entrer la température en °F Fahrenheit");
					temperatureSaisie = saisieClavierDoubleValeurTps();

					temperatureConvertie = convertFahrenheitCelsus();
					System.out.printf("%.3f\t °F Fahrenheit est équivalent à  %.3f\t °C Celsus\n", temperatureSaisie,
							temperatureConvertieArrondie);
					/**
					 * On vide la ligne avant d'en lire une autre pour eviter une erreur
					 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
					 * peut aussi mettre nextLine() avec ,next() le programme ne fonctionne plus
					 **/
					scanner.nextLine();
				}
				// do {
				// System.out.println("Souhaitez-vous convertir une autre température? O/N");
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				// scanner.nextLine();
				// avec charAt(0) on ne saisi que un seul caractére
//					reponse = scanner.nextLine().charAt(0);
				// mettre un caractere type char en majuscule
//					reponse = Character.toUpperCase(reponse);
				saisieClavierCharOuiNon();
				System.out.println("votre reponse est: " + reponse);
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				// scanner.next();
				// if (reponse != 'O' && reponse != 'N' && reponse != ' ') {
				// if (line != null && line.length() > 0) {
				/**
				 * On vide la ligne avant d'en lire une autre pour eviter une erreur
				 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0 on
				 * peut aussi mettre nextLine()
				 **/
				scanner.nextLine();
				// } while (reponse != 'O' && reponse != 'N');
			}
		} while (reponse == 'O' && choixConversion == 1 && choixConversion == 2);

		if (scanner != null)
			scanner.close();
		System.out.println("Fin du programme \nA bientôt");
	}

	/**
	 * 
	 * 
	 * @description saisie clavier du choix du type de conversion
	 * @return int choixConversion
	 *
	 * @method ScannerClavierInt
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 2.1
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public int saisieClavierintChoixConversion() {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Choissisez votre mode de convertion:\n"
						+ "tapez 1 pour convertir les °C Celsus en °F Fahrenheit  \n"
						+ "tapez 2 pour convertir les °F Fahrenheit en Celsus °C ");
				choixConversion = scanner.nextInt();
				// System.out.println("Vous avez fait le choix: " + choixConversion);
				System.out.printf("Vous avez fait le  choix: %6d\t\t", choixConversion);
				// choixConversion = scanner.nextInt();
				// scanner.nextLine();
				if (choixConversion != 1 && choixConversion != 2) {
					System.out.println("vous ne pouvez saisir que 1 ou 2");
				}
			} catch (InputMismatchException e) {
				// choixConversion = 0;
				// scanner.nextLine();
				System.out.println("erreur de type " + e
						+ " car vous avez entré une valeur erronée \nVeuillez entrer 1 ou 2 uniquement,\n réitéré votre choix.\n");

			}

			/**
			 * On vide la ligne avant d'en lire une autre pour eviter une erreur
			 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0
			 **/
			scanner.nextLine();

			return choixConversion;

		} while (choixConversion != 1 && choixConversion != 2);
	}

	/**
	 * 
	 * 
	 * @description saisie clavier de la reponse pour O ou N pour recommencer une
	 *              nouvelle conversion
	 * @return char reponse oui ou non
	 *
	 * @method ScannerClavierInt
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 2.1
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public char saisieClavierCharOuiNon() {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Souhaitez-vous convertir une autre température? O/N");
				// scanner.nextLine();
				reponse = scanner.nextLine().charAt(0);
				// System.out.println("votre reponse en minuscule est :" + reponse);
				//// mettre un caractere type char en majuscule
				reponse = Character.toUpperCase(reponse);
				// System.out.println("Vous avez fait le choix: " + choixConversion);
				// scanner.nextLine();
				// System.out.println("votre reponse en majuscule est :" + reponse);
				if (reponse != 'O' && reponse != 'N') {
					// if (line != null && line.length() > 0) {
					// System.out.println(scanner.nextLine() + " Vous ne pouvez saisir que O ou N
					// ");
					System.out.println(" Vous ne pouvez saisir que O ou N ");
				}
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("erreur de type " + e
						+ " car vous avez entré une valeur erronée \nVeuillez entrer O ou N uniquement,\n réitéré votre choix.\n");
			}
			/**
			 * On vide la ligne avant d'en lire une autre pour eviter une erreur
			 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0
			 **/
			// scanner.nextLine();
			return reponse;
		} while (reponse != 'O' && reponse != 'N');

	}

	/**
	 * 
	 * 
	 * @description saisie clavier de la temperature
	 * @return double temperatureSaisie
	 *
	 * @method saisieClavierDoubleValeurTps
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 2.1
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public double saisieClavierDoubleValeurTps() {
		Scanner scanner = new Scanner(System.in);
		// do {
		try {
			// System.out.println("Veuillez saisir la température");
			temperatureSaisie = scanner.nextDouble();
			// System.out.println("Vous avez fait le choix: " + choixConversion);
			System.out.printf("Vous avez fait le  choix: %6d\t\t", choixConversion);
			// choixConversion = scanner.nextInt();
			// scanner.nextLine();
//				if (temperatureSaisie != 1 && temperatureSaisie != 2) {
//					System.out.println("vous ne pouvez saisir que 1 ou 2");
//				}
		} catch (InputMismatchException e) {
			// choixConversion = 0;
			// scanner.nextLine();
			System.out.println("erreur de type " + e
					+ " car vous avez entré une valeur erronée \nVeuillez entrer une valeur numérique uniquement,\n réitéré votre choix.\n");
			// return null;

		}

		/**
		 * On vide la ligne avant d'en lire une autre pour eviter une erreur
		 * java.lang.StringIndexOutOfBoundsException : String index out of range: 0
		 **/
		scanner.nextLine();

		return temperatureSaisie;

		// } while (temperatureSaisie != 1 && temperatureSaisie != 2);
	}

	/**
	 * 
	 * 
	 * /**
	 * 
	 * @description
	 *
	 * @return void
	 *
	 * @method convertCelsiusFahrenheit
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public double convertCelsiusFahrenheit() {
		temperatureConvertieArrondie = 0;
		temperatureConvertie = ((temperatureSaisie * 1.8) + 32);
		temperatureConvertieArrondie = arrondi(temperatureConvertie, chiffreApresLaVirgule);
		return temperatureConvertie;
	}

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method convertFahrenheitCelsus
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public double convertFahrenheitCelsus() {
		temperatureConvertieArrondie = 0;
		temperatureConvertie = ((temperatureSaisie - 32) * 5) / 9;
		temperatureConvertieArrondie = arrondi(temperatureConvertie, chiffreApresLaVirgule);
		return temperatureConvertie;
	}

	/**
	 * 
	 * @description arrondi en utilisant Bigdecimal et setScale
	 * @return double
	 *
	 * @method arrondi
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @param temperatureConvertie
	 * @param chiffreApresLaVirgule
	 * @date dimanche 25 nov. 2018
	 * @see
	 *
	 *
	 */
	public double arrondi(double temperatureConvertie, int chiffreApresLaVirgule) {
		BigDecimal bd = new BigDecimal(temperatureConvertie);
		bd = bd.setScale(chiffreApresLaVirgule, BigDecimal.ROUND_DOWN);
		temperatureConvertieArrondie = bd.doubleValue();
		return temperatureConvertieArrondie;
	}
}
