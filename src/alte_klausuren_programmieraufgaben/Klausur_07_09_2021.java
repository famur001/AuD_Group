package alte_klausuren_programmieraufgaben;

/**** SS 2021 – 07.09.2021 (alt3) ****/
public class Klausur_07_09_2021 {

	// Aufgabe 4, a)
	boolean istTeilbaumKleiner(Knoten k, int wert) {
		if (k== null)
			return true;
		if (k.schlüssel > wert)
			return false;
		
		if (k.linkesKind != null)
			istTeilbaumKleiner(k.linkesKind, wert);
		if (k.rechtesKind != null)
			istTeilbaumKleiner(k.rechtesKind, wert);
		
		return true; // Wenn die if (k.schlüssel > wert) nie betreten wird, dann ist der ganze Teilbaum kleiner als wert
	}
	
	// Aufgabe 4, b)
	boolean istTeilbaumGroeßer(Knoten k, int wert) {
		if (k== null)
			return true;
		if (k.schlüssel < wert)
			return false;
		
		if (k.linkesKind != null)
			istTeilbaumKleiner(k.linkesKind, wert);
		if (k.rechtesKind != null)
			istTeilbaumKleiner(k.rechtesKind, wert);
		
		return true; // Wenn die if (k.schlüssel > wert) nie betreten wird, dann ist der ganze Teilbaum kleiner als wert
	}
	
	// Aufgabe 4, c)
	boolean istSuchbaum(Knoten k) {
		if (k==null)
			return true;
		
		// Alles vom linken Teilbaum (linkesKind) muss kleiner sein als der k.schlüssel. Wenn das nicht der Fall ist => return false
		if (k.linkesKind != null && !istTeilbaumKleiner(k.linkesKind, k.schlüssel))
			return false;
		// Alles vom rechten Teilbaum (rechtesKind) muss groeßer sein als der k.schlüssel. Wenn das nicht der Fall ist => return false
		if (k.rechtesKind != null && !istTeilbaumGrößer(k.rechtesKind, k.schlüssel))
			return false;
		
		istSuchbaum(k.linkesKind); // überprüfe rekusiv weiter mit dem linken Kind vom Knoten k
		istSuchbaum(k.rechtesKind);  // überprüfe rekusiv weiter mit dem rechten Kind vom Knoten k
		
		return true; // Wenn die 2 oberen if-bedingungen nicht betreten werden, dann ist der Baum richtig sortiert
	}
}

//KEINE GEWAEHR (NICHT GETESTET)
