package main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		Student student = new Student("adam",20);
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(student);
		System.out.println(jsonString);
		
		
		Student stu = mapper.readValue(jsonString, Student.class);
		System.out.println(stu.getName());
	}
}
