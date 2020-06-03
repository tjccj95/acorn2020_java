package test.main;
/*
 * 2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요
 */
import java.util.Random;
import java.io.*;
public class MainClass09 {
	public static void main(String[] ar)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Random ran = new Random();
		String[] list = {"cherry", "apple", "banana", "melon", "7"};
		int[] num = new int[3];
		for(int i=0;i<num.length;i++) {
			num[i] = ran.nextInt(5);
		}
		int rew = 0;
		int win = 0;
		int lose = 0;
		int a = 0;
		//중첩 제어문
		//while(num1 == num2 |num1 == num3 |num2 == num3) {
		//	num1 = ran.nextInt(5);
		//	num2 = ran.nextInt(5);
		//	num3 = ran.nextInt(5);
		//	if(num1 != num2 && num1 != num3 && num2 != num3) {
		//		break;
		//	}
		//}
		
		System.out.println("=========== 복불복 ===========");
		System.out.println(list[num[0]] + "|" + list[num[1]] + "|" +list[num[2]]);
		if(num[0] == num[1] && num[0] == num[2] && num[1] == num[2]) {
			rew += 100;
			win += 1;
		}else {
			lose += 1;
		}
		System.out.println("총전적 : "+win+"승" + lose + "패" + " 누적상금 : " + rew + "원");
		System.out.print("다시하시겠습니까? (1 : yes 2 : no) :");
		a = Integer.parseInt(in.readLine());
		if(a == 1) {
			System.out.println("=========== 복불복 ===========");
			System.out.println(list[num[0]] + "|" + list[num[1]] + "|" +list[num[2]]);
			if(num[0] == num[1] && num[0] == num[2] && num[1] == num[2]) {
				rew += 100;
				win += 1;
			}else {
				lose += 1;
			System.out.println("총전적 : "+win+"승" + lose + "패" + " 누적상금 : " + rew + "만원");
			System.out.print("다시하시겠습니까? (1 : yes 2 : no) :");
			a = Integer.parseInt(in.readLine());
			}
		}else if(a == 2) {
			System.out.println("게임종료");
			System.out.println("총상금 : " + rew + "만원");
			}
		
		
		
	}
}
