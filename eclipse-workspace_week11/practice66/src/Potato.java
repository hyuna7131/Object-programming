//��ǻ���а�, 20201704, ������
public class Potato extends Food {
	public int getUnitPrice() {
		int cal;
		cal = price / (int)weight;
		return cal;
	}
	
	public String toString() {
		String rslt = "";
		rslt += "Į�θ�: " + calory + "\n";
		rslt += "����: " + price + "\n";
		rslt += "����: " + weight + "\n";
		rslt += "��������: " + getUnitPrice();
		return rslt;
	}
}