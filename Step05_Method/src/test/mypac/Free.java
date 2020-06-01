package test.mypac;

public class Free {
	public void myKor(float kor) {
		System.out.println("내 국어점수 : "+kor);
	}
	public void myEng(double eng) {
		System.out.println("내 영어점수 : " + eng);
	}
	public void myTch(String tch) {
		System.out.println("선생님이름 : " + tch);
	}
	public void myGye1(myGye plus) {
		System.out.println("총점");
	}
	public void myGye2(myAvg avg) {
		System.out.println("평균");
	}
	public void NaFi1(String kor1, NaFi grade) {
		grade.open();
	}
	public void Cal(myGye plus, myAvg avg) {
		System.out.println("총점및평균");
	}
}
