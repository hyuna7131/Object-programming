//��ǻ���а�, 20201704, ������
package game;

import java.util.Random;

public class Dice {
	private int value;
	private Random rg;
	
	public Dice() {
		this.value = 0;
	}
	
	public void roll() {
		rg = new Random();
		value = rg.nextInt(6) + 1;
	}
	
	public int getValue() {return value;}
	public void setValue(int value) {this.value = value;}
	
	public String toString() {
		String rslt = "";
		roll();
		rslt += "�ֻ��� = " + value;
		return rslt;
	}
}
