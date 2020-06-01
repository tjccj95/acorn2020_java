package test.main;
/*
 * [접근지정자]
 * 클래스, 필드, 메소드에 작성한다.
 * 
 * 1. public
 *  - 어디에서나 자유롭게 접근 가능
 *  
 * 2. default(접근 지정자를 작성하지 않은 경우)
 * 	- 동일한 package 내에서만 접근 가능
 *  - package가 다르면 import도 불가능하다
 *  
 * 3. private
 * 4. protect
 */

import test.mypac.Marine;
import java.io.*;

public class MainClass07 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		/*
		 * Marine 객체를 생성해서 참조값을 m1이라는 지역 변수에 담아보세요
		 */

		Marine m1=new Marine();
		m1.move();
		m1.attack();
		m1.showEnergy();
		System.out.println("--- m1 ---");
		
		Marine m2=new Marine();
		m2.move();
		m2.attack();
		m2.showEnergy();
		System.out.println("--- m2 ---");
		
		//Marine의 공격력을 올려보자(모든 Marine 객체의 공격력에 영향을 미친다)
		Marine.attackrPower += 2;
		m1.attack();
		m2.attack();
		
		//m1의 에너지 감소시키기(m2의 에너지에는 영향을 주지 않는다)
		m1.energy -= 10;
		m1.showEnergy();
		m2.showEnergy();
		
		//System.out.print("마린을 공격하시겠습니까? (1 : Yes 2 : No");
		//a = Integer.parseInt(in.readLine());
		//if(a == 1){Marine.energy}
	}
}
