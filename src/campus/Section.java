package campus;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: Section
 * Language: Java
 * Date: 10/12/17
 * Description: This class contains section of a course related attributes and algorithms to modify the attributes. 
 */

// This class contains attributes that belong to a course section
public class Section 
{
	// Instance variables
	private Faculty instructor;													// Instructor of the section
	private Student [] enrolled;												// Collection of students that are enrolled in the section
	private String id;															// Identification of the section
	private int amountStuEnrolled;												// Amount of students enrolled into the section
	private int capacity;														// Section's max capacity
	private String location;													// Section's location
	private String time;														// Section's meeting time
	private String semester;													// Section's semester of the year
// ------------------- Default Constructor -------------------
	// Default Constructor
	public Section()
	{
		// Instantiate default properties 
		id = "";
		instructor = new Faculty();												// One instructor
		enrolled = new Student[5];												// Five students 
		amountStuEnrolled = 0;
		capacity = 0;											
		location = "";
		time = "";
		semester = "";
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Identification, Instructor, Capacity, Location, Meeting Time, Semester 
	public Section(String id, Faculty instructor, int capacity, String location, String time, String semester)
	{
		// Instantiate properties with parameter values 
		this.id = id;
		this.instructor = new Faculty(instructor.getID(), instructor.getLastName(), instructor.getFirstName(), instructor.getDept(), instructor.getRank());
		this.amountStuEnrolled = 0; 
		this.capacity = capacity;
		this.location = location;
		this.time = time;
		this.semester = semester;
		this.enrolled = new Student[capacity]; 
	}
// ------------------- End Alternate Constructor -------------------

// ------------------- Copy Constructor -------------------
	// Copy Constructor - Section
	public Section(Section obj)
	{
		this.id = obj.id;														// Shallow copy section's identification
		this.instructor = obj.instructor;										// Shallow copy section's instructor
		this.amountStuEnrolled = obj.amountStuEnrolled; 						// Shallow copy section's amount of students enrolled 
		this.capacity = obj.capacity;											// Shallow copy section's capacity 
		this.location = obj.location;											// Shallow copy section's location 
		this.time = obj.time;													// Shallow copy section's time
		this.semester = obj.semester;											// Shallow copy section's semester
		this.enrolled = obj.enrolled; 											// Shallow copy section's collection of enrolled students 
	}
// ------------------- End Copy Constructor -------------------
		
// Setters:
// ------------------- Set Faculty Method -------------------
	// Method that alters the faculty member of the section
	public void setFaculty(Faculty instructor)
	{
		this.instructor = instructor;											// Alter the section's faculty member (teacher)
	}
// ------------------- End Set Faculty Method -------------------

// ------------------- Set Location Method -------------------
	// Method that alters the the location of the section
	public void setLocation(String location)
	{
		this.location = location;												// Alter the section's location (classroom)
	}
// ------------------- End Set Location Method -------------------
	
// ------------------- Set Time Method -------------------
	// Method that alters the time of the section
	public void setTime(String time)
	{
		this.time = time;														// Alter the section's meeting time 
	}
// ------------------- End Set Time Method -------------------
	
// ------------------- Set Semester Method -------------------
	// Method that alters the semester (fall, winter, spring, summer) of the section
	public void setSemester(String semester)
	{
		this.semester = semester;												// Alter the section's semester (fall, winter, spring, summer) 
	}
// ------------------- End Set Semester Method -------------------
	
// Getters:
// ------------------- Get Faculty Method -------------------	
	// Method that returns the faculty member 
	public Faculty getFaculty()
	{
		return instructor;														// Return the section's faculty member (teacher)
	}
// ------------------- End Get Faculty Method -------------------
	
// ------------------- Get Collection of Students Method -------------------
	// Method that returns the students in the section
	public Student [] getCollectionOfStudents()
	{
		return enrolled;														// Return the section's enrolled students
	}
// ------------------- End Get Collection of Students Method -------------------
	
// ------------------- Get Identification Method -------------------
	// Method that returns the identification of the section
	public String getID()
	{
		return id;																// Return the section's identification
	}
// ------------------- End Get Identification Method -------------------

// ------------------- Get Number of Enrolled Method -------------------	
	// Method that returns the amount of enrolled students
	public int getNumOfEnrolled()
	{
		return amountStuEnrolled;												// Return the section's amount of students enrolled 
	}
// ------------------- End Get Number of Enrolled Method -------------------
	
// ------------------- Get Capacity Method -------------------
	// Method that returns the max capacity of the section
	public int getCapacity()
	{
		return capacity;														// Return the section's capacity 
	}
// ------------------- End Get Capacity Method -------------------
	
// ------------------- Get Location Method -------------------
	// Method that returns the location of the section
	public String getLocation()
	{
		return location;														// Return the section's location (classroom)
	}
// ------------------- End Get Location Method -------------------
	
// ------------------- Get Time Method -------------------
	// Method that returns the time the section meets
	public String getTime()
	{	
		return time;															// Return the section's meeting time 
	}
// ------------------- End Get Time Method -------------------
	
// ------------------- Get Semester Method -------------------
	// Method that returns the semester the section takes place
	public String getSemester()
	{
		return semester;														// Return the section's semester (fall, winter, spring, summer)
	}
// ------------------- End Get Semester Method -------------------
	
// ------------------- Find Student Method -------------------
	// Method that finds a student in the section by their identification
	public Student findStudent(String ID)
	{
		if (amountStuEnrolled == 0)												// Section is empty 
		{
			return null;														// Return nothing
		}
		else																	// Section contains students
		{
			for (int i = 0; i < amountStuEnrolled; i++)
			{
				if (enrolled[i].getID().equalsIgnoreCase(ID))					// Student found
				{
					return enrolled[i];											// Return student 
				}
				else															// Student not found, continue looking for student 
				{
					continue;
				}
			}
			return null;														// Student not found, return nothing
		}
	}
// ------------------- End Find Student Method -------------------
	
// ------------------- Enroll Student Method -------------------	
	// Method that adds a new student into the enrolled list and increments the number of enrolled by one, it will print an error if the section is full
	public boolean enrollStudent(Student newStudent)
	{
		if (capacity <= amountStuEnrolled)										// Check section's capacity, don't enrolled if full section
		{
			System.out.println("Error: Too many students enrolled. The student was not added.");
			return false;														// Unsuccessfully enrolled student 
		}
		else if (findStudent(newStudent.getID()) != null)						// Check if student is in section
		{
			System.out.println("Error: The student '" + newStudent.getFirstName() + " " + newStudent.getLastName() + 
					"' is already in the section. The student was not added.");
			return false;
		}
		else																	// Section is not full and the student is not already in the section
		{
			Student [] newEnrolled = new Student[amountStuEnrolled + 1];		// Using a temporary student array to resize the instance array
			
			for (int i = 0; i < amountStuEnrolled; i++)							// Enroll all students in new resized array
			{
				 newEnrolled[i] = enrolled[i];
			}
			if (amountStuEnrolled > 0)											// If the amount of students enrolled is not empty 
			{																	 
				newEnrolled[amountStuEnrolled] = new Student(newStudent);		// Enroll the student
				enrolled = newEnrolled;											// Set the instance array to the new resized array
			}
			else																// Section is empty 
			{																	
				enrolled[amountStuEnrolled] = new Student(newStudent);			// Enroll student in original instance array
			}
			
			System.out.println("Added student: " + enrolled[amountStuEnrolled].getFirstName() + " " + enrolled[amountStuEnrolled].getLastName());
			amountStuEnrolled++;												// Increment amount of students in section
				
			return true;														// Successfully enrolled student 
		}
	}
// ------------------- End Enroll Student Method -------------------
	
// ------------------- Remove Student Method -------------------
	// Method that removes a student with the student ID attribute from the enrolled list and decrements the number of enrolled list, if the student is not found it will print out an error
	public boolean removeStudent(String studentID)
	{
		boolean foundStudent = false;											// Flag	that determines if the student was found and removed from the section																
		
		if (amountStuEnrolled > 0 && amountStuEnrolled <= capacity)				// Check if there are any students in the section
		{
			for (int i = 0; i < enrolled.length; i++)							// Search for student to remove
			{
				if (enrolled[i].getID().equalsIgnoreCase(studentID)) 			// Found student
				{
					System.out.println("Removed student: " + enrolled[i].getFirstName() + " " + enrolled[i].getLastName());
					
					for (int j = i; j < amountStuEnrolled - 1; j++)				// Populate resized array
					{
						enrolled[j] = enrolled[j + 1];							// Overwrite removed student 				
					}
					
					--amountStuEnrolled;										// Decrease size of enrollment in the section
					foundStudent = true;										// Found student 
					break;														// Exit for loop
				} 
				// If the student cannot be found an error will occur
				else if (i == amountStuEnrolled - 1 && !enrolled[i].getID().equalsIgnoreCase(studentID))
				{
					System.out.println("Error: Could not find the student with ID '" + studentID + "'. Student may not be enrolled. Please try again.");
					foundStudent = false;										// Did not find student 
					break;														// Exit for loop
				}
			}
			return foundStudent; 												// Return if the student was removed or not										
		} 	
		else																	// No students in the section
		{
			System.out.println("Error: Invalid capacity amount, cannot remove student. Please try again.");
			return foundStudent;												// Unsuccessfully removed student from section
		}
	}
// ------------------- End Remove Student Method -------------------
	
// ------------------- Print Roster Method -------------------
	// Method that prints the sections information and enrolled students information using a formatted structure
	public void printRoster()
	{
		System.out.println(this.toString());
		System.out.println("\nStudent Roster: ");
		System.out.printf("%-27s %-25s %-25s %-25s\n", "Student's ID", "Student's Name", "Student's Major", "Student's Level");
		
		for (int i = 0; i < enrolled.length; i++)								// For each student in the section
		{
			System.out.println(enrolled[i].toString());							// Print the student's data 
		}
	}
// ------------------- End Print Roster Method -------------------
	
// ------------------- To String Method -------------------
	// Method that converts the section's data into a String
	public String toString()
	{																			// Return the section's data
		return String.format("\nSection: %-18s Instructor: %-25s Location: %-24s\nCapacity: %-18sEnrolled: %-23s \nSemester: %-17s Meeting Time: %-10s", 
				id, instructor, location, capacity, amountStuEnrolled, semester, time);
	}
// ------------------- End To String Method -------------------
} // End of class Section
