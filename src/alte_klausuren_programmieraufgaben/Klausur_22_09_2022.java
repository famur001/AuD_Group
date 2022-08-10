package alte_klausuren_programmieraufgaben;

/**** SS 2020 – 22.09.2020 (alt5) ****/
public class Klausur_22_09_2022 {

	// Aufgabe 4, a)
	public int größterSchlüssel() {
		int max = wurzel.schlüssel;
		Knoten current = wurzel.kinder[1]; // immer rechtes Kind durchlaufen (weil rechter Teilbaum immer größer ist)
		
		while (current != null) {
			if(current.schlüssel > max) {
				max = current.schlüssel;
			}
			current = current.kinder[1]; // nächstes rechte Kind
		}
		return max;
	}
	
	// Aufgabe 4, b)
	boolean istInnererKnoten(Knoten knoten) {
		if (knoten == null)
			return false;
		
		// Wenn beide Kinder null sind, dann ist der Knoten kein innerer Knoten (sondern ein Blatt)
		return (knoten.kinder[0] == null && knoten.kinder[1] == null) ? false : true;
	}

	// Aufgabe 4, c)
	int anzahlInnereKnoten(Knoten knoten) {
		if (knoten == null)
			return 0;

		if (!istInnererKnoten(knoten)) // Keine kinder? dann ein Blatt
			return 1;
		
		// aktueller Knoten hochzählen und linkes + rechtes Kind rekusiv durchlaufend
		return 1 + anzahlInnereKnoten(knoten.kinder[0]) + anzahlInnereKnoten(knoten.kinder[1]);
	}
}

//KEINE GEWAEHR (NICHT GETESTET)
