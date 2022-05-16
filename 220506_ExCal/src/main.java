import java.util.*;

public class main {

	public static void main(String[] args) {

		/*
		 * 캘린더 만들기 
		 * 연도와 달에 따라 해당 달의 총 날짜를 출력하는 프로그램을 만드시오
		 * 
		 * 1. 연도와 달은 int형 자료형을 사용한다. 
		 * - int year, int month
		 * 
		 * 2. 윤년에 따라 2월의 총 날짜는 변경되게 출력한다. 
		 * - 100으로 나누어 떨어지지만 400으로 나누어 떨어지지 않는 해는 평년으로
		 * 한다. (예): 1900년, 2100년)
		 * 
		 * 3. Scanner를 활용할 수 있다면 1번 항목의 연도와 달을 입력받아
		 * 날짜를 출력하도록 한다.
		 * - 연도를 입력하세요: 
		 * - 달을 입력하세요:
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.println("달을 입력하세요 : ");
		int month = sc.nextInt();
		
//		int year = 2020;
//		int month = 2;
		
		if(year>=1000&&month>=1&&month<=12) {
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(year+"년 "+month+"월은 총 31일 입니다.");
				break;
			case 2:
//				if((year%100==0)&&(year%400!=0)) { //평년
				if((year%4==0&&year%100!=0)||year%400==0) { //윤년
					System.out.println(year+"년 "+month+"월은 총 29일 입니다.");
					break;
				} else { 
					System.out.println(year+"년 "+month+"월은 총 28일 입니다.");
					break;
				}
			default:
				System.out.println(year+"년 "+month+"월은 총 30일 입니다.");
				break;				
			}
		} else {
			System.out.println("입력이 올바르지 않습니다.");			
		}
		sc.close();
	
	}

}
