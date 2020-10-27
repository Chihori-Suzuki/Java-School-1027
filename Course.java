import java.util.ArrayList;

public class Course {
	private String courseName;
	private int duration;
	private Instructor inst;
	
//	private String instructor;
//	private int experienceYear;
	
	
	public Course(String courseName, int duration, Instructor instructor) {
		setCourseName(courseName);
		setDuration(duration);
		setInstructor(instructor);
	}
	/**
	 * 
	 * @return courseName
	 */
	public String getCourseName() {
		if(this.courseName == "" || this.courseName.isEmpty()) {
			return "Unknown";
		} else {
			return this.courseName;
		}
	}
	
	/**
	 * 
	 * @return duration
	 */
	public int getDuration() {
		if(this.duration >= 4) { //Duration of course should be more than 4 
			return this.duration;
		}else {
			return 4;
		}
	}
	
	/**
	 * 
	 * @return instructor
	 */

	public Instructor getInst() {
		return this.inst;
	}
	
	
	/**
	 * 
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * 
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * 
	 * @param instructor
	 */
	public void setInstructor(Instructor instructor) {
		this.inst = instructor;
	}

	
}
