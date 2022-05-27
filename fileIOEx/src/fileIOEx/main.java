package fileIOEx;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class main {

	public static void main(String[] args) {
		
		
		  // 파일 쓰기 
		  File pFile = new File("C:\\Users\\becau\\Desktop\\test.txt");
		   // File pFile = new File("C:\\test.txt"); // 권한 때문에 에러
		  
			/*
			 * try { FileWriter fileWriter1 = new FileWriter(pFile);
			 * fileWriter1.write("안녕하세요."); fileWriter1.flush(); fileWriter1.close(); }
			 * catch (Exception e) { e.printStackTrace(); }
			 */
		 
		
		// 파일 읽기
		try {
			FileReader fileReader = new FileReader(pFile);
			int read;
			char[] buffer = new char[100];
			while((read=fileReader.read(buffer)) != -1) {
				String data = new String(buffer, 0, read);
				System.out.println(data);
			}
			fileReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
