package takeEx;

public class Subway {

private static Subway sIns;
	
	private int price = 0; // ��
	private int sPrice = 1500; // �л� ���
	private int wPrice = 1800; // ������ ���
	private int pCnt = 0; // �°� ��
	
	
	// constructor
	private Subway() {
		System.out.println("----------------------");
		System.out.println("����ö 1ȣ�� ���� ����!");
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
				System.out.println("����ö�� �� ����: " + price);
				System.out.println("����ö�� ź ��� ��: " + pCnt);
				System.out.println("----------------------\n");

			} else if(people.getJob()=="�л�") {
				this.price += sPrice;
				people.payFee(price);
				pCnt++;
				System.out.println("----------------------");
				System.out.println("�ߺ�! �л� �Դϴ�.");
				System.out.printf("%s���� �ܾ�: %d \n", people.getName(),people.getMoney());
				System.out.println("����ö�� �� ����: " + price);
				System.out.println("����ö�� ź ��� ��: " + pCnt);
				System.out.println("----------------------\n");

			} else {
				System.out.println("������ Ȯ���� �� �����ϴ�.");
			}
		} else {
			System.out.println("----------------------");
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.printf("%s���� �ܾ�: %d \n", people.getName(),people.getMoney());
			System.out.println("����ö�� �� ����: " + price);
			System.out.println("����ö�� ź ��� ��: " + pCnt);
			System.out.println("----------------------\n");
			
		}
	}
	
}
