//��ǻ���а�, 20201704, ������
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
		
		rslt += "�̸�: " + name + "\n";
		rslt += "���� ��ȣ: " + accountNo + "\n";
		rslt += "�ܾ�: " + balance + "��" + "\n";
		rslt += "������: " + rate + "%" + "\n";
		rslt += "����: " + calcInterest() + "��" + "\n";
		return rslt;
	}
	public int calcInterest() {
		return (int)(balance * (rate/100));
	}
	
}
