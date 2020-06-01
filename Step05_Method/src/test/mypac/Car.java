package test.mypac;
/*
 * [클래스의 용도]
 * 
 * 1. 객체의 설계도 역할을 한다.
 * 2. 데이터 type의 역할을 한다.
 * 3. static 필드나(저장소) static 메소드(기능)를 가지고 있는 역할을 한다.
 * 4. 객체는 데이터의 기능과 저장소로 이루어져 있고 heap 영역에 저장된다. 
 */

public class Car {
	//필드
	public String name;
	//달리는 메소드
	public void drive() {
		System.out.println("부릉 부릉 달려요~");
	}
}
