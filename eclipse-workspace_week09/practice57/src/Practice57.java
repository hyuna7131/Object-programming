//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int money;
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("ȫ�浿", 2000);
		BankAccount b2 = new BankAccount("������", 500, 2.05);

		b0.setName("�赿��");
		b0.setBalance(100);
		b0.setInterest(3.1);
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		
		b1.setRate(2.15);
		System.out.println(b1.toString());
		
		System.out.println(b2.toString() + "\n");
		
		System.out.print("���� " + b0.getAccountNo() + "���� �Ա��� �ݾ��� �Է��ϼ���: ");
		money = sc.nextInt();
		if(b0.deposit(money) == true) {
			System.out.println("�Ա��� �����߽��ϴ�.\n");
		}
		else {
			System.out.println("�Ա��� �����߽��ϴ�.\n");
		}
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString() + "\n");
		
		System.out.print("���� " + b1.getAccountNo() + "���� ����� �ݾ��� �Է��ϼ���: ");
		money = sc.nextInt();
		if(b1.withdraw(money) == true) {
			System.out.println("����� �����߽��ϴ�.\n");
		}
		else {
			System.out.println("����� �����߽��ϴ�.\n");
		}
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString() + "\n");
		
		System.out.print("���� " + b1.getAccountNo() + "���� ���� " + b2.getAccountNo() + "���� �۱��� �ݾ��� �Է��ϼ���: ");
		money = sc.nextInt();
		if(BankAccount.transfer(b1, b2, money) == true) {
			System.out.println("�۱��� �����߽��ϴ�.\n");
		}
		else {
			System.out.println("�۱��� �����߽��ϴ�.\n");
		}
		System.out.println("���� ���� ����� �����Դϴ�.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString() + "\n");
		
        sc.close();
    }
    
}
