//컴퓨터학과, 20201704, 이현아
public class Practice53 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("김동덕", 100);
		BankAccount b3 = new BankAccount("홍길동", 2000, 2.15);

		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println(b1.toString());
		
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		System.out.println(b2.toString());
		
		System.out.println("세 번째 은행 계좌의 정보입니다.");
		System.out.println(b3.toString());
	}

}
