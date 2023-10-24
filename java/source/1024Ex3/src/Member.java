
public class Member {
	private int mem_id;
	private String mem_name;
	private String mem_pw;
	private String mem_regdate;
	private String mem_gender;
	private String mem_intro;
	
	public Member() {}

	public int getMem_id() {
		return mem_id;
	}



	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}



	public String getMem_name() {
		return mem_name;
	}



	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}



	public String getMem_pw() {
		return mem_pw;
	}



	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}



	public String getMem_regdate() {
		return mem_regdate;
	}



	public void setMem_regdate(String mem_regdate) {
		this.mem_regdate = mem_regdate;
	}



	public String getMem_gender() {
		return mem_gender;
	}



	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}



	public String getMem_intro() {
		return mem_intro;
	}



	public void setMem_intro(String mem_intro) {
		this.mem_intro = mem_intro;
	}



	@Override
	public String toString() {
		return "Member [아이디 = " + mem_id + ", 이름 = " + mem_name + ", 비밀번호 = " + mem_pw + ", 가입일 = "
				+ mem_regdate + ", 성별 = " + mem_gender + ", 자기소개 = " + mem_intro + "]";
	}

	
	
	
}
