//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int i, max;
		
		for(i=0; i<num.length; i++) {
			System.out.print((i+1) + "��° ���ڸ� �Է��ϼ���: ");
			num[i] = sc.nextInt();
		}
		
		displayArray(num);
		max = findMax(num);
		System.out.print("\n���� ū ���ڴ� " + max + "�Դϴ�.");
	}

	public static void displayArray(int[] iArray) {
		int i;
		System.out.println("�Էµ� ���ڴ� ������ �����ϴ�.");
		for(i=0; i<iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
	}
	public static int findMax(int[] iArray) {
		int max=iArray[0], i;
		for(i=0; i< iArray.length; i++) {
			if(max < iArray[i])
				max = iArray[i];
		}
		return max;
	}
	
}
