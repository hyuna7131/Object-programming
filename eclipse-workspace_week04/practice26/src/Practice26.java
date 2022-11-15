//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[5];
		int i, max;
		
		for(i=0; i<s.length; i++) {
			System.out.print((i +1) + "번째 숫자를 입력하세요: ");
			s[i] = sc.nextInt();
		}
		System.out.println("입력된 숫자는 다음과 같습니다.");
		for(i=0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println("\n역순 출력입니다.");
		for(i=s.length-1; i>=0; i--) {
			System.out.print(s[i] +" ");
		}
		
		max=s[0];
		for(i=0; i< s.length; i++) {
			if(max < s[i])
				max = s[i];
		}
		System.out.println("\n가장 큰 수는 " + max + "입니다.");
		
	}

}
