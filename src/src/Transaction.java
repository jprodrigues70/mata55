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
abstract class Transaction {
    private double value;
    private String description;

    Transaction(double value, String description) {
        this.setValue(value);
        this.setDescription(description);
    }

    public final void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
