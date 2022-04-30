package praktikum_04.Aufgabe4;

public class ArrayStack<E> implements StackI<E>
{
	// Array, in dem die Elemente des Stacks gespeichert werden.
	// Das oberes Ende des Stacks liegt an Position pos-1.
	// Ein Array mit Elementen vom Typ E kann zwar deklariert, aber
	// nicht �ber new erzugt werden (Java-Mangel)!
	private Object[] st;

	// N�chste freie Position im Array
	// Gleichzeitig Anzahl der im Array/Stack gespeicherten Elemente
	private int pos;

	// Erzeugt ein Stack-Objekt, in dem maximal size Elemente
	// abgespeichert werden k�nnen
	public ArrayStack(int size)
	{
		st = new Object[size];
	}

	// Legt �bergebenes Element auf den Stack, sofern noch Platz
	// vorhanen ist. Das Element wird an Position pos gespeichert.
	public void push(E element)
	{
		if( pos < st.length ) {
			st[pos++] = element;
		}
	}

	// Holt oberstes Element vom Stack, sofern der Stack nicht leer ist.
	public E pop()
	{
		if(pos > 0) {
			E opfer = (E)st[--pos];
			st[pos] = null;
			return opfer;
		}
		return null;
	}

	// Gibt oberstes Element auf dem Stack zur�ck, sofern der Stack nicht
	// leer ist. Bei leerem Stack wird null zur�ckgegeben.
	public E top()
	{
		/*if( pos > 0 ) {
			return (E)st[pos-1];
		}
		return null;*/
		return (pos > 0) ? (E)st[pos-1] : null;
	}

	// Gibt true zur�ck, falls der Stack leer ist
	public boolean isEmpty()
	{
		if( pos <= 0 ) {
			return true;
		}
		return false;
	}
}