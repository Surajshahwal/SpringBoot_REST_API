package in.suraj;

public class Passenger {
private String name;
private String from;
private String to;
private String gender;

private Address add;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

@Override
public String toString() {
	return "Passenger [name=" + name + ", from=" + from + ", to=" + to + ", gender=" + gender + ", add=" + add + "]";
}


}
