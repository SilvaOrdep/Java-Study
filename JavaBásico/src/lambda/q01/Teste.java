package lambda.q01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		PriceCalculator priceCalculator = new PriceCalculator();
		List<Item> cart = new ArrayList<>(Arrays.asList(new Item("01", 10, 2.9), new Item("02", 2, 1.4)));
		
		System.out.println(priceCalculator.total(cart, DiscountType.NONE));
		
	}

}
