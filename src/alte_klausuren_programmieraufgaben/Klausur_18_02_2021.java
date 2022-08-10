package alte_klausuren_programmieraufgaben;

/**** SS 2020 – 18.02.2021 (alt4) ****/
public class Klausur_18_02_2021 {

	// Aufgabe 3, a)
	public int größterSchlüssel() {
		// Im Heapbaum steht der größte Schlüssel immer oben im Wurzel
		//Heapeingenschaft: Schlüssel der Elternknoten sind größer oder gleich als als die Schlüssel ihrer Kinderknoten (siehe VL.10 Folie 22)
		return wurzel.schlüssel;
	}

	// Aufgabe 3, b)
	private boolean istHeapKnoten(HKnoten knoten) {
		if (knoten == null || knoten.kinder == null)
			return true;
	
		if (knoten.kinder[0] != null && knoten.schlüssel > knoten.kinder[0] // linkes Kind muss kleiner sein
				&& knoten.kinder[1] != null && knoten.schlüssel > knoten.kinder[1]) // rechtes Kind muss kleiner sein
			return true;
		
		return false;
	}

	// Aufgabe 3, c)
	private boolean istHeap(HKnoten knoten) {
		if (!istHeapKnoten(knoten))
			return false;
		
		if (knoten.kinder[0] != null)
			istHeapKnoten(knoten.kinder[0]); // für linkes Kind rekusiv prüfen
		if (knoten.kinder[1] != null)
			istHeapKnoten(knoten.kinder[1]); // für rechtes Kind rekusiv prüfen
		
		return true; // wenn kein Kind/Knoten die Bedingung "if(!istHeapKnoten(knoten))" erfüllt, dann ist der ganze Baum ein Heap
	}
}

//KEINE GEWAEHR (NICHT GETESTET)
