package praktikum_04.Aufgabe4;

public class StackTest
{
	public static void main(String[] args)
	{
		ArrayStack<Integer> st = new ArrayStack<Integer>(10);

		System.out.println("Ablegen auf dem Stapel: 5 Elemente");
		for (int a = 1; a <= 5; a++)
		{
			System.out.print(a + " ");
			st.push(a);			
		}
		System.out.println();

		System.out.println("Entnehmen vom Stapel: 3 Elemente");
		for (int a = 1; a <= 3; a++)
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();

		System.out.println("Versuch: Ablegen auf dem Stapel: 10 Elemente");
		for (int a = 6; a <= 15; a++)
		{
			System.out.print(a + " ");
			st.push(a);
		}
		System.out.println();

		System.out.println("Entnehmen vom Stapel bis Stapel leer");
		while (!st.isEmpty())
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();
	}
}