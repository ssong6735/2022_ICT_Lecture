import java.util.*;

public class main {

	public static void main(String[] args) {

		/*
		 * Ķ���� ����� 
		 * ������ �޿� ���� �ش� ���� �� ��¥�� ����ϴ� ���α׷��� ����ÿ�
		 * 
		 * 1. ������ ���� int�� �ڷ����� ����Ѵ�. 
		 * - int year, int month
		 * 
		 * 2. ���⿡ ���� 2���� �� ��¥�� ����ǰ� ����Ѵ�. 
		 * - 100���� ������ ���������� 400���� ������ �������� �ʴ� �ش� �������
		 * �Ѵ�. (��): 1900��, 2100��)
		 * 
		 * 3. Scanner�� Ȱ���� �� �ִٸ� 1�� �׸��� ������ ���� �Է¹޾�
		 * ��¥�� ����ϵ��� �Ѵ�.
		 * - ������ �Է��ϼ���: 
		 * - ���� �Է��ϼ���:
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int year = sc.nextInt();
		System.out.println("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
//		int year = 2020;
//		int month = 2;
		
		if(year>=1000&&month>=1&&month<=12) {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(year+"�� "+month+"���� �� 31�� �Դϴ�.");
				break;
			case 2:
//				if((year%100==0)&&(year%400!=0)) { //���
				if((year%4==0&&year%100!=0)||year%400==0) { //����
					System.out.println(year+"�� "+month+"���� �� 29�� �Դϴ�.");
					break;
				} else { 
					System.out.println(year+"�� "+month+"���� �� 28�� �Դϴ�.");
					break;
				}
			default:
				System.out.println(year+"�� "+month+"���� �� 30�� �Դϴ�.");
				break;				
			}
		} else {
			System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�.");			
		}
		sc.close();
	
	}

}
