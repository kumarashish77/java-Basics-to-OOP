import java.util.Scanner;

class SumPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to positive numbers");
        int [] numArr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr){
            if (num<0){
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive number is: " + sum);
    }
}
