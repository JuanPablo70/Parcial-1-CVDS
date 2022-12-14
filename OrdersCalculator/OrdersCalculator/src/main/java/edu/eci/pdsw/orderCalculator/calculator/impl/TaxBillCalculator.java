package edu.eci.pdsw.orderCalculator.calculator.impl;

import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;
import edu.eci.pdsw.orderCalculator.model.Dish;
import edu.eci.pdsw.orderCalculator.model.Order;
import edu.eci.pdsw.orderCalculator.services.DefaultFactoryMethod;
import edu.eci.pdsw.orderCalculator.validator.TaxValidator;
import edu.eci.pdsw.orderCalculator.validator.impl.StandardTaxValidator;

public class TaxBillCalculator implements BillCalculator {

	private TaxValidator tv;

	public TaxBillCalculator() {
		tv = new DefaultFactoryMethod().createTax();
	}

    public int calculatePrice(Order o) {
    	
        int total = 0;
        float iva = 0;
        for (Dish p : o.getDishes()){
          iva = tv.getPercentaged(p);          
          total += p.getPrice()+(p.getPrice()*iva);
        }
        return total;
    }
}
