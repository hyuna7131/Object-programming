//��ǻ���а�, 20201704, ������
package casino;

public class Practice65B {

	public static void main(String[] args) {
		game.Dice dice1 = new game.Dice();
		game.Dice dice2 = new game.Dice();

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
