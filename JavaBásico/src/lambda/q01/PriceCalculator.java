package lambda.q01;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

public class PriceCalculator {
	
	private final Map<DiscountType, UnaryOperator<BigDecimal>> discountMap;
	
    public PriceCalculator(Map<DiscountType, UnaryOperator<BigDecimal>> discountMap) {
		this.discountMap = discountMap;
	}
    
	public PriceCalculator() {
		this.discountMap = new HashMap<>();
		
		discountMap.put(DiscountType.VIP, x -> x.multiply(new BigDecimal(0.9)));
		discountMap.put(DiscountType.COUPON, x -> new BigDecimal(Math.min(50, x.multiply(new BigDecimal(0.1)).doubleValue())));
		discountMap.put(DiscountType.CLEARANCE, x -> x.multiply(new BigDecimal(0.5)));
		
	}

	public double total(List<Item> items, DiscountType discountType) {
        double subtotal = this.subtotalCalculate(items);

        return this.discountMap.get(discountType) != null ? this.discountMap.get(discountType).apply(new BigDecimal(subtotal)).doubleValue() : subtotal;
    }

    private double subtotalCalculate(List<Item> items) {
        return items.stream().mapToDouble(i -> i.getUnitPrice()*i.getQty()).sum();
    }
    
    public void putDiscount(DiscountType discountType, double percent) {
    	this.discountMap.put(discountType, x -> x.multiply(new BigDecimal(percent)));
    }
    
    public void removeDiscount(DiscountType discountType) {
    	this.discountMap.remove(discountType);
    }

}
