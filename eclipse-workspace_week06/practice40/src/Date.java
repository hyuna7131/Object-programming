//컴퓨터학과, 20201704, 이현아
public class Date {
	int year;
	int month;
	int day;
	
	public String toString() {
		String rslt = "";
		rslt += year + "년 ";
		rslt += month + "월 ";
		rslt += day + "일";
		
		return rslt;		
	}
}
