//컴퓨터학과, 20201704, 이현아
import java.util.Random;
public class BankAccount {
	private String name, accountNo;
	private int balance;
	private double rate, interest;
	
	public void setName(String name) {this.name = name;}
	public void setAccountNo(String accountNo) {this.accountNo = accountNo;}
	public void setBalance(int balance) {this.balance = balance;}
	public void setRate(double rate) {this.rate = rate;}
	public void setInterest(double interest) {this.interest = interest;}
	
	public String getName() {return name;}
	public String getAccountNo() {return accountNo;}
	public int getBalance() {return balance;}
	public double getRate() {return rate;}
	public double getInterest() {return interest;}
	
	public BankAccount() {
		this("모름", 0, 0);
	}
	public BankAccount(String name, int balance) {
		this(name, balance, 0);
	}
	public BankAccount(String name, int balance, double interest) {
		setName(name);
		setBalance(balance);
		setInterest(interest);
		setAccountNo(makeID());
		//this.name = name;
		//this.balance = balance;
		//this.interest = interest;
	}
	
	private String makeID() {
		Random rg  = new Random();
		String rslt = "";
		int num1 = rg.nextInt(9000) + 1000;
		int num2 = rg.nextInt(9000) + 1000;
		rslt = num1 + "-" + num2;
		return rslt;
	}
	/*
	private int calcInterest() {
		return (int)(balance * (interest/100));
	}
	*/
	public String toString() {
		String rslt = "";
		rslt += accountNo + " :: " + name + " :: " + balance + "원 :: " + interest + "%"; 
		return rslt;
	}
	
	public boolean deposit(int money) {
		if(money >= 0) {
			this.balance += money;
			return true;
		}
		else
			return false;
	}
	public boolean withdraw(int money) {
		if(money <= balance) {
			this.balance -= money;
			return true;
		}
		else
			return false;
	}
	public static boolean transfer(BankAccount from, BankAccount to, int money) {
		if(from.withdraw(money) == true && to.deposit(money) == true) {
			
			return true;
		}
		else {
			return false;
		}
			
	}
}
