//��ǻ���а�, 20201704, ������
public class Food {
	int calory;
	protected int price;
	protected double weight;
	
	public String toString() {
		String rslt = "";
		rslt += "Į�θ�: " + calory + "\n";
		rslt += "����: " + price + "\n";
		rslt += "����: " + weight + "\n";
		return rslt;
	}
}
