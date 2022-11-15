//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int change, fivehundred, hundred, fifty, ten;
		
		System.out.print("거스름돈 총액: ");
		change = sc.nextInt();
		
		fivehundred = change / 500;
		hundred = (change-fivehundred*500) / 100;
		fifty = (change-fivehundred*500-hundred*100) / 50;
		ten = (change-fivehundred*500-hundred*100-fifty*50) / 10;
		
		System.out.print("500원짜리 동전: " + fivehundred + "개\n");
		System.out.print("100원짜리 동전: " + hundred + "개\n");
		System.out.print("50원짜리 동전: " + fifty + "개\n");
		System.out.print("10원짜리 동전: " + ten + "개\n");
		
	}

}
