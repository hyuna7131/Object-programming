//컴퓨터학과, 20201704, 이현아
public class Animal {
	private double weight;
	String picture;
	
	public void setWeight(double weight) {this.weight = weight;}
	public double getWeight() {return weight;}
	
	private String printMsg() {
		return ("eat()가 호출되었음");
	}
	void eat() {
		String msg = printMsg();
		System.out.print(msg);
	}
	void sleep() {
		System.out.print("sleep()가 호출되었음");
	}
	
	public String toString() {
		String rslt = "";
		rslt += "몸무게: " + String.format("%.2f", weight) + "kg - ";
		rslt += "그림 설명: " + picture;
		return rslt;
	}
}
