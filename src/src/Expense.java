/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author jpr70
 */
public class Expense extends Transaction {

    public Expense(double value, String description) {
        super(value, description);
        System.out.println(value);
        System.out.println(description);
    }

    @Override
    public double getValue() {
        return -1 * super.getValue();
    }

}
