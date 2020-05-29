package test.main;
import java.io.*;
public class exam {
	public static void main(String[] ar)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String year = "0";
		String mon = "0";
		String day = "0";
		int loc = 0;
		int gen = 0;
		
		System.out.print("태어난 해(네자리) : ");
		year = in.readLine();
		System.out.print("태어난 달(두자리) : ");
		mon = in.readLine();
		System.out.print("태어난 일(두자리) : ");
		day = in.readLine();
		System.out.print("태어난 지역 (0:서울 1:경기 인천 2:충청 3:강원 4:경북 5:경남 6:전북 7:전남 8:부산 9:제주) : ");
		loc = Integer.parseInt(in.readLine());
		System.out.print("성별(1:남자 2:여자) : ");
		gen = Integer.parseInt(in.readLine());
		
		System.out.println("생성된 주민번호 : " + year.substring(2)+mon+day+'-'+gen+loc+"00000");
		
	}
}
