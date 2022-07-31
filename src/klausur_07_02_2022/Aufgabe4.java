package klausur_07_02_2022;

import praktikum_08.BKnoten;

public class Aufgabe4 {

	public boolean hoeherAls(int n) {
		if (n < 0)
			return false;
		if (wurzel == null && n == 0) return true;
		if (wurzel == null && n > 0) return false;
		int length = 1;
		BKnoten[] currentKind = wurzel.kinder;
		while (currentKind != null) {
			length++;
			currentKind = currentKind.kinder;
		}
		return (length > n) ? true : false;
	}
	
	public boolean istBinaer(BKnoten knoten) {
		
		if (knoten == null)
			return true;
		if (knoten.kinder.length > 2) {
			return false;
		}
		if (knoten.kinder[0] != null)
			istBinaer(knoten.kinder[0]);
		if (knoten.kinder[1] != null)
			istBinaer(knoten.kinder[1]);
		return true;
	}
	
}
