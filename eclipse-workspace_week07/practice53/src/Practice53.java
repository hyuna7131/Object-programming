//��ǻ���а�, 20201704, ������
public class Practice53 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("�赿��", 100);
		BankAccount b3 = new BankAccount("ȫ�浿", 2000, 2.15);

		System.out.println("ù ��° ���� ������ �����Դϴ�.");
		System.out.println(b1.toString());
		
		System.out.println("�� ��° ���� ������ �����Դϴ�.");
		System.out.println(b2.toString());
		
		System.out.println("�� ��° ���� ������ �����Դϴ�.");
		System.out.println(b3.toString());
	}

}