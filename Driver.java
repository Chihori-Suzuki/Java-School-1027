import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	
	public static void printCourse(Course c) {
		System.out.println("Course name is " + c.getCourseName() + "." +
							"\nwhich takes " + c.getDuration() + " weeks." +  
							"\nThe Instructor of this course is " + c.getInst().getFirstName() + 
							"\n with " + c.getInst().getExperienceYear() + " year of experience." + 
							"\nThe Phone number of Instructor is  " + c.getInst().getPhoneNumber() + ".\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Course> courses = new ArrayList<Course>();  // Create ArrayList of Course called courses
		
		Instructor ins1 = new Instructor("Ami", "Yamaguchi", "000-111-2222", 3);// Create three Instructor Object 
		Instructor ins2 = new Instructor("Emi", "Yamanouchi", "000-111-3333", 2);
		Instructor ins3 = new Instructor("Umi", "Yamasaki", "000-111-4444", 4);
		
		Course cs1 = new Course("Java1", 1, ins1);  // Create four Course Object 
		Course cs2 = new Course("Java2", 1, ins2);
		Course cs3 = new Course("Java3", 1, ins3);
		Course cs4 = new Course("Java4", 1, ins1);
		
		courses.add(cs1); //Add these four course object to the courses arrayList
		courses.add(cs2);
		courses.add(cs3);
		courses.add(cs4);
	
		
		for (Course c : courses) {
			printCourse(c);
		}
		
		System.out.print("write the name of instructor : ");

		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		for(Course c : courses) {
			if(c.getInst().getFirstName().equalsIgnoreCase(name)){
				System.out.println("the name of course which this Instructor teaches : " + c.getCourseName());
			}
			
		}
	}
	

}
