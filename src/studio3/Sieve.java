package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		int temp=0;
		int[] array = new int[n];
		
		for (int i=0; i < n; i++) {
			array[i] = i+1;
			temp=0;
			for (int j = 1; j<=array[i]; j++) {
				if (array[i]%j==0) {
					temp+=1;
				}
			}
			if (temp == 2) {
				System.out.print(array[i] + " ");
			}
		}
		

	}
}
