package master.dto;

public class Rd_account_dto {
	int rd_id;
	double amount;
	String acc_number;
	int no_month;
	public int getRd_id() {
		return rd_id;
	}
	public void setRd_id(int rd_id) {
		this.rd_id = rd_id;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}
	public int getNo_month() {
		return no_month;
	}
	public void setNo_month(int no_month) {
		this.no_month = no_month;
	}
	public String getBook_dt() {
		return book_dt;
	}
	public void setBook_dt(String book_dt) {
		this.book_dt = book_dt;
	}
	String book_dt;
}
