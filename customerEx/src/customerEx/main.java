package customerEx;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Customer c1 = new Customer(6735, "송미선");
		 * System.out.println("지불금액: " + c1.calcPrice(1000)); 
		 * System.out.println(c1.showCustomerInfo());
		 * 
		 * VIPCustomer vc1 = new VIPCustomer(2042, "VIP고객");
		 * System.out.println("지불금액: " + vc1.calcPrice(1000));
		 * System.out.println(vc1.showCustomerInfo());
		 */
		
		// 묵시적 형변환
		Customer vc = new VIPCustomer(5041, "쿠쿠");
		// 오버라이딩된 함수 호출
		System.out.println(vc.calcPrice(1000));
		System.out.println(vc.showCustomerInfo());
		
		VIPCustomer vc2 = new VIPCustomer(5042, "쿠쿠2");
		System.out.println(vc2.showCustomerInfo());
		
//		System.out.println(vc.getAgentID()); // 자식클래스 기능은 사용x
		System.out.println(vc2.getAgentID());
		
		
	}
	
}
