import java.util.Random;
//컴퓨터학과, 20201704, 이현아
public class Practice30 {

	public static void main(String[] args) {
		
		int max;
		int[] data = getData(20);
		displayArray(data);
		max = findMax(data);
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
	public static int[] getData(int num) {
		Random ran = new Random();
		int[] rslt = new int[num];
		int i;
		for(i=0; i< rslt.length; i++) {	
			rslt[i] = ran.nextInt(100);
		}
		return rslt;
	}
}

