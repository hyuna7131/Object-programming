//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[5];
		int i, max;
		
		for(i=0; i<s.length; i++) {
			System.out.print((i +1) + "��° ���ڸ� �Է��ϼ���: ");
			s[i] = sc.nextInt();
		}
		System.out.println("�Էµ� ���ڴ� ������ �����ϴ�.");
		for(i=0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println("\n���� ����Դϴ�.");
		for(i=s.length-1; i>=0; i--) {
			System.out.print(s[i] +" ");
		}
		
		max=s[0];
		for(i=0; i< s.length; i++) {
			if(max < s[i])
				max = s[i];
		}
		System.out.println("\n���� ū ���� " + max + "�Դϴ�.");
		
	}

}
