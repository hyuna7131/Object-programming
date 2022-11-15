import java.util.Random;

//��ǻ���а�, 20201704, ������
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
		this("��", 0, 0);
	}
	public BankAccount(String name, int balance) {
		this(name, balance, 0);
	}
	public BankAccount(String name, int balance, double interest) {
		setName(name);
		setBalance(balance);
		setInterest(interest);
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
	
	private int calcInterest() {
		return (int)(balance * (interest/100));
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "�̸�: " + name + "\n";
		rslt += "���� ��ȣ: " + makeID() + "\n";
		rslt += "�ܾ�: " + balance + "��" + "\n";
		rslt += "������: " + interest + "%" + "\n";
		rslt += "����: " + calcInterest() + "��" + "\n";
		return rslt;
	}

}
