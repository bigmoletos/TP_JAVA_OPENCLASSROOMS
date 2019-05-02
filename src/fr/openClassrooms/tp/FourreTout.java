
package fr.openClassrooms.tp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class FourreTout {

	/**
	 * 
	 * @description
	 *
	 * @return double
	 *
	 * @method ScannerClavierDouble
	 * @class FourreTout
	 * @version 1.0
	 * @date dimanche 25 nov. 2018
	 * @see
	 *
	 *
	 */
	public double ScannerClavierDouble() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez la temperature: ");
		double temperatureSaisie = scanner.nextDouble();
		// On vide la ligne avant d'en lire une autre pour eviter une erreur
		// java.lang.StringIndexOutOfBoundsException : String index out of range: 0
		scanner.nextLine();
		return temperatureSaisie;
	}

	/**
	 * cette fonction est inutilisée
	 * 
	 * @description
	 *
	 * @return reponse
	 *
	 * @method ScannerClavier
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 **/
	public char ScannerClavierChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez la temperature: ");
		char reponse = scanner.nextLine().charAt(0);
//On vide la ligne avant d'en lire une autre pour eviter une erreur
		// java.lang.StringIndexOutOfBoundsException : String index out of range: 0
		scanner.nextLine();
		return reponse;

	}

	/**
	 * 
	 * @description
	 *
	 * @return double
	 *
	 * @method arrondi
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @param temperatureConvertie
	 * @param chiffreApresLaVirgulePourArrondir
	 * @date vendredi 23 nov. 2018
	 * @see
	 *
	 *
	 */
	public static double arrondi(double temperatureConvertie, int chiffreApresLaVirgulePourArrondir) {
		// cast en double apres cast en int
		// temperatureConvertieArrondie = null;
		// temperatureConvertieArrondie = ((int) (temperatureConvertie * Math.pow(10,
		// chiffreApresLaVirgulePourArrondir)
		// + 0.5)) / Math.pow(10, chiffreApresLaVirgulePourArrondir);

		double temperatureConvertieArrondie = 0;
		return temperatureConvertieArrondie;
	}

	/**
	 * @description permet de saisir une ligen entrée au clavier
	 * @return void
	 *
	 * @method saiseLigneTexte
	 * @class FourreTout
	 * @version 1.0
	 * @date mardi 27 nov. 2018
	 * @see
	 *
	 **/
	public void saiseLigneTexte() {
		// Declaration lecture saisie clavier
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String choixConversion2 = ""; // init
		System.out.println(
				"Choissisez votre mode de convertion:\n" + "tapez 1 pour convertir les °C Celsus en °F Fahrenheit  \n"
						+ "tapez 2 pour convertir les °F Fahrenheit en Celsus °C ");
		try {

			choixConversion2 = keyboard.readLine();// Recup du texte
		} catch (IOException e) {
			System.out.println("err");
		}
		System.out.println("vous avez fait le choix: " + choixConversion2);

	}

	/**
	 * @description formatage du resultat avec arrondi puis cast en double
	 * @return double temperatureConvertieArrondie
	 *
	 * @method arrondi2
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date dimanche 25 nov. 2018
	 * @see Double.parseDouble(temperatureConvertieRound.replace(",", "."));1
	 * @see NumberFormat
	 * @see NumberFormat nf = new DecimalFormat("0.###")
	 *
	 **/
	private double arrondi2(double temperature) {
		// temperatureConvertie = 12.12345678;
		int temperatureConvertieArrondie = 0;

		NumberFormat nf = new DecimalFormat("#.##");
		nf.setRoundingMode(RoundingMode.HALF_UP);
		String temperatureConvertieRound = nf.format(temperature);
		// temperatureConvertieArrondie =
		// Double.parseDouble(temperatureConvertieRound.replace(",", "."));

		return temperatureConvertieArrondie;

	}

	/**
	 * @description
	 *
	 * @return void
	 *
	 * @method arrondi3
	 * @class ConvertisseurCelsiusFahrenheit
	 * @version 1.0
	 * @date dimanche 25 nov. 2018
	 * @see
	 *
	 **/
	private void arrondi3(double temperatureConvertie) {
		// double temperatureConvertieArrondie = null;
		// String temperature = null;
		// temperature = "0.222";
		BigDecimal temperatureConvertieArrondie = (new BigDecimal(temperatureConvertie)).setScale(3,
				BigDecimal.ROUND_CEILING);
		double temperatureConvertieArrondie2 = temperatureConvertieArrondie.doubleValue();
		BigDecimal bd = null; // the value you get
		double d = bd.doubleValue(); // The double you want
		System.out.println("arrondi avec roun-ceiling    " + temperatureConvertie + " :  "
				+ temperatureConvertieArrondie.toString());
		// return temperatureConvertieArrondie;
	}

}
