package alte_klausuren_programmieraufgaben;

/**** WS 2021/22 – 07.02.2022  (alt1) ****/
public class Klausur_07_02_2022 {

	
	// Aufgabe 4, a)
	boolean höherAls (int n) {
		if (n < 0) return false;
		if (wurzel == null && n == 0) return true;
		if (wurzel == null && n > 0) return false;
		
		int bbaumHöhe = 1; // Wurzel=>Höhe=1
		BKnoten[] k = wurzel.kinder; // Unteres Niveau (Foto in VL06 Folie 15)
		while(k != null) {
			bbaumHöhe++;
			k = k.kinder; // weiteres Niveau runtergehen
		}
		
		return (bbaumHöhe > n) ? true : false;
	}
	
	// Aufgabe 4, b)
	boolean istBinär(BKnoten knoten) {
		if (knoten == null)
			return true; // leerer Baum ist binär
		if (knoten.kinder.length > 2) // Wenn ein Knoten mehr als 2 Kinder besitzt, kann der Baum nicht mehr binär sein
			return false;
		
		if(knoten.kinder[0] != null) // Gibt es ein linkes Kind? Wenn ja besuche es rekusiv
			istBinär(knoten.kinder[0]);
		if(knoten.kinder[1] != null) // Gibt es ein rechtes Kind? Wenn ja besuche es rekusiv
			istBinär(knoten.kinder[1]);
		
		return true; // Wenn der allerletzte Knoten diese Zeile erreicht hat, dann haben alle Knoten bis zu 2 Kinder. Wenn sonst ein Knoten die "if (knoten.kinder.length > 2)" erfüllt, gibt die Methode direkt false zurück und bricht ab.
	}
}

//KEINE GEWAEHR (NICHT GETESTET)

