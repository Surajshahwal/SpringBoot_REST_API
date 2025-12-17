package in.suraj;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class UnMarshling {
	public static void main(String[] args) throws Exception {
		JAXBContext context = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Person p = (Person)unmarshaller.unmarshal(new File("Person.xml"));
		System.out.println(p);
		
	}

}
