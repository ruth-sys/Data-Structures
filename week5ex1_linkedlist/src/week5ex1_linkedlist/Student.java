package week5ex1_linkedlist;

public class Student {
	private int StudentId;
	private String Firstname;
	private String Lastname;
	private float GPA;
	
	//default constructor
	public Student() {
		StudentId = 0;
		Firstname ="";
		Lastname ="";
		GPA = 4.0f;
	}
	
	//primary constructor
	public Student(int id, String fn, String ln, Float gpa) {
		StudentId = id;
		Firstname =fn;
		Lastname =ln;
		GPA = gpa;
	}
	
	//copy constructor
	public Student( Student Stud) {
		StudentId = Stud.StudentId;
		Firstname = Stud.Firstname;
		Lastname = Stud.Lastname;
		GPA = Stud.GPA;
		
	}
	// accessors
	public int getStudentID() {
		return StudentId;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public String getLastame() {
		return Lastname;
	}
	
	public Float getGPA() {
		return GPA;
	}
	
	public void setStudentId(int id) {
		StudentId  = id;
		
	}
	public void setFirstname(String fn) {
		Firstname = fn;
	}
	
	public void setLastname(String ln) {
		Lastname = ln;
	}
	
	public void setGPA(float gpa) {
		GPA = gpa;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", GPA="
				+ GPA + "]";
	}

	

}
