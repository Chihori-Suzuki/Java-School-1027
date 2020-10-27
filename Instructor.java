
public class Instructor {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int experienceYear;
	
	/**
	 * getStatus () (With switch and case)————> if Experience year < 2 we have Junior Instructor 
                    If Experience year is between 2 and 4 we have Intermediate Instructor
                    More than 4 we have Senior Instructor 
                    

	 */
	public Instructor(String firstName, String lastName, String phoneNumber, int experienceYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setExperienceYear(experienceYear);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getStatus(int experienceYear) {
		String status;
		if(experienceYear > 0) {
			switch(experienceYear) {
			case 1 : 
				status = "Junior Instructor";
				break;
			case 2 : 
				status = "Intermediate Instructor";
				break;
			case 3 : 
				status = "Intermediate Instructor";
				break;
			default : status = "Senior Instructor";
			}
		} else{
			status = "error";
		}
		return status;
	}
	
	public String getFirstName() {
		if(this.firstName == "" || this.firstName.isEmpty()) {
			return "Unknown";
		} else {
			return this.firstName;
		}
	}
	public String getLasttName() {
		if(this.lastName == "" || this.lastName.isEmpty()) {
			return "Unknown";
		} else {
			return this.lastName;
		}
	}
	public String getPhoneNumber() {
		if(this.phoneNumber == "" || this.phoneNumber.isEmpty()) {
			return "Unknown";
		} else {
			return this.phoneNumber;
		}
	}
	public int getExperienceYear() {
		if(experienceYear > 0) { // Year of experience should be more than 1 
			return this.experienceYear;
		} else{
			return 1;
		}
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}
	
}
