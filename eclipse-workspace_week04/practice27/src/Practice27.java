//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[5];
		int[] cnt = new int[10];
		int i, max, count;
		
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
		
		System.out.println("숫자 별로 입력된 횟수는 다음과 같습니다.");
		for(i=0; i< s.length; i++) {
			cnt[s[i]]++;
		}
		for(i=0; i< 10; i++) {
			System.out.print("숫자" + i + ": " + cnt[i] + "번\n");
		}
		
		System.out.print("\n\n가장 큰 수는 " + max + "이고 배열 내에 " + cnt[max] + "번 나타납니다.");
	}

}
