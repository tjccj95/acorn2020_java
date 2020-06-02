package test.main;
import test.mypac.Bike;
public class MainClass04 {
	public void now() {
		System.out.println("hello");
	}
	public static void main(String[] ar) {
		/*
		 * 1. Bike 객체를 담는 방 3개짜리 배열객체를 생성해서
		 * 	   참조값을 bikes라는 지역변수에 담아보세요
		 * 2. 배열의 각각의 방(0,1,2번)에 Bike 객체를 생성해서 담아보세요
		 * 3. 반복문 for를 이용해서 배열의 각각의 방에 있는 Bike 객체의
		 * 	  ride() 메소드를 호출해보세요. 
		 */

		Bike[] bikes = new Bike[3];
		
		bikes[0]= new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		//for를 이용한 반복문
		for(int i=0;i<bikes.length;i++) {
			bikes[i].ride();
		}
		//while을 이용한 반복문
		int a = 0;
		while(a<3) {
			bikes[a].ride();
			a += 1;
			if(a>=3) {
				break;
			}
		}
	}
}
