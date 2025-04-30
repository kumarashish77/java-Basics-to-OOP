import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println(" Welcome to the interview "   + name);
        System.out.print( name + ", Also tell me  your age  ");
        int age = scanner.nextInt();
        System.out.println("your age is : " + age);
    }
}