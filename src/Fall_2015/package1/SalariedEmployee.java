package Fall_2015.package1;

/**
 * Created by Hussein on 7/2/15.
 */
public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);

        if (weeklySalary < 0)
            throw new IllegalArgumentException("Re-enter weeklySalary");

        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0)
            throw new IllegalArgumentException("Re-enter weeklySalary");

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public int jobLevel() {
        return 100;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%sJob Level: %s%nType: %s%nEarnings: %.2f%nWeeklySalary: %.2f", super.toString(), jobLevel(), "Salaried",
                earnings(), getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}
