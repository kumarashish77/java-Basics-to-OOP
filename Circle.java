import java.util.Scanner;

class Circle {
    double radiusInMm;


    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }


    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }


    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }


    @Override
    public String toString() {
        return "Circle with radius: " + radiusInMm + " mm\n" +
                "Circumference: " + getCircumference() + " mm\n" +
                "Area: " + getArea() + " square mm";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle (in mm): ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle.toString());

        scanner.close();
    }
}
