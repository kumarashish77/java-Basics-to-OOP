public class carr {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String companyName;

    public carr(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String companyName) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "carr{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        carr BMW = new carr(4,4,220,"iX","BMWiiXX09","Bmw");
        System.out.println(BMW.toString());
    }
}
