//��ǻ���а�, 20201704, ������
public class Practice49 {

	public static void main(String[] args) {
		Plane p0 = new Plane();
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		
		System.out.print("����Ʈ ������� �����Դϴ�.\n" + p0.toString());
		
		p1.setId(1030615);
		p1.setModel("���� 737");
		p1.setCapacity(75);
		System.out.print("������ ������� �����Դϴ�.\n" + p1.toString());
		
		p2.setId(2464737);
		p2.setModel("���� 747");
		p2.setCapacity(150);
		System.out.print("������ ������� �����Դϴ�.\n" + p2.toString());
	}

}
