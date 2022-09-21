package studio3;

import java.util.Scanner;

public class Sieve2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		int[] array = new int[n];
		for (int i=0; i < n; i++) {
			array[i] = i+1;
		}

		for (int i=0; i < n; i++) {
			for (int j = 2; j < n; j++) {
				if(!=0  &&  array[ij] ) {
					array[ij] = 0
				}
				if(array[i] % j == 0 && array[i] != j) {
					
					array[i]=0;
				}
			}
			System.out.print(array[i]+" ");
		}
	}
}
