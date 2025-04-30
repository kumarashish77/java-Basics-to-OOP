package in.equals;

public class EqualsAndHashTestCode {
    public static void main(String[] args) {
        Person person1 = new Person("Ashish kumar",23,"002");
        Person person2 = new Person("Rishu kumar",19,"004");
        if (person1 == person2){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
