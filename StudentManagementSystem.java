//Task number 5
package codesoft_task;
import java.util.*;
public class StudentManagementSystem {
	
	    private ArrayList<Student> students;

	  
	    public StudentManagementSystem() {
	        this.students = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void removeStudent(int rollNumber) {
	        students.removeIf(student -> student.getRollNumber() == rollNumber);
	    }

	    public Student searchStudent(int rollNumber) {
	        for (Student student : students) {
	            if (student.getRollNumber() == rollNumber) {
	                return student;
	            }
	        }
	        return null;
	    }

	    // Method to display all students
	    public void displayAllStudents() {
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}

