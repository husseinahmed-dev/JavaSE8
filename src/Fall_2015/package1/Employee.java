package Fall_2015.package1;

/**
 * Created by Hussein on 6/7/15.
 * Subclassed by: CommissionEmployee, BasePlusCommissionEmployee, HourlyEmployee and SalariedEmployee.
 */
public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String SSN;
    @Override
    public double getPaymentAmount(){return 1;}

    public Employee (String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public abstract double earnings();

    public abstract int jobLevel();

    @Override
    public String toString() {
        return String.format("Firstname: %s%nLastname: %s%nSSN: %s%n",
                getFirstName(), getLastName(), getSSN());
    }

}