import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addUser();
    }

    private void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. First Name\n2. Last Name\n0. Exit");
        System.out.println("Enter choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter First Name");
                String firstName = scanner.next();
                boolean isFirstName = Pattern.matches("^[A-Z][a-z]{2}$", firstName);
                if (isFirstName)
                    System.out.println("First name is valid");
                else
                    System.out.println("First Name is Invalid");
                break;
            case 2:
                System.out.println("Enter Last Name");
                String lastName = scanner.next();
                boolean isLastName = Pattern.matches("^[A-Z][a-z]{2}$", lastName);
                if (isLastName)
                    System.out.println("Last name is valid");
                else
                    System.out.println("Last Name is Invalid");
                break;
        }
        while (choice != 0) ;
    }
}