package ch4num03;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	void show() {
		System.out.println("제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("년도 : " + year);
		System.out.println("국가 : " + country);
	}
	
	public Song() {
		title = "";
		artist = "";
		year = 1;
		country = "";
	}

	
	public static void main(String [] args) {
		Song dq = new Song();
		
		dq.artist = "ABBA";
		dq.title = "Dancing Queen";
		dq.year = 1978;
		dq.country ="스웨덴";
		
		dq.show();
		
	}

	int a;

}
