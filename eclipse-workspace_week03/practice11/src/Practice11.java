//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height, weight, standard;
		
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		weight = sc.nextDouble();
		
		standard = (height-100)*0.9;
		System.out.println("표준체중은 " + standard + "입니다.");
		
		if(standard > weight) {
			System.out.println("과체중입니다.");
		}
		else if(standard == weight) {
			System.out.println("정상체중입니다.");
		}
		else {
			System.out.println("저체중입니다.");
		}
	}

}