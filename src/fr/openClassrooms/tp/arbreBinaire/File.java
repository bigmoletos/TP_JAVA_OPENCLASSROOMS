/**
 * 
 *
 */
package fr.openClassrooms.tp.arbreBinaire;

/**
 * @author franck Desmedt
 *
 */
public class File {
	/**
	 * La file est representee par un tableau ou les elements de la file y sont
	 * rajoutes a la fin et retires au debut taille_courante est la taille actuelle
	 * de la file
	 */
	int contenu[];
	int taille_courante;

	public static final int taille_max = 50;

	/**
	 * Contruit une file vide pouvant contenir taille_max elements
	 */
	File() {
		contenu = new int[taille_max];
		taille_courante = 0;
	}

	/**
	 * @return une String representant le contenu de la file
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
	 * @return un booleen indiquant si la file est vide
	 */
	public boolean estVide() {
		return (taille_courante == 0);
	}

	/**
	 * @return un booleen indiquant si la file est pleine
	 */
	public boolean estPleine() {
		return (taille_courante == taille_max);
	}

	/**
	 * Rajoute un element dans la file Cet element est ajoute a la fin du tableau
	 * 
	 * @param i element a rajouter dans la file
	 */
	public void ajouter(int i) {
		if (!estPleine()) {
			contenu[taille_courante] = i;
			taille_courante++;
		}
	}

	/**
	 * Retire un element de la file Cet element est retire du debut du tableau Tous
	 * les elements sont alors decales vers la gauche dans le tableau
	 * 
	 * @return l'element retire de la file, -1 si la file est vide
	 */
	public int retirer() {
		if (!estVide()) {
			int elem = contenu[0];
			for (int i = 1; i < taille_courante; i++)
				contenu[i - 1] = contenu[i];
			taille_courante--;
			return elem;
		} else
			return -1;
	}
}
