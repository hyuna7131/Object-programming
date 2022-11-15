//컴퓨터학과, 20201704, 이현아
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
		this.title = "모름";
		this.director = "모름";
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
		rslt += "번호: " + mid + "\n";
		rslt += "제목: " + title + "\n";
		rslt += "감독: " + director + "\n";
		rslt += "제작년도: " + year + "년\n";
		rslt += "평점: " + score + "점\n";
		return rslt;
	}
}
