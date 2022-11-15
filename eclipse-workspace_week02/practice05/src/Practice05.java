//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input, cost, vat, change;
		
		System.out.print("받은 돈 : ");
		input = sc.nextInt();
		System.out.print("상품의 총액 : ");
		cost = sc.nextInt();
		
		vat = cost / 10;
		change = input - cost;
		
		System.out.print("부가세 : " + vat + "\n" + "잔돈: " + change);
		
		sc.close();
	}

}
