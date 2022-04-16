package praktikum_01;

import java.util.Scanner;

public class SiebDesEratosthenes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine Zahl n ein: ");
		int n = sc.nextInt();
		
		boolean[] feld = new boolean[n];
		// [0] = 1  - [1] = 2 
		// Durchstreiben := true
		feld[0] = true;
		
		int a = 2;
		while(a*a <= n) {
			if(feld[a-1] == false) {
				int x = 2*a;
				while(x <= n) {
					feld[x-1] = true;
					x = x+a; // vielfache
				}
			}
			a++;
		}
		
		for(a = 1; a <= n; a++) {
			if(feld[a-1] == false) {
				System.out.println(a);
			}
		}
		
	}

}
