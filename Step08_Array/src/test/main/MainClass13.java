package test.main;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MainClass13 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] Krsp= {"가위","바위","보"};
		String[] Ersp= {"s","r","p"};
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		int d = 0;
		int me=0;
		String Mstr="";
		int coin = 0;
		while(coin<11) {
			System.out.println("==========가위바위보 시작=========");
			//1. 사용자 입력을 받는다.
			System.out.print("무엇을 낼건가요? (s : 가위, r : 바위 p : 보)");
			Mstr=in.readLine();
			//2. 입력값을 변환.
			if(Mstr.equals("s")) {me=0;}
			else if(Mstr.equals("r")) {me=1;}
			else if(Mstr.equals("p")){me=2;}
			
			//3. computer도 랜덤하게 하나의 숫자를 부여받는다.
			int Cstr=ran.nextInt(3);
			
			System.out.println("컴퓨터 : " + Krsp[Cstr]+" vs 나 : " + Krsp[me]);
			if(me == Cstr) {
				System.out.println("무승부!");
				draw ++;
			}else if((me==1 && Cstr==0)) {
				System.out.println("승리!");
				win ++;
			}else if((me==0 && Cstr==2)) {
				System.out.println("승리!");
				win ++;
			}else if((me==2 && Cstr==1)) {
				System.out.println("승리!");
				win ++;
			}else{
				System.out.println("패배!");
				lose ++;
			}
			float all = win+draw+lose;
			System.out.println("현재전적 : " + win + "승 " + lose + "패 " + draw + "무 " + "승률 " + ((win/all)*100) +"%");
			System.out.print("다시하시겠습니까? (1 : yes, 2 : no) :");
			d = Integer.parseInt(in.readLine());
			if(d == 1) {
				System.out.println("===== 게임이 다시 시작됩니다 =====");
			}else if(d == 2) {
				coin += 11;
				System.out.println("===== 게임 종료 ======");
			}
		}
			
			
	}
}
