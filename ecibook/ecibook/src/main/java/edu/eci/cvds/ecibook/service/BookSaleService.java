package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import edu.eci.cvds.ecibook.model.DiscountCategory;

/**
 * Subscription Service class in charge of calculating the monthly subscription.
 */
public class BookSaleService {

	/**
	 * Calculate the cost of a book, depending on the discount category and book category.
	 *
	 * @param bookCategory      The book category
	 * @param discountCategory  The discount category
	 * @return The amount to be charged to the client
	 */
	public BigDecimal calculateCost(final BigDecimal bookCategory, final DiscountCategory discountCategory) {
		BigDecimal one = new BigDecimal(1);
		BigDecimal ten = new BigDecimal(10);
		BigDecimal eleven = new BigDecimal(11);
		BigDecimal twenty = new BigDecimal(20);
		BigDecimal twentyOne = new BigDecimal(21);
		BigDecimal thirty = new BigDecimal(30);

		BigDecimal price1 = new BigDecimal(25000);
		BigDecimal price2 = new BigDecimal(50000);
		BigDecimal price3 = new BigDecimal(100000);
		BigDecimal discount1 = new BigDecimal(0.9);
		BigDecimal discount2 = new BigDecimal(0.8);
		BigDecimal result = null;
		if ((bookCategory.compareTo(one) == 1 &&  bookCategory.compareTo(ten) != 1 && bookCategory.compareTo(ten) != 0) && discountCategory.equals(DiscountCategory.EMPLOYEE)) {
			result = price1.multiply(discount1);
		} else if ((bookCategory.compareTo(one) == 1 &&  bookCategory.compareTo(ten) != 1 && bookCategory.compareTo(ten) != 0) && discountCategory.equals(DiscountCategory.STUDENT)){
			result = price1.multiply(discount2);
		} else if ((bookCategory.compareTo(one) == 1 &&  bookCategory.compareTo(ten) != 1 && bookCategory.compareTo(ten) != 0) && discountCategory.equals(DiscountCategory.OTHER)) {
			result = price1;
		} else if ((bookCategory.compareTo(eleven) == 1 &&  bookCategory.compareTo(twenty) != 1 && bookCategory.compareTo(twenty) != 0) && discountCategory.equals(DiscountCategory.EMPLOYEE)) {
			result = price2.multiply(discount1);
		} else if ((bookCategory.compareTo(eleven) == 1 &&  bookCategory.compareTo(twenty) != 1 && bookCategory.compareTo(twenty) != 0) && discountCategory.equals(DiscountCategory.STUDENT)) {
			result = price2.multiply(discount2);
		} else if ((bookCategory.compareTo(eleven) == 1 &&  bookCategory.compareTo(twenty) != 1 && bookCategory.compareTo(twenty) != 0) && discountCategory.equals(DiscountCategory.OTHER)) {
			result = price2;
		} else if ((bookCategory.compareTo(twentyOne) == 1 &&  bookCategory.compareTo(thirty) != 1 && bookCategory.compareTo(thirty) != 0) && discountCategory.equals(DiscountCategory.EMPLOYEE)) {
			result = price3.multiply(discount1);
		} else if ((bookCategory.compareTo(twentyOne) == 1 &&  bookCategory.compareTo(thirty) != 1 && bookCategory.compareTo(thirty) != 0) && discountCategory.equals(DiscountCategory.STUDENT)) {
			result = price3.multiply(discount2);
		} else if ((bookCategory.compareTo(twentyOne) == 1 &&  bookCategory.compareTo(thirty) != 1 && bookCategory.compareTo(thirty) != 0) && discountCategory.equals(DiscountCategory.OTHER)) {
			result = price3;
		}

		return result;
	}

	/*
	 * Tip: Siempre que se desee realizar cálculos matemáticos de alta precisión (por ejemplo para temas de dinero)
	 * es mucho más confiable usar el tipo de dato BigDecimal, pues soporta un alto rango de número, decimales y
	 * tiene mayor precisión en los cálculos. <br />
	 * Ejemplos básicos de operaciones con BigDecimal, teniendo las variables `bd1` y `bd2`:
	 * <ul>
	 * <li>Creación: <code>BigDecimal nuevo = new BigDecimal(10);</code></li>
	 * <li>Sumas: <code>BigDecimal suma = bd1.add(bd2);</code></li>
	 * <li>Restas: <code>BigDecimal resta = bd1.subtract(bd2);</code></li>
	 * <li>Multiplicación: <code>BigDecimal multiplicación = bd1.multiply(bd2);</code></li>
	 * <li>División: <code>BigDecimal division = bd1.divide(bd2);</code></li>
	 * </ul>
	 */

}
