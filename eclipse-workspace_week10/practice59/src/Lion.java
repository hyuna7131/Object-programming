//��ǻ���а�, 20201704, ������
public class Lion extends Animal{
	private int legs = 4;
	
	public void setLegs(int legs) {this.legs = legs;}
	public int getLegs(int legs) {return legs;}
	
	void roar() {
		System.out.print("roar()�� ȣ��Ǿ���");
	}
	void roar2() {
		eat();
		System.out.print(" : ");
		roar();
	}
	public String toString() {
		String rslt = "";
		rslt += "������: " + String.format("%.2f", getWeight()) + "kg - ";
		rslt += "�׸� ����: " + picture + " - ";
		rslt += "�ٸ�: " + legs + "��";
		return rslt;
	}
}