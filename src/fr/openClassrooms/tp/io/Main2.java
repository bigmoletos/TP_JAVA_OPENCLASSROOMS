/**
 * 
 *
 */
package fr.openClassrooms.tp.io;

import java.io.File;

/**
 * @author franck Desmedt
 *
 */
public class Main2 {

	/**
	 * @description
	 *
	 * @return void liste tous les fichiers à la racine des disques durs du PC
	 * @method main
	 * @class Main2
	 * @version 1.0
	 * @date mercredi 20 févr. 2019
	 * @see
	 *
	 **/
	public static void main(String[] args) {

		// Création de l'objet File
		File f = new File("fichierTest.txt");
		// File file2 = new f.listRoots();
		// File listeFichiers = new file2.listFiles();
		System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
		System.out.println("Affichage des fichiers du repertoire en cours : " + f.listFiles());
		System.out.println("Nom du fichier : " + f.getName());
		System.out.println("Est-ce qu'il existe ? " + f.exists());
		System.out.println("Est-ce un répertoire ? " + f.isDirectory());
		System.out.println("Est-ce un fichier ? " + f.isFile());

		System.out.println("Affichage des lecteurs à la racine du PC : ");
		for (File file : f.listRoots()) {
			System.out.println(file.getAbsolutePath());
			try {
				int i = 1;
				// On parcourt la liste des fichiers et répertoires
				for (File nom : file.listFiles()) {
					// S'il s'agit d'un dossier, on ajoute un "/"
					System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));

					if ((i % 4) == 0) {
						System.out.print("\n");
					}
					i++;
				}
				System.out.println("\n");
			} catch (NullPointerException e) {
				// L'instruction peut générer une NullPointerException
				// s'il n'y a pas de sous-fichier !
			}
		}

	}

	/**
	 * @description
	 *
	 * @method listFiles
	 * @class Main2
	 * @version 1.0
	 * @date mercredi 20 févr. 2019
	 * @see
	 *
	 **/
//	private static void listFiles() {
//		File file = null;
//		for (File nom : file.listFiles()) {
//			// S'il s'agit d'un dossier, on ajoute un "/"
//			System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName() + "/" : nom.getName()));
//		//return null;
//	}

}
