

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		/*
		 * ������ ���α׷��� �ۼ��Ͻÿ�. (���� ��� ���α׷�)
		 * 1. ��� Ŭ���� ���� (�̸�, ���� ����)
		 * 2. ArrayList�� ���� ��� Ŭ���� ����
		 * 3. �����Ǵ� ���
		 *    �̸�: �̼���, ����: 4.5
		 *    �̸�: ������, ����: 4.5
		 *    �̸�: ȫ�籤, ����: 4.5
		 *    �̸�: �ŵ���, ����: 4.5
		 *    �̸�: ��μ�, ����: 4.5
		 *    �̸�: ���̸�, ����: 4.2
		 *    �̸�: ���̸�, ����: 3.9
		 *    �̸�: ȫ�̸�, ����: 2.4
		 *    �̸�: ���̸�, ����: 1.7
		 *    �̸�: ���̸�, ����: 2.8
		 * 4. ������ 4.0 �̻��� �ο� �̸� ���
		 * 5. ��ü �ο��� ���� ��� ���
		 */
		
		System.out.println("ArrayList ���� ���� ���α׷� ����!");
		
		String name;
		double grade = 0.0;	
		
		ArrayList<People> pArrList = new ArrayList<People>();
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<3;i++) {
			System.out.println("�̸��� ������ �Է��ϼ���.");
			name = sc.next();
			grade = sc.nextDouble();		
			pArrList.add(new People(name,grade));
			sc.nextLine();			
		}
		System.out.println("�Է¹��� �迭 ������: "+pArrList.size());
		
		System.out.println("---������ 4.0 �̻��� �ο� ���---");
		for(int i=0;i<pArrList.size();i++) {
			pArrList.get(i).checkGrade();
		}
		System.out.println("---------------------------");
		
		System.out.println("---��ü �ο��� ���� ���---");
		double sum = 0.0;
		int cnt = 0;
		for(int i=0;i<pArrList.size();i++) {
			sum += pArrList.get(i).getGrade();
			cnt++;
		}
		double avg = sum / pArrList.size();		
		System.out.println("���� ���: " + avg);
		System.out.println("----------------------");
		
		sc.close();
		
		
				
		
		
		
		
	}
	
}
