//��ǻ���а�, 20201704, ������
public class Eagle extends Animal {
	private int wings = 2;
	
	public void setWings(int wings) {this.wings = wings;}
	public int getWings(int wings) {return wings;}
	
	void fly() {
		System.out.print("fly()�� ȣ��Ǿ���");
	}
	void fly2() {
		sleep();
		System.out.print(" : ");
		fly();
	}
	public String toString() {
		String rslt = "";
		rslt += "������: " + String.format("%.2f", getWeight()) + "kg - ";
		rslt += "�׸� ����: " + picture + " - ";
		rslt += "����: " + wings + "��";
		return rslt;
	}
}