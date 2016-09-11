package Fall_2015.package1;

public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity Invalid");
        if (pricePerItem < 0)
            throw new IllegalArgumentException("Price Invalid");

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            throw new IllegalArgumentException("Quantity Invalid");
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0)
            throw new IllegalArgumentException("Price Invalid");
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
}
