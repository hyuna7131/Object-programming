//컴퓨터학과, 20201704, 이현아
public class Practice35 {

	public static void main(String[] args) {
		BankAccount obj1;
		obj1 = new BankAccount();
		BankAccount obj2;
		obj2 = new BankAccount();
		
		obj1.name = "김동덕";
		obj1.accountNo = "1234-5678";
		obj1.balance = 100;
		obj1.rate = 0.0;
		
		obj2.name = "홍길동";
		obj2.accountNo = "9999-2531";
		obj2.balance = 2000;
		obj2.rate = 2.15;
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: " + obj1.name);
		System.out.println("계좌 번호: " + obj1.accountNo);
		System.out.println("잔액: " + obj1.balance + "원");
		System.out.println("이자율: " + obj1.rate + "%");
		
		System.out.println();
		
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.println("이름: " + obj2.name);
		System.out.println("계좌 번호: " + obj2.accountNo);
		System.out.println("잔액: " + obj2.balance + "원");
		System.out.println("이자율: " + obj2.rate + "%");
	}

}
