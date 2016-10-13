/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyBeans;

/**
 *
 * @author jpr70
 */
abstract class Transaction {
    private float value;
    private String description;
    
    Transaction() {
        
    }
    
    public void setValue(float value) {
        this.value = value;
    }
    
    public float getValue() {
        return this.value;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }
}
