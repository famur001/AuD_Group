package praktikum_02;

public class Zeitmessung
{
	private static double tuwas()
	{
		return Math.random();
	}

	// Linear
	public static double func1(int n)
	{
		double summe = 0;

		for (int a = 0; a < n; a++)
			summe += tuwas();

		return summe;
	}

	// Quadratisch
	public static double func2(int n)
	{
		double summe = 0;

		for (int a = 0; a < n; a++)
			for(int b = 0; b < n; b++)
				summe += tuwas();

		return summe;
	}

	// log2(n)
	public static double func6(int n)
	{
		double summe = 0;

		while (n > 0)
		{
			summe += tuwas();
			n /= 2;
		}

		return summe;
	}

	public static void main(String[] args)
	{
		
		StopUhr uhr1 = new StopUhr();
		uhr1.start();
		func1(1000);
		uhr1.stop();
		System.out.println( "Func1(1000) => " + uhr1.getDuration() / 1000000.0 +"ms" );
		
		StopUhr uhr2 = new StopUhr();
		uhr2.start();
		func2(1000);
		uhr2.stop();
		System.out.println( "Func2(1000) => " + uhr2.getDuration() / 1000000.0 +"ms" );
		
		StopUhr uhr3 = new StopUhr();
		uhr3.start();
		func6(1000);
		uhr3.stop();
		System.out.println( "Func6(1000) => " + uhr3.getDuration() / 1000000.0 +"ms" );
		
	}
}
