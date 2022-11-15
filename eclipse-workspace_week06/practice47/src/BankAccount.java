//컴퓨터학과, 20201704, 이현아
public class BankAccount {
	private String name, accountNo;
	private int balance;
	private double rate;
	
	public void setName(String n) {name = n;}
	public void setAccountNo(String a) {accountNo = a;}
	public void setBalance(int b) {balance = b;}
	public void setRate(double r) {rate = r;}
	
	public String getName() {return name;}
	public String getAccountNo() {return accountNo;}
	public int getBalance() {return balance;}
	public double getRate() {return rate;}
	
	public String toString() {
		String rslt = "";
		
		rslt += "이름: " + name + "\n";
		rslt += "계좌 번호: " + accountNo + "\n";
		rslt += "잔액: " + balance + "원" + "\n";
		rslt += "이자율: " + rate + "%" + "\n";
		rslt += "이자: " + calcInterest() + "원" + "\n";
		return rslt;
	}
	public int calcInterest() {
		return (int)(balance * (rate/100));
	}
	
}
