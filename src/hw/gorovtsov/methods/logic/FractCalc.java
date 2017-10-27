/*
 * Класс мини-калькулятора для дробей.
 * Все вычислительные методы возварают копию ссылки на объект,  который создается
 * конструктором класса Fraction, вызываемым с параметрами-результатами.
 */
package hw.gorovtsov.methods.logic;

import hw.gorovtsov.methods.entity.Fraction;

public class FractCalc {

	// Метод умножения дробей - умножает числители и знаменатели дроби.
	public Fraction multFract(Fraction first, Fraction second) {

		int a = first.getCh();
		int b = first.getZn();
		int c = second.getCh();
		int d = second.getZn();

		Fraction rez = new Fraction(a * c, b * d);

		rez.sokr();

		return rez;
	}

	// Метод деления дробей - меняет местами числитель и знаменатель одной из
	// дробей.
	public Fraction divFract(Fraction first, Fraction second) {

		int a = first.getCh();
		int b = first.getZn();
		int c = second.getCh();
		int d = second.getZn();

		Fraction rez = new Fraction(a * d, b * c);

		rez.sokr();

		return rez;
	}

	// Метод складывает две дроби
	public Fraction sumFract(Fraction first, Fraction second) {

		int a = first.getCh();
		int b = first.getZn();
		int c = second.getCh();
		int d = second.getZn();

		int ch = a * d + c * b;
		int zn = b * d;
		Fraction rez = new Fraction(ch, zn);

		rez.sokr();

		return rez;
	}

	// Метод вычитает одну дробь из другой
	public Fraction difFract(Fraction first, Fraction second) {

		int a = first.getCh();
		int b = first.getZn();
		int c = second.getCh();
		int d = second.getZn();

		int ch = a * d - c * b;
		int zn = b * d;
		Fraction rez = new Fraction(ch, zn);

		rez.sokr();

		return rez;
	}

	// Метод принимает два челых числа и возвращает их НОД.
	public static int nod(int a, int b) {
		while (b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

}
