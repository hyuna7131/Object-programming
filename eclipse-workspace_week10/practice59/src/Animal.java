//��ǻ���а�, 20201704, ������
public class Animal {
	private double weight;
	String picture;
	
	public void setWeight(double weight) {this.weight = weight;}
	public double getWeight() {return weight;}
	
	private String printMsg() {
		return ("eat()�� ȣ��Ǿ���");
	}
	void eat() {
		String msg = printMsg();
		System.out.print(msg);
	}
	void sleep() {
		System.out.print("sleep()�� ȣ��Ǿ���");
	}
	
	public String toString() {
		String rslt = "";
		rslt += "������: " + String.format("%.2f", weight) + "kg - ";
		rslt += "�׸� ����: " + picture;
		return rslt;
	}
}