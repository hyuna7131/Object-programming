//컴퓨터학과, 20201704, 이현아
public class Potato extends Food {
	public int getUnitPrice() {
		int cal;
		cal = price / (int)weight;
		return cal;
	}
	
	public String toString() {
		String rslt = "";
		rslt += "칼로리: " + calory + "\n";
		rslt += "가격: " + price + "\n";
		rslt += "무게: " + weight + "\n";
		rslt += "단위가격: " + getUnitPrice();
		return rslt;
	}
}
