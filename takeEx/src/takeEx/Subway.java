package takeEx;

public class Subway {

private static Subway sIns;
	
	private int price = 0; // 돈
	private int sPrice = 1500; // 학생 요금
	private int wPrice = 1800; // 직장인 요금
	private int pCnt = 0; // 승객 수
	
	
	// constructor
	private Subway() {
		System.out.println("----------------------");
		System.out.println("지하철 1호선 최초 생성!");
		System.out.println("----------------------");
	}
	
	public static Subway getSubwayIns() {
		if(sIns == null) {
			sIns = new Subway();
		}
		return sIns;
	}
	
	
	// method
	public void takeSubway(People people) {
		/*
		 *  직업(학생,직장인)에 따라 요금만큼 돈 추가
		 *  People 클래스에서 돈 차감, 승객수 증가
		 *  people의 돈이 모자라면 돈을 추가하지 않고
		 *  승객수도 늘리지 않는다.
		 */
		
		if(people.payFee(wPrice) || people.payFee(sPrice)) {
			if(people.getJob()=="직장인") {
				this.price += wPrice;
				people.payFee(price);
				pCnt++;
				System.out.println("----------------------");
				System.out.println("삐빅! 직장인 입니다.");
				System.out.printf("%s님의 잔액: %d \n", people.getName(),people.getMoney());
				System.out.println("지하철이 번 수입: " + price);
				System.out.println("지하철에 탄 사람 수: " + pCnt);
				System.out.println("----------------------\n");

			} else if(people.getJob()=="학생") {
				this.price += sPrice;
				people.payFee(price);
				pCnt++;
				System.out.println("----------------------");
				System.out.println("삐빅! 학생 입니다.");
				System.out.printf("%s님의 잔액: %d \n", people.getName(),people.getMoney());
				System.out.println("지하철이 번 수입: " + price);
				System.out.println("지하철에 탄 사람 수: " + pCnt);
				System.out.println("----------------------\n");

			} else {
				System.out.println("직업을 확인할 수 없습니다.");
			}
		} else {
			System.out.println("----------------------");
			System.out.println("잔액이 부족합니다.");
			System.out.printf("%s님의 잔액: %d \n", people.getName(),people.getMoney());
			System.out.println("지하철이 번 수입: " + price);
			System.out.println("지하철에 탄 사람 수: " + pCnt);
			System.out.println("----------------------\n");
			
		}
	}
	
}
