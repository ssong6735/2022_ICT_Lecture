package schedulerEx;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		// 스캐너로 char 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("콜 배분 방법을 입력하세요. (R/L/P)");
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
			System.out.println("지원하지 않는 기능입니다.");
			isSupport = false;
		}
		
		if(isSupport==true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		sc.close();
		
		
	}
	
}
