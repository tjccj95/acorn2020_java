package test.main;

import java.util.Scanner;

public interface MainClass06 {
	public static void main(String[] args) {
		/*
		 * Scanner 객체를 이용해서 문자열을 5번입력받아
		 * 입력받은 문자열은 차례대로 배열에 저장되어야 한다.
		 * 모두다 입력받은후 for문을 이용해서 배열에 저장된
		 * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해보세요
		 */
		Scanner[] scan = new Scanner[5];
		String[] str = new String[5];
		System.out.println("첫번째줄 문자열 입력 : ");
		str[0]=scan[0].nextLine();
		System.out.println("두번째줄 문자열 입력 : ");
		str[1]=scan[1].nextLine();
		System.out.println("세번째줄 문자열 입력 : ");
		str[2]=scan[2].nextLine();
		System.out.println("네번째줄 문자열 입력 : ");
		str[3]=scan[3].nextLine();
		System.out.println("다섯번째줄 문자열 입력 : ");
		str[4]=scan[4].nextLine();
		
		for(int i = 0; i<scan.length;i++) {
			System.out.println(scan[i].nextLine());
		}
		
		
		/*
		 * 2. Random 객체를 이용해서 로또번호를 6개 래넘하게 얻어내서
		 * 배열에 저장한다.
		 */
	}
}
