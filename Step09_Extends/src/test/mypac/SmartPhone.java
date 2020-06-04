package test.mypac;

public class SmartPhone extends HandPhone {
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	//@Override는 부모의 메소드를 재정의한 메소드라고 표시해주는 어노테이션이다.
	//상위 메서드를 건들지 않는다. 덮어쓰는개념.
	@Override
	public void takePicture() {
		//super.takePicture();
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}	

