import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
       // int a = 12;
        //System.out.println(a);
        //int newa = a;
        //System.out.println(newa);

        // swap two number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = input.nextInt();
        System.out.println("Enter value of b:");
        int b = input.nextInt();
         int c = a;
         a =b;
         b =c;
        System.out.println("value of a is : " + a);
        System.out.println("value of b is  :" + b);
    }
}
