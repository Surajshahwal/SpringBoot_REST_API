package in.suraj;

import java.io.File;
import java.io.FileWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JavaToJson {
	public static void main(String[] args) throws Exception {
		Address add = new Address();
		add.setCity("Bhopal");
		add.setCountry("India");
		add.setState("Mp");

		Passenger p = new Passenger();
		p.setName("rani");
		p.setGender("Female");
		p.setFrom("BPL");
		p.setTo("JBL");
		p.setAdd(add);

		/*
		 * ObjectMapper mapper=new ObjectMapper(); mapper.writeValue(new
		 * File("passenger.json"),p); System.out.println("done....");
		 */

		Gson gson = new Gson();
		String json = gson.toJson(p);

		FileWriter fw = new FileWriter("passenger.json");
		fw.write(json);
		fw.flush();
		fw.close();
		System.out.println("pasenger file sucessfuly crearted ");

	}

}
