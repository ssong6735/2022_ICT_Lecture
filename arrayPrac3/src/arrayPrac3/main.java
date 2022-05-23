package arrayPrac3;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		/*
		 * 다음의 프로그램을 작성하시오. (학점 평균 프로그램)
		 * 1. 사람 클래스 생성 (이름, 학점 포함)
		 * 2. ArrayList를 통해 사람 클래스 관리
		 * 3. 관리되는 사람
		 *    이름: 이선민, 학점: 4.5
		 *    이름: 박재현, 학점: 4.5
		 *    이름: 홍재광, 학점: 4.5
		 *    이름: 신도현, 학점: 4.5
		 *    이름: 김민수, 학점: 4.5
		 *    이름: 이이름, 학점: 4.2
		 *    이름: 박이름, 학점: 3.9
		 *    이름: 홍이름, 학점: 2.4
		 *    이름: 신이름, 학점: 1.7
		 *    이름: 김이름, 학점: 2.8
		 * 4. 학점이 4.0 이상인 인원 이름 출력
		 * 5. 전체 인원의 학점 평균 출력
		 */
		
		System.out.println("ArrayList 학점 관리 프로그램 시작!");
		
		ArrayList<People> pArrList = new ArrayList<People>();
		pArrList.clear();
		
		pArrList.add(new People("이선민",4.5));
		pArrList.add(new People("박재현",4.5));
		pArrList.add(new People("홍재광",4.5));
		pArrList.add(new People("신도현",4.5));
		pArrList.add(new People("김민수",4.5));
		pArrList.add(new People("이이름",4.2));
		pArrList.add(new People("박이름",3.9));
		pArrList.add(new People("홍이름",2.4));
		pArrList.add(new People("신이름",1.7));
		pArrList.add(new People("김이름",2.8));
		
		
		System.out.println("---학점이 4.0 이상인 인원 목록---");		
		// 전체 배열 학점중에 4.0 이상인 사람 찾기
		// 찾은 사람 출력		
//		for(int i=0;i<pArrList.size();i++) {
//			People p1 = pArrList.get(i);
//			if(p1.getGrade()>=4.0) {
//				System.out.println("이름 : " + p1.getName());
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
		
		System.out.println("---전체 인원의 학점 평균---");
		System.out.println("학점 평균: " + avg);
		System.out.println("----------------------");
		
	}
	
}
