package arrayPrac3;

import java.util.ArrayList;

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
		
		ArrayList<People> pArrList = new ArrayList<People>();
		pArrList.clear();
		
		pArrList.add(new People("�̼���",4.5));
		pArrList.add(new People("������",4.5));
		pArrList.add(new People("ȫ�籤",4.5));
		pArrList.add(new People("�ŵ���",4.5));
		pArrList.add(new People("��μ�",4.5));
		pArrList.add(new People("���̸�",4.2));
		pArrList.add(new People("���̸�",3.9));
		pArrList.add(new People("ȫ�̸�",2.4));
		pArrList.add(new People("���̸�",1.7));
		pArrList.add(new People("���̸�",2.8));
		
		
		System.out.println("---������ 4.0 �̻��� �ο� ���---");		
		// ��ü �迭 �����߿� 4.0 �̻��� ��� ã��
		// ã�� ��� ���		
//		for(int i=0;i<pArrList.size();i++) {
//			People p1 = pArrList.get(i);
//			if(p1.getGrade()>=4.0) {
//				System.out.println("�̸� : " + p1.getName());
//			}			
//		}
		for(int i=0;i<pArrList.size();i++) {
			pArrList.get(i).checkGrade();
		}		
		System.out.println("---------------------------");		
		
		double sum = 0.0;
		int cnt = 0;
//		for(int i=0;i<pArrList.size();i++) {
//			cnt++;
//			People p1 = pArrList.get(i);
//			double grade = p1.getGrade();			
//			sum = sum + grade;
//		}
		
		for(int i=0;i<pArrList.size();i++) {
			sum += pArrList.get(i).getGrade();
			cnt++;
		}
		double avg = sum / pArrList.size();		
		
		System.out.println("---��ü �ο��� ���� ���---");
		System.out.println("���� ���: " + avg);
		System.out.println("----------------------");
		
	}
	
}
