//��ǻ���а�, 20201704, ������
public class Movie {
	private String title, director;
	private int score, year;
	
	public void setTitle(String t) {title = t;}
	public void setDirector(String d) {director = d;}
	public void setScore(int s) {score = s;}
	public void setYear(int y) {year = y;}
	
	public String getTitle(String t) {return title;}
	public String getDirector(String d) {return director;}
	public int getScore(int s) {return score;}
	public int getYear(int y) {return year;}
	
	public String toString() {
		String rslt = "";
		rslt += "����: " + title + "\n";
		rslt += "����: " + score + "��" + "\n";
		rslt += "����: " + director + "\n";
		rslt += "�����⵵: " + year + "��" + "\n";
		
		return rslt;
	}
	
}