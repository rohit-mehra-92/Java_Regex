import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.addUser();
    }

    private void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scanner.next();
        boolean isFirstName = Pattern.matches("^[A-Z][a-z]{2}$", firstName);
        if (isFirstName) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First Name is invalid");
        }
    }
}