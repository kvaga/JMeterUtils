package ru.kvaga.jmeter.projects.emias;

import java.io.File;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON {
/*
 * https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
 */
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		try {

			// Convert JSON string from file to Object
			EMIASScheduleResponse response = mapper.readValue(new File("src/example.json"), EMIASScheduleResponse.class);
			System.out.println(response);
	}catch(Exception ex) {
		ex.printStackTrace();
	}

	
}
}
