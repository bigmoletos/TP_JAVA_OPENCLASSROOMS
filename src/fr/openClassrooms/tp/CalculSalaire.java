/**
 * @description codingame test java débutant
 *
 */
package fr.openClassrooms.tp;

/**
 * @author franck Desmedt
 *
 */
public class CalculSalaire {

	/**
	 * 
	 */
	public static double CalculSalaire(int nbHeures, int montantHoraire) {
		// TODO Auto-generated constructor stub
		double salaire = 0;
		if (nbHeures < 159) {

			salaire = nbHeures * montantHoraire;

		} else if (nbHeures > 160 && nbHeures < 199) {

			salaire = 160 * montantHoraire + (nbHeures - 160) * montantHoraire * 1.25;

		} else if (nbHeures > 200) {

			salaire = 160 * montantHoraire + (nbHeures - 200) * montantHoraire * 1.5 + 40 * montantHoraire * 1.25;
			// salaire=montantHoraire((nbHeures-200)*1.5+40*1.25);
		}

		System.out.println("salaire: " + salaire + " €");
		//
		return salaire;
	}

	/**
	 * @description https://www.codingame.com/playgrounds/18287/java---les-bases/exercices-p3
	 * @return void
	 *
	 * @method main
	 * @class CalculSalaire
	 * @version 1.0
	 * @date lundi 29 avr. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {

		CalculSalaire(0, 1);
		CalculSalaire(150, 1);
		CalculSalaire(161, 1);
		CalculSalaire(210, 1);
	}

}
