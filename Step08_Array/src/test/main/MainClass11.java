package test.main;

import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] ar) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("종료(q) 계속(Enter):");
			String str = scan.nextLine();
			String str2 = "q";
			//참조값을 서로 비교할때는 ==로 비교해서는 안됨. equals메서드를 이용한다.
			if(str.equals(str2)) {
				//무한루프 탈출조건
				break;
			}
			System.out.println("무언가 작업합니다.~");
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
}
