package h.programming1bassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Programming1BAssignment 
{
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*******************************");
        System.out.print("Enter (1) to launch menu or any other key to exit: ");
        String input = scanner.nextLine();

        if (input.equals("1")) 
        {
            ShowMenu();
        } else 
        {
            System.out.println("Exiting Application.");
        }
    }

    private static void ShowMenu()// This method is used to show the menu with the number of selections to make in the menu. 
    {
        while (true) 
        {
            System.out.println("Please select one of the menu options:");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report");
            System.out.println("(5) Exit Application");
            System.out.print("Enter an option: ");

            String input = scanner.nextLine();
            
            if (input.equals("1")) 
            {
                SaveStudent();
            } else if (input.equals("2")) 
            {
                SearchStudent();
            } else if (input.equals("3")) 
            {
                DeleteStudent();
            } else if (input.equals("4")) 
            {
                StudentReport();
            } else if (input.equals("5")) 
            {
                ExitStudentApplication();
                return; 
            } else 
            {
                System.out.println("Invalid selection. Please attempt again.");
            }
        }
    }

    private static void SaveStudent() //This is the method where enter the students details
    {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter student course: ");
        String course = scanner.nextLine();
        students.add(new Student(name, id, age, email, course));
        System.out.println("Student added successfully.");
    }

    private static void SearchStudent()//With this method you are able to search for a student 
    {
        System.out.print("Enter student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (Student student : students) 
        {
            if (student.getId() == id) 
            {
                System.out.println("Student found: " + student);
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    private static void DeleteStudent() //This method allows you to delete the details of a student.
    {
        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean found = false;
        for (int i = 0; i < students.size(); i++) 
        {
            if (students.get(i).getId() == id) 
            {
                students.remove(i);
                System.out.println("Student removed successfully.");
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    private static void StudentReport() //With this method you are able to pull up a students report
    {
        if (students.isEmpty()) 
        {
            System.out.println("No students to report.");
        } else 
        {
            System.out.println("Student Report:");
            for (Student student : students) 
            {
                System.out.println(student);
            }
        }
    }

    private static void ExitStudentApplication() //This method enables you to exit the application.
    {
        System.out.println("Exiting Application.");
    }
}






//References:
//Joyce Farrell, 2023. Java Programming. Tenth Edition. Boston; Cengage
    

