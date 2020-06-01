package test.main;

import test.mypac.Free;
import test.mypac.myGye;
import test.mypac.myAvg;
import test.mypac.NaFi;

public class MainClass05 {
	public static void main(String[] ar) {
		/*
		 * test.mypac 패키지에 다양한 모양의 메소드를 가지는 
		 * 클래스를 정의하고
		 * 그 클래스를 이용해서 객체도 생성하고 메소드도 호출해보세요.
		 */
		Free gwa = new Free();
		
		gwa.myKor(100);
		gwa.myEng(80);
		gwa.myTch("김구라");
		gwa.myGye1(new myGye());
		gwa.myGye2(new myAvg());
		gwa.NaFi1("국어", new NaFi());
		gwa.Cal(new myGye(), new myAvg());
	}

}
