//��ǻ���а�, 20201704, ������
public class Practice35 {

	public static void main(String[] args) {
		BankAccount obj1;
		obj1 = new BankAccount();
		BankAccount obj2;
		obj2 = new BankAccount();
		
		obj1.name = "�赿��";
		obj1.accountNo = "1234-5678";
		obj1.balance = 100;
		obj1.rate = 0.0;
		
		obj2.name = "ȫ�浿";
		obj2.accountNo = "9999-2531";
		obj2.balance = 2000;
		obj2.rate = 2.15;
		
		System.out.println("ù ��° ���� ������ �����Դϴ�.");
		System.out.println("�̸�: " + obj1.name);
		System.out.println("���� ��ȣ: " + obj1.accountNo);
		System.out.println("�ܾ�: " + obj1.balance + "��");
		System.out.println("������: " + obj1.rate + "%");
		
		System.out.println();
		
		System.out.println("�� ��° ���� ������ �����Դϴ�.");
		System.out.println("�̸�: " + obj2.name);
		System.out.println("���� ��ȣ: " + obj2.accountNo);
		System.out.println("�ܾ�: " + obj2.balance + "��");
		System.out.println("������: " + obj2.rate + "%");
	}

}
