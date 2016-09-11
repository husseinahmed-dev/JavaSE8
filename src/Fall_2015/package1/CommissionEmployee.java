package Fall_2015.package1;

/**
 * Created by Hussein on 6/16/15.
 */
public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String SSN,
                              double commissionRate, double grossSales) {
        super(firstName, lastName, SSN);

        if (commissionRate < 0  || commissionRate > 1.0)
            throw new IllegalArgumentException("Re-enter commissionRate");
        if (grossSales < 0)
            throw new IllegalArgumentException("Re-enter grossSales");

        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public int jobLevel() {
        return 100;
    }

    @Override
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("%sJob Level: %s%nType: %s%nEarnings: %.2f", super.toString(), jobLevel(), "Commission",
                earnings());
    }

    @Override
    public double getPaymentAmount() {
        return getGrossSales() * getCommissionRate();
    }
}
