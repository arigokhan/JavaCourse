public class Properties {
    double price = 0;
    double quantity = 0;
    private final double vatRate = 20;
    private double sum = 0;
    private double sumVat = 0;

    public void setProperties(double priceToInsert, double quantityToInsert) {
        price = priceToInsert;
        quantity = quantityToInsert;
        sum = price * quantity;
        sumVat = sum * vatRate / 100;
        System.out.println("Price is " + price + "\nQuantity is " + quantity
                + "\nSum is " + sum + "\nVAT rate is " + vatRate + "\nSum VAT is  " + sumVat);
    }

}
