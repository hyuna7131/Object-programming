//컴퓨터학과, 20201704, 이현아
public class Eagle extends Animal {
	private int wings = 2;
	
	public void setWings(int wings) {this.wings = wings;}
	public int getWings(int wings) {return wings;}
	
	void fly() {
		System.out.print("fly()가 호출되었음");
	}
	void fly2() {
		sleep();
		System.out.print(" : ");
		fly();
	}
	public String toString() {
		String rslt = "";
		rslt += "몸무게: " + String.format("%.2f", getWeight()) + "kg - ";
		rslt += "그림 설명: " + picture + " - ";
		rslt += "날개: " + wings + "개";
		return rslt;
	}
}
