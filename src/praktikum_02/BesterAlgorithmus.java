package praktikum_02;
public class BesterAlgorithmus
{
	// 1000n
	public static double t1(int n)
	{
		return (double) 1000*n;
	}

	// 100n * log2(n+1)
	public static double t2(int n)
	{
		return 100.0 * n * Math.log10(n+1) / Math.log10(2);
	}

	// 10 * n * n
	public static double t3(int n)
	{
		return (double)(10 * n * n);
	}

	// n * n * n
	public static double t4(int n)
	{
		return (double) n*n*n;
	}

	// 2 hoch n
	public static double t5(int n)
	{
		return (double) Math.pow(2, n);
	}

	// n!
	public static double t6(int n)
	{
		double erg = 1;
		for( int i = 2; i <= n; i++ ) {
			erg *= i;
		}
		return erg;
	}

	// Bestimmt fuer alle 6 Funktionen den Wert von
	// ti(n) und gibt den Index der Funktion mit
	// dem minimalen Wert zurueck
	public static int gewinnerFuerN(int n)
	{
		double[] array = { t1(n), t2(n), t3(n), t4(n), t5(n), t6(n) };
		
		int min = 0;
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[min])
				min = i;
		}
		return min+1;
	}

	// Gibt f�r jede Zahl n zwischen 1 und 2000 aus, welcher der
	// 6 Algorithmen (A1 .. A6) f�r das betrachtete n der Beste ist
	public static void main(String[] args)
	{
		for(int i = 1; i <= 2000; i++) {
			System.out.println(i + ": " + gewinnerFuerN(i));
		}
	}
}