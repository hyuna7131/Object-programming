//컴퓨터학과, 20201704, 이현아
public class Date {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year) {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDay(int day) {this.day = day;}
	
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
	
	public Date() {
		this(1900, 1, 1);
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		String rslt = "";
		rslt += year + "년 ";
		rslt += month + "월 ";
		rslt += day + "일";
		
		return rslt;
	}
	
	public static int compareDate(Date x, Date y) {
		if (x.year < y.year) {
			return -1;
			}
		else if(x.year == y.year) {
			if(x.month < y.month) {
				return -1;
			}
			else if(x.month == y.month) {
				if(x.day < y.day) {
					return -1;
				}
				else if(x.day == y.day) {
					return 0;
				}
				else {
					return 1;
				}
			}
			else {
				return 1;
			}
		}
		else {
			return 1;
		}
		
	}
	
}
