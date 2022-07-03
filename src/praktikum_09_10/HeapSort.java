package praktikum_09_10;

public class HeapSort
{
	// Versickere das Element mit Index pos in dem Teilfeld von Index links bis einschlie�lich Index rechts
	public static void versickere(int[] array, final int links, int pos, final int rechts)
	{
		int i = pos;
		int x = array[i];
		boolean versinkenErforderlich = true;
		while (2*i+1 <= rechts) {
			int j = 2*i+1;
			if (j+1 <= rechts && array[j] < array[j+1]) { // array[j] > array[j+1])
				j = j+1;
			}
			if (x < array[j]) { // x > array[j]
				array[i] = array[j];
			} else {
				array[i] = x;
				i = rechts;
				versinkenErforderlich = false;
			}
		}
		if(versinkenErforderlich) { // == true
			array[i] = x;
		}
	}

	public static void heapsort(int[] array, final int links, final int rechts)
	{
		for (int i = (links+rechts -1)/2; i > links-1; i--) {
			versickere(array, links, i, rechts);
		}
		for(int i = rechts; i > links; i--) {
			// vertauschen
			int zw = array[links];
			array[links] = array[i];
			array[i] = zw;
			
			// versickern
			versickere(array, links, rechts, i-1);
		}
	}
}