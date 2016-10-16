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

    public Expense(float value, String description) {
        super(value, description);
        System.out.println(value);
        System.out.println(description);
    }

    @Override
    public float getValue() {
        return -1 * super.getValue();
    }

}
