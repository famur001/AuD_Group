package praktikum_08;

public class BKnoten<T>
{
	public T[] elemente;
	public BKnoten<T>[] kinder;

	// F�r Bl�tter
	public BKnoten(final T[] elemente)
	{
		assert(elemente!=null);

		this.elemente = elemente;
		this.kinder = (BKnoten<T>[])new BKnoten[elemente.length + 1];
	}

	// F�r innere Knoten
	public BKnoten(final T[] elemente, final BKnoten<T>[] kinder)
	{
		assert(elemente != null);
		assert(kinder != null);
		assert(elemente.length+1 == kinder.length);

		this.elemente = elemente;
		this.kinder = kinder;
	}
}