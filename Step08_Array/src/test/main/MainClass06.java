package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 문자열을 5번입력받아
		 * 입력받은 문자열은 차례대로 배열에 저장되어야 한다.
		 * 모두다 입력받은후 for문을 이용해서 배열에 저장된
		 * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해보세요
		 */
		System.out.println("=================1번예제===================");
		//Scanner 객체를 생성해서 참조값을 지역변수에 담기
		Scanner scan = new Scanner(System.in);
		//문자열(String) 5개를 담을수 있는 배열 객체 생성해서 참조값을 지역변수에 담기
		String[] msgs = new String[5];
		
		//5번 문자열을 입력받기 위해 for문을 구성
		for(int i=0;i<msgs.length;i++) {
			System.out.println((i+1)+"번째줄 문자열 입력 : ");
			String str=scan.nextLine();
			//입력받은 문자열의 참조값을 배열에 순서대로 저장하기
			msgs[i]=str;
		}
		System.out.println("================ 내용요약 ===============");
		for(int i = 0; i<msgs.length;i++) {
			//i번째 방에 있는 String 객체의 참조값을 가져온다.
			String tmp = msgs[i];
			//콘솔 출력
			System.out.println(tmp);
		}
		System.out.println("=======================================");
		
		

	}
}
