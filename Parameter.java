public class Parameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumber(8,9));
        System.out.println(sumTwoNumber(77,34));
        System.out.println(sumTwoNumber(-3,-66));
    }
    public static int sumTwoNumber(int first, int second){
        System.out.println("First number received: "+first);
        System.out.println("Second Number received: "+second);
        int sum = first+second;
        return sum;
    }
}
