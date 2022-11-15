//컴퓨터학과, 20201704, 이현아
import java.util.Scanner;
public class Practice57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int money;
		BankAccount b0 = new BankAccount();
		BankAccount b1 = new BankAccount("홍길동", 2000);
		BankAccount b2 = new BankAccount("성춘향", 500, 2.05);

		b0.setName("김동덕");
		b0.setBalance(100);
		b0.setInterest(3.1);
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		
		b1.setRate(2.15);
		System.out.println(b1.toString());
		
		System.out.println(b2.toString() + "\n");
		
		System.out.print("계좌 " + b0.getAccountNo() + "에서 입금할 금액을 입력하세요: ");
		money = sc.nextInt();
		if(b0.deposit(money) == true) {
			System.out.println("입금이 성공했습니다.\n");
		}
		else {
			System.out.println("입금이 실패했습니다.\n");
		}
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString() + "\n");
		
		System.out.print("계좌 " + b1.getAccountNo() + "에서 출금할 금액을 입력하세요: ");
		money = sc.nextInt();
		if(b1.withdraw(money) == true) {
			System.out.println("출금이 성공했습니다.\n");
		}
		else {
			System.out.println("출금이 실패했습니다.\n");
		}
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString() + "\n");
		
		System.out.print("계좌 " + b1.getAccountNo() + "에서 계좌 " + b2.getAccountNo() + "으로 송금할 금액을 입력하세요: ");
		money = sc.nextInt();
		if(BankAccount.transfer(b1, b2, money) == true) {
			System.out.println("송금이 성공했습니다.\n");
		}
		else {
			System.out.println("송금이 실패했습니다.\n");
		}
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString() + "\n");
		
        sc.close();
    }
    
}
