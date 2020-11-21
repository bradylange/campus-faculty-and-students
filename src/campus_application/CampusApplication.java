package campus_application;

import campus.Faculty;
import campus.Section;
import campus.Student;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: CampusApplication
 * Language: Java
 * Date: 10/12/17
 * Description: This program tests the functionality of the campus.
 */

// This program tests the functionality of the package which operates as a school campus
public class CampusApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args) 
	{
		System.out.println("***************************************** College Campus: *******************************************");
		// Instantiate the students 
		Student studentOne = new Student("W3110657", "Lange", "Brady", "Computer Science", 2);
		Student studentTwo = new Student("W3100000", "Peterson", "Adrian", "Dairy Science", 1);
		Student studentThree = new Student("W3200000", "Bryant", "Kobe", "Sports Management", 4);
		Student studentFour = new Student("W3300000", "Lillard", "Damien", "Data Science", 3);
		Student studentFive = new Student("W3400000", "Paul", "Chris", "Computer Science", 2);

		// Instantiate the faculty member 
		Faculty instructor = new Faculty("3029699", "Ruxin", "Dai", "CSIS", "Assistant Professor"); 
		
		// Instantiate the section
		Section sectionCS235 = new Section("CS235-02", instructor, 5, "South Hall 218", "T & TH 12:30-1:45PM", "Fall Semester");

		// Enroll the students into the section
		sectionCS235.enrollStudent(studentOne);
		sectionCS235.enrollStudent(studentTwo);
		sectionCS235.enrollStudent(studentThree);
		sectionCS235.enrollStudent(studentFour);
		sectionCS235.enrollStudent(studentFive);
		
		// Print out the roster for the CS235 section
		sectionCS235.printRoster();
		
		// Remove studentOne from section CS235 using their ID
		System.out.println();
		String ID = "W3110657";
		System.out.println("Attempting to remove student with ID " + ID + "... ");
		sectionCS235.removeStudent(ID);
		
		// Verify the student was removed by trying to remove them again
		System.out.println();
		System.out.println("Attempting to remove student with ID " + ID + "... ");
		sectionCS235.removeStudent(ID);
		
		// Verify you can add another student after removing them
		System.out.println();
		sectionCS235.enrollStudent(studentOne);
		System.out.println("*********************************************************************************************\n");
	} 
// ------------------- End Main Method -------------------
} // End of class CampusApplication
