package schedulerEx;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// ��ĳ�ʷ� char ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ��� ����� �Է��ϼ���. (R/L/P)");
		char ch = sc.next().trim().charAt(0);
		boolean isSupport = true;
		
		Scheduler scheduler = null;
		if(ch=='R'||ch=='r') {
			scheduler = new RoundRobin();
		} else if(ch=='L'||ch=='l') {
			scheduler = new LeastJob();
		} else if(ch=='P'||ch=='p') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			isSupport = false;
		}
		
		if(isSupport==true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		sc.close();
		
		
	}
	
}
