package lambda.q01;

public class Item {

    private final String sku;
    private final int qty;
    private final Double unitPrice;

    public Item(String sku, int qty, Double unitPrice) {
        this.sku = sku;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getSku() {
        return sku;
    }

    public int getQty() {
        return qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

}
