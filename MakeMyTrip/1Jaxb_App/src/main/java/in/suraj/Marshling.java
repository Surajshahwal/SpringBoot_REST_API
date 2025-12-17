package in.suraj;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class Marshling {
	public static void main(String[] args) throws Exception {

		Address add = new Address();
		add.setCity("Bhopal");
		add.setCountry("India");
		add.setState("MP");
		Person p = new Person();
		p.setId(101);
		p.setName("raju");
		p.setEmail("suraj@gmail.com");
		p.setGender("male");
		p.setAddr(add);

		JAXBContext context = JAXBContext.newInstance(Person.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(p, new File("person.xml"));
		System.out.println("done......");
	}

}
