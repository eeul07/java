package ex01;

public class StudentVO {
	// 필드(속성) - table의 컬럼명과 동일하게 해준다.
	private String sno;
	private String sname;
	private String tel;
	
	// set, get 메서드
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
} // class
