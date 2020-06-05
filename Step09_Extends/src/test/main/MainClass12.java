package test.main;

import test.human.Blood;
import test.human.Woman;
public class MainClass12 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적: 독서를 하고싶다
		 * 독서하는 프로그래밍을 해보세요
		 */
		//지역변수 두개담기
		Blood b1 = new Blood("+","O");
		Woman woman1 = new Woman(b1);
		woman1.reading();
		//지역변수 한개담기
		Woman woman2 = new Woman(new Blood("+","O"));
		woman2.reading();
		//지역변수 안담기
		new Woman(new Blood("+","O")).reading();
		//이 명령어를 다시 사용할지 여부를 잘 알아야 효율적으로 작성가능
	}
	
	
}
