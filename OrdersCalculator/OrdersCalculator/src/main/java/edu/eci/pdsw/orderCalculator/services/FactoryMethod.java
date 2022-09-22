package edu.eci.pdsw.orderCalculator.services;

import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;
import edu.eci.pdsw.orderCalculator.validator.TaxValidator;

abstract public class FactoryMethod {
    abstract public BillCalculator createCalculator();
    abstract public TaxValidator createTax();
}
