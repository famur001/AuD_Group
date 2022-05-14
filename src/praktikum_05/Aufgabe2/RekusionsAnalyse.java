package praktikum_05.Aufgabe2;
import java.util.Scanner;

public class RekusionsAnalyse 
{
	static int zaehler;
	
	public static void tuwas()
	{
		zaehler++;
	}
	
	public static int funk1(int n)
	{
		tuwas();
		
		if (n <= 1) {
			return n;
		}
		else {
			return n + funk1(n - 1);
		}
	}
	
	public static void proz2(int n)
	{
		tuwas();
		
		if (n > 0){
			proz2(n - 1);
			proz2(n - 1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die Zahl n ein");
		int n = sc.nextInt();
		
		System.out.println("Ergebnis von funk1: " + funk1(n));
		System.out.println("Anzahl der Aufruf f�r funk1: " + zaehler);
		
		zaehler = 0;
		proz2(n);
		System.out.println("Anzahl der Aufruf f�r proz2: " + zaehler);
	}

}
