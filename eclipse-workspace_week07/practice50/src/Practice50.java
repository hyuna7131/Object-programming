//��ǻ���а�, 20201704, ������
public class Practice50 {

	public static void main(String[] args) {
		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box(100, 60, 20);
		
		System.out.print("����Ʈ ������ �����Դϴ�.\n" + b0.toString());
		
		b1.setX(30);
		b1.setY(45);
		b1.setZ(53);
		b1.fillBox();
		System.out.print("ù ��° ������ �����Դϴ�.\n" + b1.toString());
		
		System.out.print("�� ��° ������ �����Դϴ�.\n" + b2.toString());
	}

}
