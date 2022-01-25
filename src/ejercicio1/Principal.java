package ejercicio1;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		List<Product> shoppingCart = List.of(

				new Product("Clothesssssssss", new BigDecimal("15.90"), Tax.NORMAL),

				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),

				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),

				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),

				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),

				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		// for(Product p : shoppingCart) {

		// System.out.println(p.name + " ; " + p.price + " ; " + p.tax.getPercent());

		//El reduce es como un acumulador
		BigDecimal result = shoppingCart.stream().map(
				num -> num.price.add(num.price.multiply(new BigDecimal(num.tax.percent).divide(new BigDecimal(100)))))
				.reduce(BigDecimal.ZERO, (x, y) -> x.add(y));
		// }
		
		String result2 = shoppingCart.stream().filter(num -> num.name.startsWith("C")).map(num -> num.name).collect(Collectors.joining(","));

		System.out.println(result2.toString());

	}

}
