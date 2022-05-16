package takeEx;

public class main {

	public static void main(String[] args) {
		
		People peopleKim = new People("김나나", 19, 10000, "학생");
		People peopleLee = new People("이순신", 15, 100, "학생");
		People peoplePark = new People("박문수", 32, 1000000, "직장인");
		People peopleSong = new People("송준기", 31, 100000, "직장인");
		
		peopleKim.takeBus();
		peopleLee.takeSubway();
		peoplePark.takeBus();
		peopleSong.takeSubway();
		
	}
	
}
