package Fall_2015.ite303;

/**
 * Hussein Ahmed ID:13-00312
 */
public class Car {
    private static int carCounter = 0;
    private String carMake;
    private String yearModel;
    private String color;
    private int maxSpeed;

    public Car() {
        carCounter++;
        carMake = null;
        yearModel = null;
        color = null;
        maxSpeed = 0;
    }

    public Car(String carMake, String yearModel, String color, int maxSpeed) {
        carCounter++;
        this.carMake = carMake;
        this.yearModel = yearModel;
        this.color = color;

        if (maxSpeed >= 0) this.maxSpeed = maxSpeed;
        else throw new IllegalArgumentException("Max speed value is invalid");
    }

    public void setCarMake(String carMake) {this.carMake = carMake;}

    public String getCarMake() {return carMake;}

    public void setYearModel(String yearModel) {this.yearModel = yearModel;}

    public String getYearModel() {return yearModel;}

    public void setColor(String color) {this.color = color;}

    public String getColor() {return color;}

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 0) this.maxSpeed = maxSpeed;
        else throw new IllegalArgumentException("Max speed value is invalid");
    }

    public int getMaxSpeed() {return maxSpeed;}

    public void printDetails() {
        System.out.println("------------------------");
        System.out.printf("%-12s: %-8s%n%-12s: %-8s%n%-12s: %-8s%n%-12s: %d%n%-12s: %d%n",
                "Car Make", getCarMake(), "Year Model", getYearModel(),
                "Color", getColor(), "Max Speed", getMaxSpeed(), "Car Counter", carCounter);
        System.out.println("------------------------\n");
    }
}
