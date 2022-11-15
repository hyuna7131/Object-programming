//컴퓨터학과, 20201704, 이현아
package fruit;

public class Food {
	int calory;
	protected int price;
	protected double weight;
	
	public void setCalory(int calory) {this.calory = calory;}
	public int getCalory() {return calory;}
	public void setPrice(int price) {this.price = price;}
	public int getPrice() {return price;}
	public void setWeight(double weight ) {this.weight = weight;}
	public double getWeight() {return weight;}
	
	public String toString() {
		String rslt = "";
		rslt += "칼로리: " + calory + "\n";
		rslt += "가격: " + price + "\n";
		rslt += "무게: " + weight + "\n";
		return rslt;
	}
	
	public Food() {
		calory = 0;
		price = 0;
		weight = 0;
	}
}
