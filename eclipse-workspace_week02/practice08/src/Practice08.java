//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int change, fivehundred, hundred, fifty, ten;
		
		System.out.print("�Ž����� �Ѿ�: ");
		change = sc.nextInt();
		
		fivehundred = change / 500;
		hundred = (change-fivehundred*500) / 100;
		fifty = (change-fivehundred*500-hundred*100) / 50;
		ten = (change-fivehundred*500-hundred*100-fifty*50) / 10;
		
		System.out.print("500��¥�� ����: " + fivehundred + "��\n");
		System.out.print("100��¥�� ����: " + hundred + "��\n");
		System.out.print("50��¥�� ����: " + fifty + "��\n");
		System.out.print("10��¥�� ����: " + ten + "��\n");
		
	}

}
