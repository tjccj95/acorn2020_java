package test.main;

import test.human.Blood;

public class MainClass10{
	public static void main(String[] args) {
		//Blood 객체를 생성해서 참조값을 b1이라는 지역변수에 담아보세요
		Blood b1 = new Blood("+","O"); //Rh+ O형 혈액형을 의미
		//private로 묶인 필드는 get이라는 메서드를 통해서 리턴해올수있다.
		Blood b2 = new Blood("+","A");//Rh+ A형 혈액형을 의미

		String result1=b1.getRh();
		String result2=b1.getType();
		
		String result3=b2.getRh();
		String result4=b2.getType();
	}
}

