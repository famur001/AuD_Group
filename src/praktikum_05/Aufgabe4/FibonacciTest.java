package praktikum_05.Aufgabe4;

public class FibonacciTest 
{
	public static void main(String[] args)
	{
		StopUhr meineUhr = new StopUhr();

		meineUhr.start();
		for (int a = 1; a <= 40; a++)
			Fibonacci.fibRekursiv(a);
		meineUhr.stop();

		System.out.println("Laufzeit bei rekursiver Berechnung: " +
			 meineUhr.getDuration()/1000000.0 + " msec");

		meineUhr.start();
		for (int a = 1; a <= 40; a++)
			Fibonacci.fibIterativ(a);
		meineUhr.stop();

		System.out.println("Laufzeit bei iterativer Berechnung: " +
			 meineUhr.getDuration()/1000000.0 + " msec");
	}

}
