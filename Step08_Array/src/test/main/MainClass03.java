package test.main;

public class MainClass03 {
	public static void main(String[] ar) {
		//String type을 담을수 있는방 3개짜리 빈 배열객체를 만들어서 참조값을
		//지역변수 names에 담기
		String[] names= {null, null, null};
		//각각의 방에 순서대로 String type 담기
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		//null로 초기화된 방3개짜리 String[] 객체 만들어서 참조값을 지역변수 nums2에 담기
		String[] names2=new String[3];
		names2[0]="주뎅이";
		names2[1]="덩어리";
		names2[2]="개다리";
	}
}
