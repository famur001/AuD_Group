package praktikum_05.Aufgabe4;
public class Fibonacci 
{
	public static long fibRekursiv(final int n)
	{
		assert(n >= 0);
		
		if(n<=1)
			return n;
		else
			return fibRekursiv(n-1)+fibRekursiv(n-2);
		
	}

	public static long fibIterativ(final int n)
	{
		assert(n >= 0);
		long erg = 0;
		long fib0 = 0;
		long fib1 = 1;
		for(int i = 0; i < n-1; i++) {
			erg = fib0 + fib1;
			fib0 = fib1;
			fib1 = erg;
		}
		return erg;
		
	}

	public static void main(String[] args)
	{
		System.out.println(fibRekursiv(8));
		System.out.println(fibIterativ(8));
	}

}
