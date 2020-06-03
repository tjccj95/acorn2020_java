package test.main;

import java.util.Random;

/*
 * 1. 
 * cherry, apple, banana, melon, 7
 * 
 * 5개의 문자열 중에서 하나가 랜덤하게 출력되게 해보세요.
 * 
 * 2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요
 */
public class MainClass08 {
	public static void main(String[] ar) {
		Random ran = new Random();
		String[] list = {"cherry", "apple", "banana", "melon", "7"};
		int num = ran.nextInt(5);


		System.out.println("=========== 1번 ===========");
		System.out.println(list[num]);

	}
}
