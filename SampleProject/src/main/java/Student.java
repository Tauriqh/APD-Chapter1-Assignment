import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName;
        String lastName;
        int studNumber;

        System.out.print("Please enter firstname: ");
        firstName = scan.nextLine();

        System.out.print("Please enter lastname: ");
        lastName = scan.nextLine();

        System.out.print("Please enter student number: ");
        studNumber = Integer.parseInt(scan.nextLine());

        System.out.printf("Student Details: \nName : %s %s \nStudent Number: %d",firstName,lastName,studNumber);
    }
}
