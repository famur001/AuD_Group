package praktikum_11;

public class Suche {

	public static boolean binaereSuche(final String[] worte, final String begriff) {
		
		int links = 0;
		int rechts = worte.length -1;
		
		while (links <= rechts) {
			
			int m = (rechts + links) / 2;
			
			int comp = worte[m].compareTo(begriff);
			
			if (comp > 0) {
				rechts = m-1;
			} else if (comp < 0) {
				links = m+1;
			} else { // comp == 0
				return true;
			}
			
		}
		
		return false;
		
	}
	
}
