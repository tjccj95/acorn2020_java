package test.main;

public class MainClass02 {
	public static void main(String[] ar) {
		//0으로 초기화된방 3개짜리 int[] 객체 만들어서 참조값을 지역변수 nums에 담기
		int[] nums = {0, 0, 0};
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
	
		
		//0으로 초기화된 방3개짜리 int[] 객체 만들어서 참조값을 지역변수 nums2에 담기
		int[] nums2=new int[3];
		nums2[0]=100;
		nums2[1]=200;
		nums2[2]=300;
		//nums2[3]=400; 방의 갯수가 3개여서 오류발생
		
	}
}
