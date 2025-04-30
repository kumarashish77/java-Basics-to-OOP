public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Before the loop");
        for (int i = 1; i < 1000; i++) {
            if ( i == 101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out the loop");
    }
}
