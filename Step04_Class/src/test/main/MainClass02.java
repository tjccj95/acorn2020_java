package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] ar) {
		//MyUtil 클래스의 static 메소드 호출하기
		MyUtil.send();
		//MyUtil 클래스의 static 필드에 값대입하기
		MyUtil.version="1.0";
		
		//static은  독립적인 요소가 필요없을때 사용. 
		//static을 사용하면 새로운 객체를 생성할 필요가 없이 즉시 호출과 참조가 가능하기 때문이다.
		//기능을 나눠서 사용하고자 할때는 static을 붙이지 않는다.
	}
}
