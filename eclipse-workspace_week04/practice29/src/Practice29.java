import java.util.Random;
//컴퓨터학과, 20201704, 이현아
public class Practice29 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] num = new int[20];
		int i, max;
		
		for(i=0; i< num.length; i++) {	
			num[i] = ran.nextInt(100);
		}
		
		displayArray(num);
		max = findMax(num);
		System.out.print("\n가장 큰 숫자는 " + max + "입니다.");
	}
	public static void displayArray(int[] iArray) {
		int i;
		System.out.println("생성된 숫자는 다음과 같습니다.");
		for(i=0; i<iArray.length; i++) {
			if(i == 10)
				System.out.println();
			System.out.print(iArray[i] + "    ");
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
