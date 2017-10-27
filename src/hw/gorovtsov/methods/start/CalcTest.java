package hw.gorovtsov.methods.start;

import java.util.Scanner;

import hw.gorovtsov.methods.logic.*;
import hw.gorovtsov.methods.entity.*;

import java.util.Formatter;

public class CalcTest {

	public static void main(String[] args) {

		int[] mas = new int[4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 4; ++i) {
			if (i == 0 || i == 2) {
				System.out.println("Введите числитель: ");
				mas[i] = sc.nextInt();
			} else {
				System.out.println("Введите знаменатель: ");
				mas[i] = sc.nextInt();
			}
		}
		//создание объектов - дробей
		Fraction first = new Fraction(mas[0], mas[1]);
		Fraction second = new Fraction(mas[2], mas[3]);
		Fraction rez = null;
		FractCalc calc = new FractCalc();

		System.out.println(
				"Введите желаемое действие между дробями: \n1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
		
		int choise = sc.nextInt();
		sc.close();
		
		switch (choise) {
		case 1:
			rez = calc.sumFract(first, second);
			break;
		case 2:
			rez = calc.difFract(first, second);
			break;
		case 3:
			rez = calc.multFract(first, second);
			break;
		case 4:
			rez = calc.divFract(first, second);
			break;
		}
		
		Formatter f = new Formatter();
		f.format("Результат: %d/%d", rez.getCh(), rez.getZn());
		
		System.out.println(f);
	}

}
