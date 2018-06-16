package master.dto;

public class FundTransferDto {

	
	String s_accno;
	String b_accno;
	double amount;
	int trans_id;
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public String getS_accno() {
		return s_accno;
	}
	public void setS_accno(String s_accno) {
		this.s_accno = s_accno;
	}
	public String getB_accno() {
		return b_accno;
	}
	public void setB_accno(String b_accno) {
		this.b_accno = b_accno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransdt() {
		return transdt;
	}
	public void setTransdt(String transdt) {
		this.transdt = transdt;
	}
	String transdt;
}
