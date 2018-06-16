package master.dto;

public class Fd_account_Dto {
     int fd_id;
	 public int getFd_id() {
		return fd_id;
	}
	public void setFd_id(int fd_id) {
		this.fd_id = fd_id;
	}
	String s_accno;
	 double ammount;
	 int no_year;
	 String book_dt;
	public String getS_accno() {
		return s_accno;
	}
	public void setS_accno(String s_accno) {
		this.s_accno = s_accno;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public int getNo_year() {
		return no_year;
	}
	public void setNo_year(int no_year) {
		this.no_year = no_year;
	}
	public String getBook_dt() {
		return book_dt;
	}
	public void setBook_dt(String book_dt) {
		this.book_dt = book_dt;
	}
}
