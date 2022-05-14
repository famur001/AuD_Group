package praktikum_05.Aufgabe3;
import java.util.*;
public class Ulam 
{
	public static int ulamRekursiv(int n)
	{
		System.out.print(n + " ");
		if(n==1)
			return 1;
		if(n>1 && n%2 == 0) { // gerade Zahl
			return ulamRekursiv(n/2);
		} else {
			return ulamRekursiv(3*n+1);
		}
	}

	public static int ulamIterativ(int n)
	{
		if(n == 1)
			return 1;
		while( n > 1 ) {
			System.out.print(n + " ");
			if(n%2 == 0) {
				n /= 2;
			} else {
				n = 3*n+1;
			}
		}
		System.out.print(n);
		return n;
	}
	 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl n ein");
		int n = sc.nextInt();	
		ulamRekursiv(n);
		System.out.println();
		ulamIterativ(n);
	}

}
