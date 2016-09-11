package Fall_2015.package1;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payables = new Payable[4];

        payables[0] = new Invoice("111", "Invoice Number 1", 2, 20);
        payables[1] = new Invoice("222", "Invoice Number 2", 4, 40);
        payables[2] = new SalariedEmployee("Nazyan", "Kamal", "69-12345", 300);
        payables[3] = new SalariedEmployee("Nma", "Aram", "69-6969", 600);

        System.out.println("Invoices and Employees processed Polymorphically");

        for (Payable currentPayable : payables) {
            System.out.printf("%s%n%s$%,.2f%n%n", currentPayable,
                    "Current Due: ", currentPayable.getPaymentAmount());
        }
    }
}
