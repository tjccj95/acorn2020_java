package test.main;

import test.human.Blood;
import test.human.Men;


public class MainClass11{
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적 : 영화를 보고싶다.
		 * 영화를 보는 프로그래밍의 목적을 달성해보세요
		 */
		Blood b1 = new Blood("+","O");
		Men man1 = new Men(b1);
		//Men man1 = new Men(new Blood("+","A")); 이렇게도 가능(b1 다시 사용못함)
		//new Men(new Blood("+","A")).seeMovie(); 이렇게도 가능(b1, man1 다시 사용못함)
		man1.seeMovie();
		
		
	}
}
