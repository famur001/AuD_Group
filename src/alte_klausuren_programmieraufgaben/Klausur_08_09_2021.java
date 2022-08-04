package alte_klausuren_programmieraufgaben;

/**** SS 2021 – 08.09.2021 (alt2) ****/
public class Klausur_08_09_2021 {
	
	// Aufgabe 4, a)
	int höhe() {
		int anz = 0;
		BKnoten current = wurzel; // beginne mit der Wurzel
		while (current != null) {
			anz++; // current nicht null? +1
			current = current.kinder[0]; // immer das linke Kind nehmen, da wir in BBaum immer zuerst linkes Kind haben, und dann nach rechts gehen.
		}
		return anz;
	}
	
	// Aufgabe 4, a)
	// Wir müssen zählen, wie viele Knoten es insgesamt im BBaum gibt
	int anzahlKnoten(BKnoten knoten) {
		if (knoten == null)
			return 0;
		if (knoten.kinder == null)  // Wenn knoten existiert, aber keine Kinder besitzt, dann haben wir ein Blatt (Also 1 Knoten)
			return 1;
		
		BKnoten currentKind = knoten.kinder[0]; // beginne mit dem linken Knoten (Position=0 / das erste Kind von knoten)
		int anz = 1; // aktueller Knoten "knoten vom Parameter"=1
		int i = 1; // Nächste Position zum Durchlaufen aller Kinder von knoten
		while (currentKind != null) { // Solange der Knote existiert
			anz += anzahlKnoten(currentKind); // Durchlaufe das Aktuelle Kind rekusiv um seine Knotenanzahl zu zählen
										// Die Rekusion hier durchläuft bis zum letzten linken Knoten von currentKind (geht bis zur letzten Tiefe).
										// Das letzte Element gibt 1 zurück, weil "if (knoten.kinder == null)" erfüllt ist
										// Wenn alle Kinder von currentKind durchlaufen sind, gibt also jedes Blatt 1 zurück und wird in anz hochgezählt.
										// anz hatte den Wert 1. Nach dem Hochzählen hat anz also den Wert von: 1 + Anzahl aller seine Kinder
			currentKind = knoten.kinder[i]; // setze currentKind auf das nächste Kind von "knoten"
			i++; // erhöhe i, damit beim nächsten Durchlauf das nächste Kind von "knoten" durchlaufen wird
		}
		
		return anz;
	}
}

//KEINE GEWAEHR
