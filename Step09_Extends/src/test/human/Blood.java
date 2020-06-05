package test.human;

//혈액형 정보를 저장할 객체를 생성할 클래스
public class Blood {
	//필드(는 되도록 private : 같은클래스, 같은 객체 안에서만 접근가능)
	//필드를 private로 사용하는 이유? 직접 수정하지 못하도록. 수정이 필요하면 접근메서드를 사용해야함(get,set)
	private String rh;
	private String type;
	//생성자
	public Blood(String rh, String type) {
		this.rh=rh;
		this.type=type;
	}
	/*
	 * 필드를 선언하고나서 get을 타이핑 후 ctrl+space 키를 누르면
	 * 이클립스가 getter 메소드를 자동으로 만들어 줄 준비를 한다.
	 */
	//필드에 저장된 rh를 리턴해주는 getter 메소드
	public String getRh() {
		return rh;
	}
	//필드에 저장된 type을 리턴해주는 getter 메소드
	public String getType() {
		return type;
	}
	
}
