package praktikum_04.Aufgabe3;

import java.util.*;

public class ListInterfaceAufgabe
{
	// Elemente in Liste einf�gen
	static void fillList(List<String> list)
	{
		// Zahlen von 0 bis 20 als Zeichenketten (Strings) einf�gen
		for (int a = 0; a <= 20; a++)
			list.add("" + a);

		// Element an der Position 3 entfernen
		list.remove(3);

		// Erstes Element in der Liste entfernen, das gleich "6" ist
		list.remove("6");
	}

	// Liste vom Anfang bis zum Ende mit einer
	// foreach-Schleife iterieren und Elemente ausgeben
	static void printList(List<String> list)
	{
		for( String string: list ) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	// Alle Elemente aus der Liste entfernen, die durch 5 teilbar sind
	static void remove5List(List<String> list)
	{
		ListIterator<String> it = list.listIterator();
		while( it.hasNext() ) {
			String st = it.next();
			// Methode 1
			/*int zahl = Integer.parseInt(st);
			if(zahl != 0 && zahl % 5 == 0) { // wenn durch 5 teilbar ist
				it.remove();
			}*/
			
			// Methode 2
			if( !st.equals("0") && ( st.endsWith("0") || st.endsWith("5") ) ) {
				it.remove();
			}
		}
	}

	public static void main(String[] args)
	{
		// Erzeugen der LinkedList
		LinkedList<String> list1 = new LinkedList<String>();
		fillList(list1);
		System.out.println("\nAusgabe der ersten Liste(list1)");
		printList(list1);

		remove5List(list1);
		System.out.println("\nlist1 nach dem Entfernen der durch 5 teilbaren Zahlen");
		printList(list1);

		// Erzeugen der ArrayList
		ArrayList<String> list2 = new ArrayList<String>();
		fillList(list2);

		System.out.println("\nAusgabe der zweiten Liste(list2)");
		printList(list2);

		// Weitere Aufgaben
		int beginn = list2.indexOf("7");
		int end = list2.indexOf("14"); // 13(+1)
		List<String> teilliste = list2.subList(beginn, end);
		System.out.println("\nAusgabe der TeilListe(list2)");
		printList(teilliste);
		
		System.out.println("\nAusgabe der TeilListe(list2) nach dem Entfernen von 11");
		teilliste.remove("11");
		printList(teilliste);
		
		System.out.println("\nAusgabe der zweiten Liste(list2)");
		printList(list2);
	}
}