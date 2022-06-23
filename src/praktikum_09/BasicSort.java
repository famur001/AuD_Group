package praktikum_09;

public class BasicSort
{
	// Selectionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschlie�lich Index rechts
	public static void selectionsort(int[] array, final int links, final int rechts)
	{
		for (int i = links; i < rechts; i++)
		{
			// Kleinstes Element im unsortierten Teil finden
			int min = i;

			for (int j = i + 1; j <= rechts; j++)
				if (array[min] > array[j])
					min = j;

			// Elemente tauschen
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}

	// Insertionsort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschlie�lich Index rechts
	public static void insertionsort(int[] array, final int links, final int rechts)
	{
		// 0=>links - array.length=>rechts
		for ( int i = links+1; i <= rechts; i++ ) {
			int x = array[i];
			int j = i-1;
			while(j >= links && array[j] > x) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = x;
		}
	}

	// Bubblesort:
	// Sortiere das Teilfeld von array beginnend mit Index links bis einschlie�lich Index rechts
	public static void bubblesort(int[] array, final int links, final int rechts)
	{
		int i = rechts;
		boolean getauscht = true;
		while (i > links && getauscht) {
			getauscht = false;
			for (int j = links; j < rechts; j++) {
				if (array[j] > array[j+1]) { // für umgekehrte Sortierung => (array[j] < array[j+1])
					int x = array[j];
					array[j] = array[j+1];
					array[j+1] = x;
					getauscht = true;
				}
			}
			i--;
		}
	}
}