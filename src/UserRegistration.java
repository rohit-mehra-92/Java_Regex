import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addUser();
    }

    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. First Name\n2. Last Name\n3. Email\n4. Phone Number\n5. Password with minimum 8 char\n6. Password with at least one upper case" +
                    "\n7. Password with at least one numeric number\n8. Password with exact one special char\n0. Exit");
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
                case 4:
                    System.out.println("Enter Phone number");
                    String phoneNumber = scanner.next();
                    boolean isPhoneNumber = Pattern.matches("^[1-9]+[0-9]+[0-9]{10}$", phoneNumber);
                    if (isPhoneNumber) System.out.println("phone number is valid ");
                    else System.out.println("Phone number is Invalid");
                    break;
                case 5:
                    System.out.println("Enter Password");
                    String password = scanner.next();
                    boolean isPassword = Pattern.matches("^[1-9a-zA-Z]{8,20}$", password);
                    if (isPassword) System.out.println("Password is valid");
                    else System.out.println("Password is invalid");
                    break;
                case 6:
                    System.out.println("Enter Password");
                    String password1 = scanner.next();
                    boolean isPassword1 = Pattern.matches("^(?=[a-z])(?=.*[A-Z]).{8,20}$", password1);
                    if (isPassword1) System.out.println("Password is valid");
                    else System.out.println("Please check Password");
                    break;
                case 7:
                    System.out.println("Enter Password");
                    String password2 = scanner.next();
                    boolean isPassword2 = Pattern.matches("^(?=[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,20}$", password2);
                    if (isPassword2) System.out.println("Password is valid");
                    else System.out.println("Password is Invalid");
                    break;
                case 8:
                    System.out.println("Enter Password");
                    String password3 = scanner.next();
                    boolean isPassword3 = Pattern.matches("^(?=[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[%^_#&$+=@]).{8,}$", password3);
                    if (isPassword3) System.out.println("Password is valid");
                    else System.out.println("Password is Invalid");
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}