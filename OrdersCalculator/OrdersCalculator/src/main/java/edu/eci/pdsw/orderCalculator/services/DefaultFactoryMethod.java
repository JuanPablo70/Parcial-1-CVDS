package edu.eci.pdsw.orderCalculator.services;

import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;
import edu.eci.pdsw.orderCalculator.calculator.impl.BasicBillCalculator;
import edu.eci.pdsw.orderCalculator.validator.TaxValidator;
import edu.eci.pdsw.orderCalculator.validator.impl.StandardTaxValidator;

public class DefaultFactoryMethod extends FactoryMethod {

    @Override
    public BillCalculator createCalculator() {
        return new BasicBillCalculator();
    }

    @Override
    public TaxValidator createTax() {
        return new StandardTaxValidator();
    }
}
