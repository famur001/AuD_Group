package praktikum_08;

class BBaum<T extends Comparable<T>>
{
	public BKnoten<T> wurzel;

	public BBaum(BKnoten<T> wurzel)
	{
		assert(wurzel != null);

		this.wurzel = wurzel;
	}

	// Wrapper-Methode
	public void traversieren()
	{
		traversieren(wurzel);
	}

	// Eigentliche Implementierung
	private void traversieren(BKnoten<T> knoten)
	{
		if(knoten != null) {
			traversieren(knoten.kinder[0]);
			for( int i = 0; i < knoten.elemente.length; i++ ) {
				System.out.print(knoten.elemente[i] + " ");
				traversieren(knoten.kinder[i+1]);
			}
		}
	}

	// Wrapper-Methode
	public boolean suchen(final T daten)
	{
		assert(daten != null);

		return suchen(daten, wurzel);
	}

	// Eigentliche Implementierung
	private boolean suchen(final T daten, BKnoten<T> knoten)
	{
		if(knoten == null)
			return false;
		for(int i = 0; i < knoten.elemente.length; i++) {
			int compare = daten.compareTo(knoten.elemente[i]);
			if(compare == 0)
				return true;
			else if( compare == -1 ) // compare < 0
				return suchen(daten, knoten.kinder[i]);
		}
		return suchen(daten, knoten.kinder[knoten.elemente.length]);
	}
}