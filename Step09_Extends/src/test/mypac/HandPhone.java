package test.mypac;

//Phone 클래스를 상속받은 HandPhone 클래스
public class HandPhone extends Phone{
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요");
	}
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}
}
