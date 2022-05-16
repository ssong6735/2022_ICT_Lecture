package classEx2;

public class main {

	public static void main(String[]  args) {
		
		System.out.println("프로그램 시작!");
		
		Recipe recipe1;
		Recipe recipe2;
		recipe1 = new Recipe();
		recipe1.setSource(2);
		recipe2 = recipe1;
		recipe2.setSource(2);		
		
	}
	
}
