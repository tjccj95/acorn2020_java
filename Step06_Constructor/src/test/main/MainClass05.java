package test.main;

import java.io.*;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] ar)throws IOException {
		/*
		 * 프로그래밍의 목적 : 키보드로부터 문자열을 입력받고싶다.
		 * 입력받아서 무얼하나? 콘솔창에 출력한다.
		 */
		InputStream a = System.in; 
		//System.in : 키보드의 입력을 받는 객체
		//System.out : 콘솔에 출력을 해주는 객체
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		//키보드로 입력받기 ㅜ이해서는 일단 콘솔창을 열리게 해야한다.
		System.out.println("문자열을 입력하세요 :");
		//Scanner 객체의 메소드를 이용해서 문자열(String) 입력받기
		String str=scan.nextLine();
		//입력받은 문자열을 콘솔창에 출력하기
		System.out.println(str.length() + "개의 음절이 발견되었습니다.");
		System.out.println("main 메소드가 종료됩니다.");
		int b = Integer.parseInt(in.readLine());
	}
}
