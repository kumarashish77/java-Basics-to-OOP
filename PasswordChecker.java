import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Set your password\n");

        String password;
        do {
            System.out.println("Please enter your password:");
            password = scanner.next();
        } while (!isValidPassword(password));

        System.out.println("Thanks for entering a valid password!");
        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
