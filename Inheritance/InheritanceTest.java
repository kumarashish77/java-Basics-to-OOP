package in.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler two = new TwoWheeler();
        two.commute();
        two.balance();

    }
}
