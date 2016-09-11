package Fall_2015.package1;

/**
 * Created by Hussein on 7/2/15.
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours) {
        super(firstName, lastName, SSN);

        if (wage < 0)
            throw new IllegalArgumentException("Re-enter wage");
        if (hours < 0 || hours > 168)
            throw new IllegalArgumentException("Re-enter hours");

        this.wage = wage;
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0)
            throw new IllegalArgumentException("Re-enter wage");

        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168)
            throw new IllegalArgumentException("Re-enter hours");

        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40)   // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public int jobLevel() {
        return 100;
    }

    @Override
    public String toString() {
        return String.format("%sJob Level: %s%nType: %s%nEarnings: %.2f%nWage: %.2f%nHours: %.2f", super.toString(), jobLevel(), "Hourly",
                earnings(), getWage(), getHours());
    }

    @Override
    public double getPaymentAmount() {
        if (getHours() <= 40)   // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
}
