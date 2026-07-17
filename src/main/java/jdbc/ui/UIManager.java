package jdbc.ui;

import jdbc.dto.StudentDto;
import jdbc.enums.Gender;
import jdbc.service.StudentService;

import java.util.Scanner;

public class UIManager {
    private final StudentService
            studentService = new StudentService();
    Scanner scanner = new Scanner(System.in);

    public void launch(){
        try{
            System.out.println("Welcome to our sample application");
            System.out.println("Enter 1 to create student");
            System.out.println("Enter 2 to get all students");
            System.out.println("Enter 4 to exit");
            System.out.println("Enter your option: ");
            int choice = scanner.nextInt();


            boolean isProgramRunning = true;

            while(isProgramRunning) {
                switch(choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        findAllStudent();
                        break;
                    case 4:
                        isProgramRunning = false;
                        System.out.println("Session ended!!!");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void addStudent() {
        scanner.nextLine();
        try{
            System.out.println("Enter Student name:");
            String name = scanner.nextLine();

            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            System.out.println("Enter gender: ");
            scanner.nextLine();
            String input = scanner.nextLine().toUpperCase();
            Gender gender = Gender.valueOf(input);

            StudentDto studentDto = new StudentDto(name, password, age, gender);
            studentService.addStudent(studentDto);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid gender. Please enter 'MALE' or 'FEMALE'");
        } finally {
            scanner.close();
        }
    }


    public void findAllStudent() {
        System.out.println("Finding all students...");
        scanner.nextLine();
        try{

//            studentService.findAllStudent();
        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid gender. Please enter 'MALE' or 'FEMALE'");
        } finally {
            scanner.close();
        }
    }
}
