package test.mypac;
/*
 * [메소드를 만들때 고려해야 하는것]
 * 
 * 1. 접근 지정자
 * 2. 리턴 type
 * 3. 메소드명
 * 4. 메소드에 전달하는 인자의 갯수와 데이터 type
 */
public class MyObject {
	/*
	 * public => 이 메소드는 어디에서든 접근 가능하다
	 * void => 이 메소드는 어떤값도 리턴하지 않는다.
	 * walk => 메소드명
	 * walk() => 이 메소드는 어떤값도 전달받지 않는다.
	 */
	public void walk() {
		System.out.println("걸음을 걸어요~");
	}
	
	//int type을 리턴해주는 메소드
	public int getNumber() {
		int myNum=10;
		//int type을 리턴해주어야 문법이 성립한다.
		return myNum;
	}
	
	// String type을 리턴해주는 메소드
	public String getGreeting() {
		String greet="안녕하세요";
		return greet;
	}
}
