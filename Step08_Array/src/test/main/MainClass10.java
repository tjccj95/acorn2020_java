package test.main;
import java.io.*;
import java.util.Random;
public class MainClass10 {
	public static void main(String[] ar)throws IOException {
		/*
		 * cherry, apple, banana, melon, 7
		 * 
		 * cherry | cherry | cherry
		 * 10점
		 * 
		 * apple | apple | apple
		 * 20점 입니다.
		 * 
		 * 7 | 7 | 7
		 * 1000점 입니다.
		 * 
		 * apple | cherry | apple
		 * 0점 입니다.
		 */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Random ran = new Random();
		String[] list = {"cherry", "apple", "banana", "melon", "7"};
		int coin = 0;
		int sco = 0;
		int yon = 0 ;
		int[] num = new int[3];

		while(coin<11) {
			for(int i=0;i<num.length;i++) {
				num[i] = ran.nextInt(5);
			}
			System.out.println(list[num[0]] + "|" + list[num[1]] + "|" +list[num[2]]);
			
			if(num[0] == 5 && num[1] == 5 && num[2] == 5) {
				System.out.println("1000점 입니다.");
				sco += 1000;
			}else if(num[0] == 1 && num[1] == 1 && num[2] == 1) {
				System.out.println("10점 입니다.");
				sco += 10;
			}else if(num[0] == 2 && num[1] == 2 && num[2] == 2) {
				System.out.println("20점 입니다.");
				sco += 20;
			}else if(num[0] == 3 && num[1] == 3 && num[2] == 3) {
				System.out.println("30점 입니다.");
				sco += 30;
			}else if(num[0] == 4 && num[1] == 4 && num[2] == 4) {
				System.out.println("40점 입니다.");
				sco += 40;
			}else {
				System.out.println("0점 입니다.");
			}
			System.out.println("총 점수 : " + sco);
			System.out.print("다시하시겠습니까?(Enter : yes q : no) : ");
			yon = Integer.parseInt(in.readLine());
			if(yon == 2) {
			System.out.println("=========게임이 종료됩니다!==========");
			coin += 11;
			}
			System.out.println("============다시도전!==============");
			if(yon != 1 && yon != 2) {
				System.out.println("========잘못입력하셨습니다.========");
				while(yon != 1 | yon !=2) {
					System.out.print("다시하시겠습니까?(enter :yes q:no) : ");
					yon = Integer.parseInt(in.readLine());
					if(yon == 1) {
						System.out.println("============다시도전!==============");
						break;
					}
					if(yon == 2) {
						System.out.println("=========게임이 종료됩니다!==========");
						coin +=11;
						break;
					}
				}
				
			}
		}
	}
	
}
