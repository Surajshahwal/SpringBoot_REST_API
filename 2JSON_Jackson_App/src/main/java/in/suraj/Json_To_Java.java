package in.suraj;

import java.io.File;
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Json_To_Java {
public static void main(String[] args) throws Exception {
	/*
	 * ObjectMapper mapper =new ObjectMapper(); Passenger passenger =
	 * mapper.readValue(new File("passenger.json"), Passenger.class);
	 * System.out.println(passenger);
	 */
	
	Gson gson =new Gson();
	Passenger json = gson.fromJson(new FileReader("passenger.json"), Passenger.class);
	System.out.println(json);
	
}
}

