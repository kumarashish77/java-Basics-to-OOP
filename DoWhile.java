import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your age :-");
//        int age = scanner.nextInt();
//        while (age < 0 || age > 100){
//            System.out.println("Please enter your age :-");
//            age = scanner.nextInt();
//        }
        int age = -1;
        do{
            System.out.println("Please enter your age :- ");
            age = scanner.nextInt();
        }while (age < 0 || age > 100);
        System.out.println("Your age is :- " + age);

    }
}
