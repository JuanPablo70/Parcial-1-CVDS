package edu.eci.cvds.ecibook.service;

import java.math.BigDecimal;

import edu.eci.cvds.ecibook.model.DiscountCategory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link BookSaleService}
 */
public class BookSaleServiceTest {

	/**
	 * The class under test.
	 */
	private BookSaleService service = new BookSaleService();

	
	@Test
	public void testEmployeeTen() {
		BigDecimal number = new BigDecimal(3);
		BigDecimal cost = new BigDecimal(25000);
		BigDecimal discount = new BigDecimal(0.9);
		Assert.assertEquals(cost.multiply(discount),  service.calculateCost(number, DiscountCategory.EMPLOYEE));
	}

	 

	@Test
	public void testStudentTen() {
		BigDecimal number = new BigDecimal(3);
		BigDecimal cost = new BigDecimal(25000);
		BigDecimal discount = new BigDecimal(0.8);
		Assert.assertEquals(cost.multiply(discount),  service.calculateCost(number, DiscountCategory.STUDENT));
	}

	@Test
	public void testOtherTen() {
		BigDecimal number = new BigDecimal(7);
		BigDecimal cost = new BigDecimal(25000);
		Assert.assertEquals(cost,  service.calculateCost(number, DiscountCategory.OTHER));
	}

	@Test
	public void testEmployeeTwenty() {
		BigDecimal number = new BigDecimal(12);
		BigDecimal cost = new BigDecimal(50000);
		BigDecimal discount = new BigDecimal(0.9);
		Assert.assertEquals(cost.multiply(discount),  service.calculateCost(number, DiscountCategory.EMPLOYEE));

	}

	@Test
	public void testStudentTwenty() {
		BigDecimal number = new BigDecimal(15);
		BigDecimal cost = new BigDecimal(50000);
		BigDecimal discount = new BigDecimal(0.8);
		Assert.assertEquals(cost.multiply(discount),  service.calculateCost(number, DiscountCategory.STUDENT));
	}

	@Test
	public void testOtherTwenty() {
		BigDecimal number = new BigDecimal(17);
		BigDecimal cost = new BigDecimal(50000);
		Assert.assertEquals(cost,  service.calculateCost(number, DiscountCategory.OTHER));
	}

	@Test
	public void testEmployeeThirty() {
		BigDecimal number = new BigDecimal(23);
		BigDecimal cost = new BigDecimal(100000);
		BigDecimal discount = new BigDecimal(0.9);
		Assert.assertEquals(cost.multiply(discount),  service.calculateCost(number, DiscountCategory.EMPLOYEE));
	}

	@Test
	public void testStudentThirty() {
		BigDecimal number = new BigDecimal(22);
		BigDecimal cost = new BigDecimal(100000);
		BigDecimal discount = new BigDecimal(0.9);
		Assert.assertEquals(cost.multiply(discount),  service.calculateCost(number, DiscountCategory.STUDENT));

	}

	@Test
	public void testOtherThirty() {
		BigDecimal number = new BigDecimal(17);
		BigDecimal cost = new BigDecimal(100000);
		Assert.assertEquals(cost,  service.calculateCost(number, DiscountCategory.OTHER));
	}
}
