//컴퓨터학과, 20201704, 이현아
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
		rslt += "주사위 = " + value;
		return rslt;
	}
}
