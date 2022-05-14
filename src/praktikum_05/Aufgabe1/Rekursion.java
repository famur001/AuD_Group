package praktikum_05.Aufgabe1;
public class Rekursion 
{
	public static void rev1(int n)
	{
		System.out.print(n % 10);
		if (n > 9)
			rev1(n / 10);
	}
	
	public static void rev1Iter(int n) 
	{
		while(n > 9) {
			System.out.print(n%10);
			n /= 10;
		}
		System.out.print(n);
	}

	public static int rev2(int n)
	{
		if (n <= 9)
			return n;

		int logn = (int)Math.log10(n);
		int zehnHochLogn = (int)Math.pow(10, logn);

		return (n % 10) * zehnHochLogn + rev2(n / 10);
		
	}

	public static int rev2Iter(int n)
	{
		int erg = 0;
		
		if (n <= 9)
			return n;
		
		while(n > 9) {
			int logn = (int)Math.log10(n);
			int zehnHochLogn = (int)Math.pow(10, logn);
			erg += (n % 10) * zehnHochLogn;
			n /= 10;
		}
		erg += n;
		
		
		return erg;
	}

	public static void main(String[] args)
	{
		rev1Iter(1234);
		System.out.println();
		
        int erg = rev2Iter(1234);
		System.out.println(erg);		
	}
}
