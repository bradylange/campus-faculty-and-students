package campus;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Student
 * Language: Java
 * Date: 10/12/17
 * Description: This class contains student related attributes and algorithms to modify the attributes.
 */

// This class contains attributes that belong to a student and can be considered a person
public class Student extends Person 
{ 
	// Instance variables
	private String major;												// Student's major 
	private int level; 													// Student's grade level: Freshmen = 1, Sophomore = 2, Junior = 3, 
																		// Senior = 4, Post Bachelor = 5
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Student()
	{
		// Instantiate default properties
		super();														// Instantiate parent (Person) class properties
		major = "";
		level = 0;
	}
// ------------------- End Default Constructor -------------------

// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Identification, Last Name, First Name, Major, Level 
	public Student(String id, String lastName, String firstName, String major, int level)
	{
		// Instantiate properties with parameter values 
		super(id, lastName, firstName);									// Instantiate parent (Person) class properties 
		this.major = major;
		this.level = level;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	// Copy Constructor - Student 
	public Student(Student obj)
	{
		super(obj.getID(), obj.getLastName(), obj.getFirstName());		// Instantiate parent (Person) class properties using polymorphism 
		this.major = obj.major;											// Shallow copy student's major
		this.level = obj.level;											// Shallow copy student's level
	}
// ------------------- End Copy Constructor -------------------
	
// Setters:
// ------------------- Set Major Method -------------------
	// Method that alters the major of the student
	public void setMajor(String major)
	{
		this.major = major;												// Alter the student's major 
	}
// ------------------- End Set Major Method -------------------
	
// ------------------- Set Level Method -------------------
	// Method that alters the level of the student 
	public void setLevel(int level)
	{
		this.level = level;												// Alter the student's level
	}
// ------------------- End Set Level Method -------------------
	
// Getters:
// ------------------- Get Major Method -------------------
	// Method that returns the major of the student
	public String getMajor()
	{
		return major;													// Return the student's major
	}	
// ------------------- End Get Major Method -------------------
	
// ------------------- Get Level Method -------------------
	// Method that returns the level of the student 
	public int getLevel()
	{
		return level;													// Return the student's level
	}
// ------------------- End Get Level Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the studnent's data into a String and overrides the Person class
	@Override 
	public String toString()
	{																	// Return the student's data 
		return String.format("%-27s %-25s %-25s %-25s", super.getID(), super.getFirstName() + " " + super.getLastName(), major, level);
	}
// ------------------- End To String Method -------------------
} // End of class Student
