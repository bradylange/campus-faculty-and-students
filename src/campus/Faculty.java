package campus;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Faculty
 * Language: Java
 * Date: 10/12/17
 * Description: This class contains faculty related attributes and algorithms to modify the attributes. 
 */

// This class contains attributes that belong to a faculty member and can be considered a person
public class Faculty extends Person 
{ 
	// Instance variables
	private String dept;												// Faculty member's department
	private String rank;												// Faculty member's rank
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Faculty()
	{
		// Instantiate default properties 
		dept = "";
		rank = "";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Identification, Last Name, First Name, Department, Rank 
	public Faculty(String id, String lastName, String firstName, String dept, String rank)
	{
		// Instantiate properties with parameter values 
		super(id, lastName, firstName);									// Instantiate parent (Person) class properties
		this.dept = dept;												
		this.rank = rank;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	// Copy Constructor - Faculty 
	public Faculty(Faculty obj)
	{
		super(obj.getID(), obj.getLastName(), obj.getFirstName());		// Instantiate parent (Person) class properties using polymorphism 
		this.dept = obj.dept;											// Shallow copy faculty's department
		this.rank = obj.rank;											// Shallow copy faculty's rank
	}
// ------------------- End Copy Constructor -------------------
		
// Setters:
// ------------------- Set Department Method -------------------
	// Method that alters the department of the faculty member
	public void setDept(String dept)
	{
		this.dept = dept;												// Alter the faculty's department 
	}
// ------------------- End Set Department Method -------------------
	
// ------------------- Set Rank Method -------------------
	// Method that alters the rank of the faculty member
	public void setRank(String rank)
	{
		this.rank = rank;												// Alter the faculty's rank 
	}
// ------------------- End Set Rank Method -------------------
	
// Getters:
// ------------------- Get Department Method -------------------	
	// Method that returns the department of the faculty member
	public String getDept()
	{
		return dept;													// Return the faculty's department
	}
// ------------------- End Get Department Method -------------------
	
// ------------------- Get Rank Method -------------------
	// Method that returns the rank of the faculty member
	public String getRank()
	{
		return rank;													// Return the faculty's rank
	}
// ------------------- End Get Rank Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the faculty's data to a String and overrides the Person class
	@Override
	public String toString()
	{																	// Return the falculty's data, use 'super' to get parent (Person) class's first/last name 
		return super.getFirstName() + " " + super.getLastName() + " " + dept;	
	}
// ------------------- End To String Method -------------------
} // End of class Faculty
