//��ǻ���а�, 20201704, ������
package game;

public class Practice65A {
	
	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();

		while(true) {
			int i=1;
			System.out.print(i+"�� : ù��° " + dice1.toString());
			System.out.println(", �ι�° " + dice2.toString());
			i++;
			if(dice1.getValue() == dice2.getValue()) {break;}
		}
		System.out.print("������ ����Ǿ����ϴ�.");
	}
}
