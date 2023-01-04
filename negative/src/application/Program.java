package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Value of 'N': ");
		int n = sc.nextInt();
		sc.nextLine();

		int vect[] = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter the " + (i + 1) + "st value: ");
			int valueAdd = sc.nextInt();
			sc.nextLine();
			vect[i] = valueAdd;
		}

		System.out.println("Added negative values");

		for (int i = 0; i < vect.length; i++) {

			int recValue = vect[i];

			if (recValue < 0) {
				System.out.println(recValue);
			}
		}


	}

}
