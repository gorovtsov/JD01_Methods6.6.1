/*
 *  Объекты класса Fraction имеют две переменные экземпляра класса - 
 *  числитель и знаменатель.
 */
package hw.gorovtsov.methods.entity;

import hw.gorovtsov.methods.logic.*;

public class Fraction {

	private int ch;
	private int zn;

	public Fraction(int a, int b) {
		this.ch = a;
		this.zn = b;
	}

	public void setCh(int a) {
		this.ch = a;
	}

	public void setZn(int a) {
		this.zn = a;
	}

	public int getCh() {
		return this.ch;
	}

	public int getZn() {
		return this.zn;
	}
	
	public void sokr() {
		this.ch/= FractCalc.nod(this.ch, this.zn);
		this.zn/= FractCalc.nod(this.ch, this.zn);
	}
	
}
