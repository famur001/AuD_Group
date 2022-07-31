package klausur_07_02_2022;

import praktikum_03.Link;

public class Aufgabe3 {
	
	public void verschieben() {
		if (anfang == ende) return;
		ende.naechster = anfang;
		anfang = anfang.naechster;
		ende = ende.naechster;
		ende.naechster = null;
	}
	
	public boolean istDoppelt(String s) {
		if (anfang == ende == null)
			return false;
		
		int anzahl = 0;
		Link zeiger = anfang;
		while (zeiger != null) {
			if(zeiger.daten.equals(s)) {
				anzahl++;
			}
			zeiger = zeiger.naechster;
		}
		//if (anzahl == 2) return true;
		//else return false;
		return (anzahl == 2) ? true : false;
	}

}
