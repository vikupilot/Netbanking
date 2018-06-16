package master.dto;

public class Fd_Report_Dto {
	String acc_number;
	int fd_id;
	  String cid;
	  String cname ;
	  double ammount;
		 int no_year;
		 String book_dt;
		public String getAcc_number() {
			return acc_number;
		}
		public void setAcc_number(String acc_number) {
			this.acc_number = acc_number;
		}
		public int getFd_id() {
			return fd_id;
		}
		public void setFd_id(int fd_id) {
			this.fd_id = fd_id;
		}
		public String getCid() {
			return cid;
		}
		public void setCid(String cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
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
