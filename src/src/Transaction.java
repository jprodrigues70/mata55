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
    
    /**
     * 
     * @param value double
     */
    public final void setValue(double value) {
        this.value = value;
    }
    
    /**
     * 
     * @return double
     */
    public double getValue() {
        return this.value;
    }
    
    /**
     * 
     * @param description String
     */
    public final void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * 
     * @return String
     */
    public String getDescription() {
        return this.description;
    }
}
