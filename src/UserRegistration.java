import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addUser();
    }

    private void addUser() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. First Name\n2. Last Name\n3. Email\n0. Exit");
            System.out.println("Enter choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter First Name");
                    String firstName = scanner.next();
                    boolean isFirstName = Pattern.matches("^[A-Z][a-z]{2}$", firstName);
                    if (isFirstName) System.out.println("First name is valid");
                    else System.out.println("First Name is Invalid");
                    break;
                case 2:
                    System.out.println("Enter Last Name");
                    String lastName = scanner.next();
                    boolean isLastName = Pattern.matches("^[A-Z][a-z]{2}$", lastName);
                    if (isLastName) System.out.println("Last name is valid");
                    else System.out.println("Last Name is Invalid");
                    break;
                case 3:
                    System.out.println("Enter Email");
                    String email = scanner.next();
                    boolean isMailId = Pattern.matches("^[a-z0-9]+[.]*[0-9a-z]*@[a-z0-9]+.[a-z]{2,6}.[a-z]*$", email);
                    if (isMailId) System.out.println("Email id is valid");
                    else System.out.println("Email Id is Invalid");
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}