package campus;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Person
 * Language: Java
 * Date: 10/12/17
 * Description: This class contains people related attributes and algorithms to modify the attributes. 
 */

// This class contains attributes that belong to a person
public class Person 
{
	// Instance variables 
	private String id;																// Person's identification
	private String firstName;														// Person's first name
	private String lastName;														// Person's last name
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Person()
	{
		// Instantiate default properties 
		id = "";
		firstName = "";
		lastName = "";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Identification, Last Name, First Name 
	public Person(String id, String last, String first)
	{
		// Instantiate properties with parameter values 
		this.id = id;
		this.firstName = first;
		this.lastName = last;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Copy Constructor -------------------
	// Copy Constructor - Person
	public Person(Person obj)
	{
		this.id = obj.id;																// Shallow copy person's identification
		this.firstName = obj.firstName;													// Shallow copy person's first name 
		this.lastName = obj.lastName;													// Shallow copy person's last name
	}
// ------------------- End Copy Constructor -------------------
		
// Setters:
// ------------------- Set Identification Method -------------------	
	// Method that alters the ID of the person
	public void setID(String id)
	{
		this.id = id;																	// Alter the person's identification
	}
// ------------------- End Set Identification Method -------------------
	
// ------------------- Set First Name Method -------------------
	// Method that alters the first name of the person
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;														// Alter the person's first name
	}
// ------------------- End Set First Name Method -------------------
	
// ------------------- Set Last Name Method -------------------
	// Method that alters the last name of the person
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;														// Alter the person's last name
	}
// ------------------- End Set Last Name Method -------------------

// Getters:
// ------------------- Get Identification Method -------------------
	// Method that returns the ID of the person
	public String getID() 
	{
		return id;																		// Return the person's identification
	}
// ------------------- End Get Identification Method -------------------
	
// ------------------- Get First Name Method -------------------
	// Method that returns the first name of the person
	public String getFirstName() 
	{
		return firstName;																// Return the person's first name
	}
// ------------------- End Get First Name Method -------------------

// ------------------- Get Last Name Method -------------------
	// Method that returns the last name of the person
	public String getLastName() 
	{
		return lastName;																// Return the person's last name
	}
// ------------------- End Get Last Name Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the person's data to a String
	public String toString()
	{
		return id + ": " + firstName + " " + lastName;									// Return the person's data 
	}
// ------------------- End To String Method -------------------
} // End of class Person
