package test.main;
import java.io.*;
import java.util.Random;
public class test {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Random ran = new Random();
		int com = ran.nextInt(3)+1;
		int me = 0;
		int c = 1;
		int d = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		int all = 0;
		while(c < 11) {
			System.out.print("무엇을 낼건가요? (1 : 주먹 2 : 가위 3 : 보 ) :");
			me = Integer.parseInt(in.readLine());
			if(com == me) {
				System.out.println("비겼습니다!");
				draw +=1;
				all+=1;
			}else if(com == 1 && me == 2) {
				System.out.println("패배!");
				lose+=1;
				all+=1;
			}else if(com == 1 && me == 3) {
				System.out.println("승리!");
				win += 1;
				all+=1;
			}else if(com == 2 && me == 1) {
				System.out.println("승리!");
				win+=1;
				all+=1;
			}else if(com == 2 && me == 3) {
				System.out.println("패배!");
				lose+=1;
				all+=1;
			}else if(com == 3 && me == 1) {
				System.out.println("패배!");
				lose+=1;
				all+=1;
			}else if(com == 3 && me == 2) {
				System.out.println("승리!");
				win+=1;
				all+=1;
			}
			System.out.print("다시하시겠습니까? (1 : yes, 2 : no) :");
			d = Integer.parseInt(in.readLine());
			if(d == 1) {
				c++;
				System.out.println("현재전적 : " + win + "승 " + lose + "패 " + draw + "무 " + "승률 " + ((win/all)*100) +"%");
				System.out.println("===== 게임이 다시 시작됩니다 =====");
			}else if(d == 2) {
				c += 11;
				System.out.println("최종전적 : " + win + "승 " + lose + "패 " + draw + "무 " + "승률 " + ((win/all)*100) +"%");
				System.out.println("===== 게임 종료 ======");
			}
			
		}
		
		
	}
}
