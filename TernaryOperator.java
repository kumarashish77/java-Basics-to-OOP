import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to number checker :- ");
        System.out.println("Please enter the first number :-");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number :-");
        int b = scanner.nextInt();
//        int greaterNumber;
//        if(a>b){
//            greaterNumber =a;
//        }else{
//            greaterNumber =b;
//        }
        int greaterNumber = a > b ? a : b;
        System.out.println(greaterNumber  +  "is the greater number");
    }
}
