package takeEx;

public class Bus {

	// 싱글톤으로 만들기 위한 인스턴스
	private static Bus bIns;
	
	int money = 0; // 돈
	int sPrice = 720; // 학생 요금
	int wPrice = 1250; // 직장인 요금
	int pCnt = 0; // 승객 수
	
	
	// 생성자를 private으로 막아둔다.
	private Bus() {
		System.out.println("----------------------");
		System.out.println("103번 버스 최초 생성!");
		System.out.println("----------------------");
	}
	
	// 외부에서 사용할 메서드
	public static Bus getBusIns() {
		if(bIns == null) {
			bIns = new Bus();
		}
		return bIns;
	}
	
	
	// method
	public void takeBus(People people) {
		/*
		 *  직업(학생,직장인)에 따라 요금만큼 돈 추가
		 *  People 클래스에서 돈 차감, 승객수 증가
		 *  people의 돈이 모자라면 돈을 추가하지 않고
		 *  승객수도 늘리지 않는다.
		 */
		
		System.out.println("----------------------");
		switch(people.job) {
			case "직장인":
				if(people.payFee(wPrice)) {
					System.out.println("삐빅! 직장인 입니다.");
					money += wPrice;
					people.money -= wPrice;
					pCnt++;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
				
			case "학생":
				if(people.payFee(sPrice)) {
					System.out.println("삐빅! 학생 입니다.");
					money += sPrice;
					people.money -= sPrice;
					pCnt++;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			
			default:
				System.out.println("잘못된 직업입니다." + people.job);
				break;
		}
		System.out.printf("%s님의 잔액: %d \n", people.name,people.money);
		System.out.println("버스가 번 수입: " + money);
		System.out.println("버스에 탄 사람 수: " + pCnt);
		System.out.println("----------------------\n");		
	}
	
}
