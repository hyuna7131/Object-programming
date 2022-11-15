//컴퓨터학과, 20201704, 이현아
public class Practice15 {

	public static void main(String[] args) {
		int count1 = 0, count2, j;
		
		for (int i = 1;i <= 100; i += 3) {
			System.out.print(i + "\t");
			count1++;
			
			if(count1 % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n");
		
		count2 = 0;
		j = 1;
		while(j <= 100) {
			System.out.print(j + "\t");
			count2++;
			
			if(count2 % 5 == 0) {
				System.out.println();
			}
			j += 3;
		}

	}

}
