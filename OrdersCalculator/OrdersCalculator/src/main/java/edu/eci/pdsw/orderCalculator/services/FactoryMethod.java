package edu.eci.pdsw.orderCalculator.services;

import edu.eci.pdsw.orderCalculator.calculator.BillCalculator;

abstract public class FactoryMethod {
    abstract public BillCalculator createCalculator();
}
