//��ǻ���а�, 20201704, ������
package fruit;

public class Melon extends Food{
String farmInfo;
	
	public String toString() {
		String rslt = "";
		rslt += "Į�θ�: " + calory + "\n";
		rslt += "����: " + price + "\n";
		rslt += "����: " + weight + "\n";
		rslt += "������: ���� �̿���";
		return rslt;
	}
}
