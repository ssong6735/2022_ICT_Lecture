package takeEx;

public class main {

	public static void main(String[] args) {
		
		People peopleKim = new People("�質��", 19, 10000, "�л�");
		People peopleLee = new People("�̼���", 15, 100, "�л�");
		People peoplePark = new People("�ڹ���", 32, 1000000, "������");
		People peopleSong = new People("���ر�", 31, 100000, "������");
		
		peopleKim.takeBus();
		peopleLee.takeSubway();
		peoplePark.takeBus();
		peopleSong.takeSubway();
		
	}
	
}
