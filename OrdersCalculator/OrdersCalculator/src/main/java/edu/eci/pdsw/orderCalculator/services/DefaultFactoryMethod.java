package edu.eci.pdsw.orderCalculator.services;

import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;
import edu.eci.pdsw.orderCalculator.calculator.impl.BasicBillCalculator;

public class DefaultFactoryMethod extends FactoryMethod {

    @Override
    public BillCalculator createCalculator() {
        return new BasicBillCalculator();
    }
}
