//��ǻ���а�, 20201704, ������
import java.util.Random;
public class Movie {
	private String mid, title, director;
	private int year, score;
	
	public void setMid(String mid) {this.mid = mid;}
	public void setTitle(String title) {this.title = title;}
	public void setDirector(String director) {this.director = director;}
	public void setYear(int year) {this.year = year;}
	public void setScore(int score) {this.score = score;}
	
	public String getMid() {return mid;}
	public String getTitle() {return title;}
	public String getDirector() {return director;}
	public int getYear() {return year;}
	public int getScore() {return score;}
	
	public Movie() {
		
		this.mid = makeID();
		this.title = "��";
		this.director = "��";
		this.year = -1;
		this.score = -1;
	}
	
	private String makeID() {
		Random rg  = new Random();
		String rslt = "";
		int num1 = rg.nextInt(9000) + 1000;
		int num2 = rg.nextInt(9000) + 1000;
		rslt = num1 + "-" + num2;
		return rslt;
	}
	
	public String toString() {
		String rslt = "";
		rslt += "��ȣ: " + mid + "\n";
		rslt += "����: " + title + "\n";
		rslt += "����: " + director + "\n";
		rslt += "���۳⵵: " + year + "��\n";
		rslt += "����: " + score + "��\n";
		return rslt;
	}
	
	public static String compareMovies(Movie x, Movie y) {
		boolean resultDirector = compareDirector(x, y);
		boolean resultYear = compareYear(x, y);
		String rslt = "��ȭ" + x.mid + "�� ��ȭ" + y.mid + "��";
		
		if(resultDirector == true && resultYear == true) {
				rslt += "������ ���� ���۳⵵�� �����ϴ�.";
		}
		else if(resultDirector == true && resultYear == false) {
				rslt += "������ ���� ���۳⵵�� �ٸ��ϴ�.";
		}
		else if(resultDirector == false && resultYear == true){
				rslt += "������ �ٸ��� ���۳⵵�� �����ϴ�.";
		}
		else {
				rslt += "������ �ٸ��� ���۳⵵�� �ٸ��ϴ�.";
		}
		
		return rslt;
		
	}
	private static boolean compareDirector(Movie x, Movie y) {
		if(x.director.equals(y.director) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	private static boolean compareYear(Movie x, Movie y) {
		if(x.year == y.year) {
			return true;
		}
		else {
			return false;
		}
	}
}
