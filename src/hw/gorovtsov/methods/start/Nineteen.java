/*
 * 6.6 19. Составить программу для вычисления суммы факториалов всех четных чисел от т до п.
 */
package hw.gorovtsov.methods.start;

import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		int[] x = new int[2];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; ++i) {
			System.out.println("Введите число " + (i + 1) + ": ");
			x[i] = sc.nextInt();
		}
		sc.close();

		getFactorials(x[0], x[1]);
	}

	public static void getFactorials(int a, int b) {

		int start = 0;
		int max = 0;

		if (a > b) {
			start = b;
			max = a;
		} else {
			start = a;
			max = b;
		}

		for (int i = start; i <= max; i++) {
			System.out.printf("Факториал числа " + i + " = " + factorial(i) + "\n");
		}
	}

	public static int factorial(int a) {
		int rez = 1;
		for (int i = 1; i <= a; ++i) {
			rez *= i;
		}
		return rez;
	}

}
