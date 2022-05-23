package customerEx;

public class VIPCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	
	
	// constructor
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.agentID = 3000;
		this.saleRatio = 0.1;
	}

	
	// method overriding (오버라이딩된 함수는 인스턴스를 따라간다)
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price*saleRatio);
	}
		
	
	// get/set
	public int getAgentID() {
		return this.agentID;
	}
	
	
	
}
