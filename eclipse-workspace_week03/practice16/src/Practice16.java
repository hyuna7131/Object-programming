//��ǻ���а�, 20201704, ������
import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, count=0;
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		num = sc.nextInt();
		
		for(int i=0; i<= num; i++) {
			if(i % 3 == 0) {
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0) {
					System.out.println();
				}
			}
			
		}
		
	}

}
