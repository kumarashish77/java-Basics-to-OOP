public class Function {
    public static void main(String[] args) {
        System.out.println("In main method");
       greeting();
        System.out.println("Method calling complete");
        printFirstPattern();
        printSecondPattern();
        printThirdPattern();

//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");
//
//        System.out.println("* * * * *");
//        System.out.println("* * * *");
//        System.out.println("* * *");
//        System.out.println("* *");
//        System.out.println("*");
//
//        System.out.println("       *");
//        System.out.println("      * *");
//        System.out.println("   * * *");
//        System.out.println("  * * * *");
//        System.out.println("* * * * *");
    }
    public static void printThirdPattern(){
        System.out.println("          *");
        System.out.println("        * *");
        System.out.println("      * * *");
        System.out.println("    * * * *");
        System.out.println("  * * * * *");
    }
    public static void printSecondPattern(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void printFirstPattern(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

    }
    public static void greeting(){
        System.out.println("A warm Good Morning to all of you from Ashish");

    }
}
