package Fall_2015.package1;
import java.math.BigDecimal;
import java.text.NumberFormat;
/**
 * Created by Hussein on 6/11/15.
 */
public class Interest {
    public static void main(String[] args) {
        BigDecimal principle = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; year++) {
            BigDecimal amount =
                    principle.multiply(rate.add(BigDecimal.ONE).pow(year));

            System.out.printf("%4d%20s%n", year,
                    NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}
