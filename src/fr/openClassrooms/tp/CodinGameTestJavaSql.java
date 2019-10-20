/**
 * 
 *
 */
package fr.openClassrooms.tp;

import java.util.ArrayList;

/**
 * @author franck Desmedt apprenez-a-programmer-en-jav quizz 2 openclassrooms
 *         https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/exercises/99
 */
public class CodinGameTestJavaSql {
	public static void main(String[] args) {
//quizz 2 apprenez-a-programmer-en-jav
//		openclassroom https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/exercises/99
//		question

		System.out.println(" #------------------------------------------------------------\r\n"
				+ "  # requetes 28/29\r\n"
				+ "#  selectionner les clients ayanat un code postal égal à 7500 ou 3400 et ayant une date de naissance définie\r\n"
				+ "  #------------------------------------------------------------\r\n" + " \r\n" + " SELECT \r\n"
				+ "   lastname,\r\n" + "   firstname,\r\n" + "   zipcode,\r\n" + "   birth_date,    \r\n"
				+ "   IFNULL('non renseingée', 0) AS print_0_if_null\r\n" + "FROM\r\n" + "    customer C;\r\n" + " \r\n"
				+ " \r\n" + "  select\r\n" + "  lastname, firstname, zipcode,birth_date\r\n" + "  from customer C\r\n"
				+ "-- where  zipcode IN (75000,34000)  #ok\r\n" + "-- where   zipcode like 75000 or like 34000\r\n"
				+ "where zipcode=75000 or zipcode=34000\r\n" + " and birth_date IS NOT NULL ;\r\n" + " \r\n"
				+ "--  IFNULL('toto', 0) AS print_0_if_null\r\n" + "\r\n"
				+ "   #------------------------------------------------------------\r\n" + "  # requetes 27/29\r\n"
				+ "#  selectionner les nom et prenoms des clients dont le nom commence par P\r\n"
				+ "#trié dans l'ordre des noms et des prenoms\r\n"
				+ "  #------------------------------------------------------------\r\n" + " \r\n"
				+ "  select lastname, firstname\r\n" + "  from customer\r\n" + "  where lastname like 'P%'\r\n"
				+ "  order by \r\n" + "  lastname asc,\r\n" + "  firstname ASC;\r\n" + "  \r\n" + "  \r\n"
				+ "#------------------------------------------------------------\r\n" + "# requetes 26/29\r\n"
				+ "#  selectionner la liste du nombre de clients par ville, selectionner uniquement les villes qui comptent au moins 2 clients \r\n"
				+ "#------------------------------------------------------------\r\n" + " \r\n" + "  SELECT \r\n"
				+ "    city,\r\n" + "    COUNT(customer_id) AS customer_count\r\n" + "FROM\r\n" + "    customer\r\n"
				+ " group BY city \r\n" + " having customer_count>1\r\n" + ";\r\n" + " \r\n"
				+ "#------------------------------------------------------------\r\n" + "# requetes 25/29\r\n"
				+ "#  selectionner les clients customer n'ayant aucun ordre d'achat associé dans purchase_order\r\n"
				+ "#------------------------------------------------------------\r\n" + " \r\n" + "SELECT \r\n"
				+ "  lastname,\r\n" + "   C.customer_id\r\n" + " -- PO.customer_id\r\n" + "FROM\r\n" + "customer C \r\n"
				+ "left  join \r\n" + "purchase_order PO\r\n" + "  on C.customer_id = PO.customer_id\r\n"
				+ " WHERE     PO.customer_id is null\r\n" + " \r\n" + "  ;\r\n" + "\r\n"
				+ "#------------------------------------------------------------\r\n" + "# requetes 24/29\r\n"
				+ "#  indiquer ce qui qualifie le mieux la colonne customer_id de la table purchase_id\r\n"
				+ "#------------------------------------------------------------\r\n" + "-- au choix \r\n"
				+ "-- clé primaire\r\n" + "-- index\r\n" + "-- blob\r\n" + "-- *****cle etrangére ****\r\n" + "\r\n"
				+ "#------------------------------------------------------------\r\n" + "# requetes 23/29\r\n"
				+ "#  commande pour ajouter une ligne\r\n"
				+ "#------------------------------------------------------------\r\n"
				+ "-- ******insert******  insert into table (col1, col2, col3) values (1, 2, 3);\r\n" + "-- upsate\r\n"
				+ "-- add\r\n" + "-- more\r\n" + "\r\n" + "\r\n"
				+ "#------------------------------------------------------------\r\n" + "# requetes 22/29\r\n"
				+ "#  pour supprimer une table\r\n"
				+ "#------------------------------------------------------------\r\n" + "-- ******drop table*******\r\n"
				+ "-- truncate table\r\n" + "-- delete table\r\n" + "-- remove table\r\n" + "\r\n" + "\r\n"
				+ "#------------------------------------------------------------\r\n" + "# requetes 21/29\r\n"
				+ "# quelle commande SQL permet d'effacer les lignes d'une table\r\n"
				+ "#------------------------------------------------------------\r\n" + "-- remove from table where\r\n"
				+ "-- update table remove where\r\n" + "-- ********delete from table where********\r\n"
				+ "-- drop from table where\r\n" + "\r\n" + "\r\n"
				+ "#------------------------------------------------------------\r\n" + "# requetes 20/29\r\n"
				+ "#  liste des villes de la table clients sans doublon triés par ordre alphabetique\r\n"
				+ "#------------------------------------------------------------\r\n" + "\r\n" + "select distinct \r\n"
				+ "city\r\n" + "from customer\r\n" + "order by city asc;");
		System.out.println("############################");
		System.out.println("question  19/29 ");
		System.out.println("############################");
		// NodeQuestion19 n = new NodeQuestion19();
		// n = small.find(8);

//		System.out.println("find returns " + n.value);

		// n = large.find(0);
		// System.out.println("find returns " + n.value);

		System.out.println("############################");
		System.out.println("question  18/29 ");
		System.out.println("############################");

		System.out.println("############################");
		System.out.println("question  17/29 ");
		System.out.println("############################");
		System.out.println("c'est un singleton");
		System.out.println("############################");
		System.out.println("question  16/29 ");
		System.out.println("############################");
		System.out.println(" Test Planet.MERCURY == Planet.VENUS: ");
		if (Planet.MERCURY == Planet.VENUS) {
			System.out.println("vrai");
		} else {
			System.out.println("faux");
		}
		System.out.println(" Test Planet.MERCURY == Planet.MERCURY: ");

		if (Planet.MERCURY == Planet.MERCURY) {
			System.out.println("vrai");
		} else {
			System.out.println("faux");
		}
		System.out.println(" Test Planet.MERCURY.equals(Planet.MERCURY): ");
		if (Planet.MERCURY.equals(Planet.MERCURY)) {
			System.out.println("vrai");
		} else {
			System.out.println("faux");
		}
		System.out.println("############################");
		System.out.println("question  14/29 \t");
		System.out.println("############################");

		System.out.println(CounterQuestion14.increment());
		System.out.println(CounterQuestion14.increment2());
		System.out.println(CounterQuestion14.increment3());
		System.out.println(
				"il faut rajouter synchronized dans la methode  \n" + " public static synchronized int increment2()");

		System.out.println("############################");
		System.out.println("question  13/29 ");
		System.out.println("############################");

		ArrayList<Integer> liste = new ArrayList<Integer>(2);
		liste.add(1);
		liste.add(1);
		liste.add(1);

		System.out.println("renvoie le nombre d'entrées dans le tableau soit 3 = " + liste.size());
		System.out.println("############################");
		System.out.println("question  12/29 ");
		System.out.println("############################");
		int i = 0;

		System.out.println("le resultat de i++ est: " + i++);

		System.out.println("############################");
		System.out.println("question  11/29 ");
		System.out.println("############################");
		System.out.println("pour faire une instance d'un autre type il faut que la classe b extends la A "
				+ "/n public class B extends A {" + "constructeur" + "public B(){" + "super();}"
				+ "surcharge constructeur B" + "public B(a){" + "super(a);}" + "//getter" + "public int getter(){"
				+ "return this.b;}" + "//setter" + "public void setter (int a, int b){" + " super.setter(a);"
				+ "this.b=b;}");
		System.out.println("public class A {\r\n" + "\r\n" + "  private int a;\r\n" + "\r\n"
				+ "  public A() { //constructeur 1\r\n" + "    System.out.println(\"Création de A\");\r\n" + "  }\r\n"
				+ "\r\n" + "  public A(int a) { //constructeur 2 par surcharge\r\n" + "    this.a = a;\r\n"
				+ "    System.out.println(\"Création de A\");\r\n" + "  }\r\n" + "\r\n" + "  public int getter() {\r\n"
				+ "    return this.a;\r\n" + "  }\r\n" + "\r\n" + "  public void setter(int a) {\r\n"
				+ "    this.a = a;\r\n" + "  }\r\n" + "\r\n" + "  public static void main(String[] args) {\r\n"
				+ "    A premierA = new A(); //construction par 1\r\n"
				+ "    A secondA = new A(1); //construction par 2\r\n" + "  }\r\n" + "\r\n" + "}"
				+ "public class B extends A {\r\n" + "\r\n" + "  private int b;\r\n" + "\r\n" + "  public B() {\r\n"
				+ "    super();\r\n" + "    System.out.println(\"Création de B\");\r\n" + "  }\r\n" + " \r\n"
				+ "  public B(int a, int b){\r\n" + "    super(a);\r\n" + "    this.b = b;\r\n"
				+ "    System.out.println(\"Création de B\");\r\n" + "  }\r\n" + "\r\n" + "  public int getter() {\r\n"
				+ "    return this.b;\r\n" + "  }\r\n" + "\r\n" + "  public void setter(int a, int b) {\r\n"
				+ "    super.setter(a);\r\n" + "    this.b=b;\r\n" + "  }\r\n" + "\r\n"
				+ "  public static void main(String[] args) {\r\n" + "      A[] table = new A[2];\r\n"
				+ "      table[0] = new A(10);\r\n" + "      table[1] = new B(20,30);\r\n" + " \r\n"
				+ "     for(A a : table){\r\n" + "        System.out.println(\"* \" + a.getter());\r\n" + "     }\r\n"
				+ "\r\n" + "    /* les rėsultats sur console:\r\n" + "    Création de A\r\n" + "    Création de A\r\n"
				+ "    Création de B\r\n" + "    * 10\r\n" + "    * 30\r\n" + "    */\r\n" + "  }\r\n" + "\r\n" + "}");
		System.out.println("############################");
		System.out.println("question  06/29 ");
		System.out.println("############################");
		System.out.println("on utilise getInstance pour la signature d'un singleton");
		// concateanates the given array of strings
//		question 5/29 test codingame Java Sql
		System.out.println("############################");
		System.out.println("question  05/29 ");
		System.out.println("############################");
		System.out.println("String chaineConcatene = \"\";\r\n"
				+ "		String[] a = { \"f\", \"o\", \"o\", \"bar\", \" desmedt\" };\r\n"
				+ "		for (String i : a) {\r\n" + "			chaineConcatene += i;\r\n" + "		}\r\n"
				+ "		System.out.println(chaineConcatene);\r\n" + "		return chaineConcatene;");
//		String[] a = { "45", "o", "o", "bar" };
		String[] a = null;

		StringUtilsQuestion5.concat(a);
		StringUtilsQuestion5.concat3(a);

		System.out.println("############################");
		System.out.println("question  4/29 ");
		System.out.println("############################");
		String valeurS = new String();
//		String valeurS2;
		System.out.println("la valeur de s est : " + valeurS);
		// System.out.println("la valeur de s est : " + valeurS2);
		System.out.println("############################");
		System.out.println("question  3/29 ");
		int i1 = 5;
		int i2 = 2;
		int i3 = i1 / i2;
		System.out.println("le resultat de i3 est " + i3);
		System.out.println("############################");
		System.out.println("question  2/29 ");
		System.out.println("############################");
		System.out.println(
				"une constante se définie: public static final int MAXSIZE=100,\n forcement en public final et static");
		System.out.println("############################");
		System.out.println("question  1/29 ");
		System.out.println("############################");
		System.out.println(TestJavaQuestion1.isFoo("foom"));
		System.out.println("if (param == \"foo\") {\r\n" + "			return true;\r\n" + "		} else {\r\n"
				+ "			return false;\r\n" + "		}");

	}
}