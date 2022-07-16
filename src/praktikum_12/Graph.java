package praktikum_12;

import java.util.*;

public class Graph
{
	private static final int KNOTENZAHL = 7;
	private static boolean[] besucht = new boolean[KNOTENZAHL];
	private Knoten[] knoten;
	private boolean[][] matrix = {
			{false, true, false, false, false, false, false},
			{false, false, true, false, false, false, false},
			{false, true, false, false, false, false, false},
			{false, false, false, false, false, false, false},
			{false, false, false, true, false, false, false},
			{false, true, true, false, false, false, false},
			{false, false, false, false, false, false, false},
		};

	public Graph()
	{
		knoten  = new Knoten[KNOTENZAHL];
		knoten[0] = new Knoten("A");
		knoten[1] = new Knoten("B");
		knoten[2] = new Knoten("C");
		knoten[3] = new Knoten("D");
		knoten[4] = new Knoten("E");
		knoten[5] = new Knoten("F");
		knoten[6] = new Knoten("G");
	}

	private boolean isKante(int k1, int k2)
	{
		/*if(matrix[k1][k2] == true || matrix[k2][k2] == true) {
			return true;
		}
		return false;*/
		return matrix[k1][k2] || matrix[k2][k1];
	}
	
	// Tiefensuche
	private void rekDfs(final int k)
	{
		besucht[k] = true;
		System.out.print(knoten[k].getName() + " ");
		for (int i = 0; i < KNOTENZAHL; i++) {
			if(!besucht[i] && this.isKante(k, i))
				rekDfs(i);
		}
	}

	public void zusammenhangskomponenten() {
		for (int i = 0; i < KNOTENZAHL; i++) {
			if(!besucht[i]) {
				System.out.print("Zusammenhangskomponente: ");
				rekDfs(i);
				System.out.println();
			}
		}
	}

	public static void main(String[] args)
	{
		new Graph().zusammenhangskomponenten();
	}
}