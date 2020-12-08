package testmain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Student;

public class TestStudent {
	private static final Student stu = new Student();
	@Test
	public void testSetName() {
		stu.setName("adam");
		assertEquals("adam", stu.getName(),"Name is not correct");
	}
}
