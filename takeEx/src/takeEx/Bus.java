package takeEx;

public class Bus {

	private static Bus bIns;
	
	private int price = 0; // ��
	private int sPrice = 1000; // �л� ���
	private int wPrice = 1300; // ������ ���
	private int pCnt = 0; // �°� ��
	
	
	// constructor
	private Bus() {
		System.out.println("----------------------");
		System.out.println("103�� ���� ���� ����!");
		System.out.println("----------------------");
	}
	
	public static Bus getBusIns() {
		if(bIns == null) {
			bIns = new Bus();
		}
		return bIns;
	}
	
	
	// method
	public void takeBus(People people) {
		/*
		 *  ����(�л�,������)�� ���� ��ݸ�ŭ �� �߰�
		 *  People Ŭ�������� �� ����, �°��� ����
		 *  people�� ���� ���ڶ�� ���� �߰����� �ʰ�
		 *  �°����� �ø��� �ʴ´�.
		 */
		
		if(people.payFee(wPrice) || people.payFee(sPrice)) {
			if(people.getJob()=="������") {
				this.price += wPrice;
				people.payFee(price);
				pCnt++;
				System.out.println("----------------------");
				System.out.println("�ߺ�! ������ �Դϴ�.");
				System.out.printf("%s���� �ܾ�: %d \n", people.getName(),people.getMoney());
				System.out.println("������ �� ����: " + price);
				System.out.println("������ ź ��� ��: " + pCnt);
				System.out.println("----------------------\n");
			} else if(people.getJob()=="�л�") {
				this.price += sPrice;
				people.payFee(price);
				pCnt++;
				System.out.println("----------------------");
				System.out.println("�ߺ�! �л� �Դϴ�.");
				System.out.printf("%s���� �ܾ�: %d \n", people.getName(),people.getMoney());
				System.out.println("������ �� ����: " + price);
				System.out.println("������ ź ��� ��: " + pCnt);
				System.out.println("----------------------\n");

			} else {
				System.out.println("������ Ȯ���� �� �����ϴ�.");
			}
		} else {
			System.out.println("----------------------");
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.printf("%s���� �ܾ�: %d \n", people.getName(),people.getMoney());
			System.out.println("������ �� ����: " + price);
			System.out.println("������ ź ��� ��: " + pCnt);
			System.out.println("----------------------\n");
			
		}
	}
	
}
