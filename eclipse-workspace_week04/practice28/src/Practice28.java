//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int i, max;
		
		for(i=0; i<num.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요: ");
			num[i] = sc.nextInt();
		}
		
		displayArray(num);
		max = findMax(num);
		System.out.print("\n가장 큰 숫자는 " + max + "입니다.");
	}

	public static void displayArray(int[] iArray) {
		int i;
		System.out.println("입력된 숫자는 다음과 같습니다.");
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
