//��ǻ���а�, 20201704, ������
package nofruit;

import fruit.Food;

public class Potato extends Food{
	public int getUnitPrice() {
	int cal;
	cal = price / (int)weight;
	return cal;
}

public String toString() {
	String rslt = "";
	rslt += "Į�θ�: " + getCalory() + "\n";
	rslt += "����: " + price + "\n";
	rslt += "����: " + weight + "\n";
	rslt += "��������: " + getUnitPrice();
	return rslt;
}
}
