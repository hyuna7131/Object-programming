//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fivehundred, hundred, fifty, ten, total;
		
		System.out.print("500원 짜리의 개수: ");
		fivehundred = sc.nextInt();
		System.out.print("100원 짜리의 개수: ");
		hundred = sc.nextInt();
		System.out.print("50원 짜리의 개수: ");
		fifty = sc.nextInt();
		System.out.print("10원 짜리의 개수: ");
		ten = sc.nextInt();
		
		total = (500 * fivehundred) + (100 * hundred) + (50 * fifty) + (10 * ten);
		
		System.out.print("저금통에 있는 총액 : " + total + "원");
		
		sc.close();
	}

}
