package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

	private String title;
	private String instructor;
	public Set<Integer> enrolled = new HashSet<>();
	
	public Course(String title, String instructor) {
		
		this.title = title;
		this.instructor = instructor;
	}

	public String getTitle() {
		return title;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	public void enroll(int cod) {
		enrolled.add(cod);
	}




	
	
	
	
}
