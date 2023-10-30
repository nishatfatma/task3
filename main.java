//Task number 5
package codesoft_task;
import java.util.*;
public class main {
	public static void main (String []args) {
	StudentManagementSystem sms = new StudentManagementSystem();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("1. Add Student\n2. Remove Student\n3. Search Student\n4. Display All Students\n5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter student name: ");
                String name = scanner.next();
                System.out.print("Enter roll number: ");
                int rollNumber = scanner.nextInt();
                System.out.print("Enter grade: ");
                String grade = scanner.next();

                Student newStudent = new Student(name, rollNumber, grade);
                sms.addStudent(newStudent);
                break;

            case 2:
                System.out.print("Enter roll number of the student to remove: ");
                int removeRollNumber = scanner.nextInt();
                sms.removeStudent(removeRollNumber);
                break;

            case 3:
                System.out.print("Enter roll number of the student to search: ");
                int searchRollNumber = scanner.nextInt();
                Student searchedStudent = sms.searchStudent(searchRollNumber);
                if (searchedStudent != null) {
                    System.out.println("Student found: " + searchedStudent);
                } else {
                    System.out.println("Student not found.");
                }
                break;

            case 4:
                sms.displayAllStudents();
                break;

            case 5:
                System.out.println("Exiting the program.");
                System.exit(0);

            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}
}
