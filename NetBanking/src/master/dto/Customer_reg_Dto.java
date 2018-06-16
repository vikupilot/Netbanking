package master.dto;

public class Customer_reg_Dto {

	String userid;
	String pasw;
	String sec_ques;
	String answer;
	public String getSec_ques() {
		return sec_ques;
	}
	public void setSec_ques(String sec_ques) {
		this.sec_ques = sec_ques;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasw() {
		return pasw;
	}
	public void setPasw(String pasw) {
		this.pasw = pasw;
	}
}
