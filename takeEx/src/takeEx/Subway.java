package takeEx;

public class Subway {

	// �̱������� ����� ���� �ν��Ͻ�
	private static Subway sIns;
	
	int money = 0; // ��
	int sPrice = 720; // �л� ���
	int wPrice = 1250; // ������ ���
	int pCnt = 0; // �°� ��
	
	
	// �����ڸ� private���� ���Ƶд�.
	private Subway() {
		System.out.println("----------------------");
		System.out.println("����ö 1ȣ�� ���� ����!");
		System.out.println("----------------------");
	}
	
	// �ܺο��� ����� �޼���
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
		
		System.out.println("----------------------");
		switch(people.job) {
		case "������":
			if(people.payFee(wPrice)) {
				System.out.println("�ߺ�! ������ �Դϴ�.");
				money += wPrice;
				people.money -= wPrice;
				pCnt++;
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			break;
			
		case "�л�":
			if(people.payFee(sPrice)) {
				System.out.println("�ߺ�! �л� �Դϴ�.");
				money += sPrice;
				people.money -= sPrice;
				pCnt++;
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			break;
		
		default:
			System.out.println("�߸��� �����Դϴ�." + people.job);
			break;
	}
	System.out.printf("%s���� �ܾ�: %d \n", people.name,people.money);
	System.out.println("����ö�� �� ����: " + money);
	System.out.println("����ö�� ź ��� ��: " + pCnt);
	System.out.println("----------------------\n");	
	}
	
}
