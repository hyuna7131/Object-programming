//��ǻ���а�, 20201704, ������
public class Date {
	int year;
	int month;
	int day;
	
	public void setYear(int y) {year = y;}
	public void setMonth(int m) {month = m;}
	public void setDay(int d) {day = d;}
	
	public String toString() {
		String rslt = "";
		rslt += year + "�� ";
		rslt += month + "�� ";
		rslt += day + "��";
		
		return rslt;
	}
	
}
