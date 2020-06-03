package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] ar) {
		/*
		 * 2. Random 객체를 이용해서 로또번호를 6개 랜덤하게 얻어내서
		 * 배열에 저장한다.
		 */
		System.out.println("==================2번예제==================");
		// 번호 저장할 공간
		Random ran = new Random();
		// 번호 받아올 공간 6개(공6개만들기)
		int[] ranNum= new int[6];
		for(int i=0;i<ranNum.length;i++) {
			ranNum[i]=ran.nextInt(45)+1;
		}
		//i값이 필요없는 작업.
		for(int tmp : ranNum) {
			System.out.println(tmp);
		};
		//System.out.println("오늘의 로또번호 발표 : " + ranNum[0] +"|"+ ranNum[1]+"|"+ ranNum[2]+"|"+ ranNum[3]+"|"+ ranNum[4]+"|"+ ranNum[5]);
	}
}
