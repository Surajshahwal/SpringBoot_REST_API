package in.suraj.responce;

public class Ticket {
	private Integer id;
	private String fname;
	private String lname;
	private String gender;
	private Integer age;
	private String from;
	private String to;
	private String trainNo;
	private String doj;
	private String ticketStatus;
	private String ticketCost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(String ticketCost) {
		this.ticketCost = ticketCost;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age=" + age
				+ ", from=" + from + ", to=" + to + ", trainNo=" + trainNo + ", doj=" + doj + ", ticketStatus="
				+ ticketStatus + ", ticketCost=" + ticketCost + "]";
	}

}
