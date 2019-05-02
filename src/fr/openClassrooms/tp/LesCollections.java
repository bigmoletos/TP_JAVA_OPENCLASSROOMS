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
			System.out.println("�l�ment � l'index " + i + " = " + l.get(i));

		System.out.println("\n \tParcours avec un it�rateur ");
		System.out.println("-----------------------------------");
		ListIterator li = l.listIterator();

		while (li.hasNext())
			System.out.println(li.next());

		System.out.println("\n \tParcours avec un arrayList ");
		System.out.println("-----------------------------------");

		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une cha�ne de caract�res !");
		al.add(12.20f);
		al.add('d');

		for (int i = 0; i < al.size(); i++) {
			System.out.println("donn�e � l'indice " + i + " = " + al.get(i));
//			add() permet d'ajouter un �l�ment ;
//
//			get(int index) retourne l'�l�ment � l'indice demand� ;
//
//			remove(int index) efface l'entr�e � l'indice demand� ;
//
//			isEmpty() renvoie � vrai � si l'objet est vide ;
//
//			removeAll() efface tout le contenu de l'objet ;
//
//			contains(Object element) retourne � vrai � si l'�l�ment pass� en param�tre 
//			est dans l'ArrayList.

			System.out.println("\n \tParcours avec un map Hashtable ");
			System.out.println("-----------------------------------");

			Hashtable ht = new Hashtable();
			ht.put(1, "printemps");
			ht.put(10, "�t�");
			ht.put(12, "automne");
			ht.put(45, "hiver");

			Enumeration e = ht.elements();

			while (e.hasMoreElements())
				System.out.println(e.nextElement());
//		    isEmpty() retourne � vrai � si l'objet est vide ;
//
//		    contains(Object value) retourne � vrai � si la valeur est pr�sente. Identique � containsValue(Object value) ;
//
//		    containsKey(Object key) retourne � vrai � si la cl� pass�e en param�tre est pr�sente dans la Hashtable ;
//
//		    put(Object key, Object value) ajoute le couple key - value dans l'objet ;
//
//		    elements() retourne une �num�ration des �l�ments de l'objet ;
//
//		    keys() retourne la liste des cl�s sous forme d'�num�ration.

			System.out.println("\n \tParcours avec un map HashMap ");
			System.out.println("-----------------------------------");

			System.out.println("\n \tParcours avec un set HashSet");
			System.out.println("-----------------------------------");

			HashSet hs = new HashSet();
			hs.add("toto");
			hs.add(12);
			hs.add('d');
//lecture des donn�es via un iterator
			System.out.println("\nlecture des donn�es via un iterator");
			System.out.println("-----------------------------------");
			Iterator it = hs.iterator();
			while (it.hasNext())
				System.out.println(it.next());

			System.out.println("\nParcours avec un tableau d'objet");
			System.out.println("-----------------------------------");

			Object[] obj = hs.toArray();
			for (Object o : obj)
				System.out.println(o);

//			add() ajoute un �l�ment ;
//
//			contains(Object value) retourne � vrai � si l'objet contient value ;
//
//			isEmpty() retourne � vrai � si l'objet est vide ;
//
//			iterator() renvoie un objet de type Iterator ;
//
//			remove(Object o) retire l'objet o de la collection ;
//
//			toArray() retourne un tableau d'Object.

			System.out.println("\nParcours avec un arrayList et la g�n�r�cit�");
			System.out.println("-----------------------------------");

			System.out.println("Liste de String");
			System.out.println("------------------------------");
			List<String> listeString = new ArrayList<String>();
			listeString.add("Une cha�ne");
			listeString.add("Une autre");
			listeString.add("Encore une autre");
			listeString.add("Allez, une derni�re");

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

	// Avec cette m�thode, on accepte aussi bien les collections de Voiture que les
	// collection de VoitureSansPermis
	static void affiche(List<? super Voiture> list) {
		for (Object v : list)
			System.out.print('\n' + v.toString());
	}

////		La g�n�ricit� est un concept tr�s utile pour d�velopper des objets travaillant 
//		avec plusieurs types de donn�es.
////
////		Vous passerez donc moins de temps � d�velopper des classes traitant de fa�on 
//		identique des donn�es diff�rentes.
////
////		La g�n�ricit� permet de r�utiliser sans risque le polymorphisme avec les collections.
////
////		Cela conf�re plus de robustesse � votre code.
////
////		Vous pouvez coupler les collections avec la g�n�ricit� !
////
////		Le wildcard (?) permet d'indiquer que n'importe quel type peut �tre trait� et donc accept� !
////
//		
////		D�s que le wildcard (?) est utilis�, cela revient � rendre ladite collection 
//		en lecture seule !
////
////		Vous pouvez �largir le champ d'acceptation d'une collection g�n�rique gr�ce 
//		au mot-cl� extends.
////
////		L'instruction ? extends MaClasse autorise toutes les collections de classes 
//		ayant pour supertype MaClasse.
////
////		L'instruction ? super MaClasse autorise toutes les collections de classes ayant 
//		pour type MaClasse et tous ses supertypes !
////
////		Pour ce genre de cas, les m�thodes g�n�riques sont particuli�rement adapt�es et 
//		permettent d'utiliser le polymorphisme dans toute sa splendeur !
//	}

}
