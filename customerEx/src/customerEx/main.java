package customerEx;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Customer c1 = new Customer(6735, "�۹̼�");
		 * System.out.println("���ұݾ�: " + c1.calcPrice(1000)); 
		 * System.out.println(c1.showCustomerInfo());
		 * 
		 * VIPCustomer vc1 = new VIPCustomer(2042, "VIP��");
		 * System.out.println("���ұݾ�: " + vc1.calcPrice(1000));
		 * System.out.println(vc1.showCustomerInfo());
		 */
		
		// ������ ����ȯ
		Customer vc = new VIPCustomer(5041, "����");
		// �������̵��� �Լ� ȣ��
		System.out.println(vc.calcPrice(1000));
		System.out.println(vc.showCustomerInfo());
		
		VIPCustomer vc2 = new VIPCustomer(5042, "����2");
		System.out.println(vc2.showCustomerInfo());
		
//		System.out.println(vc.getAgentID()); // �ڽ�Ŭ���� ����� ���x
		System.out.println(vc2.getAgentID());
		
		
	}
	
}
