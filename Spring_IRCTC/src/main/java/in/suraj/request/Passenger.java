package in.suraj.request;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Passenger {
	private String fname;
	private String lname;
	private String gender;
	private Integer age;
	private String from;
	private String to;
	private String trainNo;
	private String doj;
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
	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", age=" + age + ", from="
				+ from + ", to=" + to + ", trainNo=" + trainNo + ", doj=" + doj + "]";
	}

	

}
