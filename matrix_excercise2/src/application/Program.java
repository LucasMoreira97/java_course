package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int line = sc.nextInt();

		System.out.print("Enter the number of columns: ");
		int column = sc.nextInt();

		int[][] mat = new int[line][column];

		
		
		
		for (int l = 0; l < mat.length; l++) {

			// System.out.println("LINHA: " + l);
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}

		System.out.print("Enter the number you want to find: ");
		int index = sc.nextInt();

		for (int l = 0; l < mat.length; l++) {

			for (int c = 0; c < mat[l].length; c++) {

				if (mat[l][c] == index) {

					System.out.println("Position: " + l + ", " + c);

					if (c > 0) {
						System.out.println("Left: " + mat[l][c - 1]);
						System.out.println("Rigt: " + mat[l][c + 1]);
					}

					if (l > 0) {
						System.out.println("Up: " + mat[l - 1][c]);
					}
					
					if (l < mat.length -1) {
						System.out.println("Down: " + mat[l+1][c]);
						
					}

				}

			}
		}

		sc.close();

	}

}
