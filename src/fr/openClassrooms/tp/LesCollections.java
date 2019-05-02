/**
 * 
 *
 */
package fr.openClassrooms.tp;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author franck Desmedt
 *
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LesCollections {

	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(12);
		l.add("toto ! !");
		l.add(12.20f);

		for (int i = 0; i < l.size(); i++)
			System.out.println("Élément à l'index " + i + " = " + l.get(i));

		System.out.println("\n \tParcours avec un itérateur ");
		System.out.println("-----------------------------------");
		ListIterator li = l.listIterator();

		while (li.hasNext())
			System.out.println(li.next());

		System.out.println("\n \tParcours avec un arrayList ");
		System.out.println("-----------------------------------");

		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une chaîne de caractères !");
		al.add(12.20f);
		al.add('d');

		for (int i = 0; i < al.size(); i++) {
			System.out.println("donnée à l'indice " + i + " = " + al.get(i));
//			add() permet d'ajouter un élément ;
//
//			get(int index) retourne l'élément à l'indice demandé ;
//
//			remove(int index) efface l'entrée à l'indice demandé ;
//
//			isEmpty() renvoie « vrai » si l'objet est vide ;
//
//			removeAll() efface tout le contenu de l'objet ;
//
//			contains(Object element) retourne « vrai » si l'élément passé en paramètre 
//			est dans l'ArrayList.

			System.out.println("\n \tParcours avec un map Hashtable ");
			System.out.println("-----------------------------------");

			Hashtable ht = new Hashtable();
			ht.put(1, "printemps");
			ht.put(10, "été");
			ht.put(12, "automne");
			ht.put(45, "hiver");

			Enumeration e = ht.elements();

			while (e.hasMoreElements())
				System.out.println(e.nextElement());
//		    isEmpty() retourne « vrai » si l'objet est vide ;
//
//		    contains(Object value) retourne « vrai » si la valeur est présente. Identique à containsValue(Object value) ;
//
//		    containsKey(Object key) retourne « vrai » si la clé passée en paramètre est présente dans la Hashtable ;
//
//		    put(Object key, Object value) ajoute le couple key - value dans l'objet ;
//
//		    elements() retourne une énumération des éléments de l'objet ;
//
//		    keys() retourne la liste des clés sous forme d'énumération.

			System.out.println("\n \tParcours avec un map HashMap ");
			System.out.println("-----------------------------------");

			System.out.println("\n \tParcours avec un set HashSet");
			System.out.println("-----------------------------------");

			HashSet hs = new HashSet();
			hs.add("toto");
			hs.add(12);
			hs.add('d');
//lecture des données via un iterator
			System.out.println("\nlecture des données via un iterator");
			System.out.println("-----------------------------------");
			Iterator it = hs.iterator();
			while (it.hasNext())
				System.out.println(it.next());

			System.out.println("\nParcours avec un tableau d'objet");
			System.out.println("-----------------------------------");

			Object[] obj = hs.toArray();
			for (Object o : obj)
				System.out.println(o);

//			add() ajoute un élément ;
//
//			contains(Object value) retourne « vrai » si l'objet contient value ;
//
//			isEmpty() retourne « vrai » si l'objet est vide ;
//
//			iterator() renvoie un objet de type Iterator ;
//
//			remove(Object o) retire l'objet o de la collection ;
//
//			toArray() retourne un tableau d'Object.

			System.out.println("\nParcours avec un arrayList et la générécité");
			System.out.println("-----------------------------------");

			System.out.println("Liste de String");
			System.out.println("------------------------------");
			List<String> listeString = new ArrayList<String>();
			listeString.add("Une chaîne");
			listeString.add("Une autre");
			listeString.add("Encore une autre");
			listeString.add("Allez, une dernière");

			for (String str : listeString)
				System.out.println(str);

			System.out.println("\nListe de float");
			System.out.println("------------------------------");

			List<Float> listeFloat = new ArrayList<Float>();
			listeFloat.add(12.25f);
			listeFloat.add(15.25f);
			listeFloat.add(2.25f);
			listeFloat.add(128764.25f);

			for (float f : listeFloat)
				System.out.println(f);

			System.out.println("\nParcours avec la genericite et le wildcard ?");
			System.out.println("------------------------------");

			// Liste de voiture
			List<Voiture> listVoiture = new ArrayList<Voiture>();
			listVoiture.add(new Voiture());
			listVoiture.add(new Voiture());

			List<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>();
			listVoitureSP.add(new VoitureSansPermis());
			listVoitureSP.add(new VoitureSansPermis());

			affiche(listVoiture);
			// affiche(listVoitureSP);
		}
	}

	// Avec cette méthode, on accepte aussi bien les collections de Voiture que les
	// collection de VoitureSansPermis
	static void affiche(List<? super Voiture> list) {
		for (Object v : list)
			System.out.print('\n' + v.toString());
	}

////		La généricité est un concept très utile pour développer des objets travaillant 
//		avec plusieurs types de données.
////
////		Vous passerez donc moins de temps à développer des classes traitant de façon 
//		identique des données différentes.
////
////		La généricité permet de réutiliser sans risque le polymorphisme avec les collections.
////
////		Cela confère plus de robustesse à votre code.
////
////		Vous pouvez coupler les collections avec la généricité !
////
////		Le wildcard (?) permet d'indiquer que n'importe quel type peut être traité et donc accepté !
////
//		
////		Dès que le wildcard (?) est utilisé, cela revient à rendre ladite collection 
//		en lecture seule !
////
////		Vous pouvez élargir le champ d'acceptation d'une collection générique grâce 
//		au mot-clé extends.
////
////		L'instruction ? extends MaClasse autorise toutes les collections de classes 
//		ayant pour supertype MaClasse.
////
////		L'instruction ? super MaClasse autorise toutes les collections de classes ayant 
//		pour type MaClasse et tous ses supertypes !
////
////		Pour ce genre de cas, les méthodes génériques sont particulièrement adaptées et 
//		permettent d'utiliser le polymorphisme dans toute sa splendeur !
//	}

}
