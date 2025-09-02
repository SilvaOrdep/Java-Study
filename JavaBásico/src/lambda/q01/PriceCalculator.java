package lambda.q01;

import java.util.List;

public class PriceCalculator {

    public double total(List<Item> items, DiscountType discountType) {
        double subtotal = this.subtotalCalculate(items);

        if (discountType == DiscountType.VIP) {
            return subtotal * 0.9;
        } else if (discountType == DiscountType.COUPON) {
            double d = Math.min(50, subtotal * 0.1);
            return subtotal - d;
        } else if (discountType == DiscountType.CLEARANCE) {
            return subtotal * 0.5;
        }
        return subtotal;

    }

    private double subtotalCalculate(List<Item> items) {
        return items.stream().mapToDouble(i -> i.getUnitPrice()*i.getQty()).sum();
    }

}
