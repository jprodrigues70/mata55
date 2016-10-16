/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import src.Account;

/**
 *
 * @author jpr70
 */
public final class EditIncome extends EditTransaction {
    private int id;
    /**
     * Creates new form NewExpense
     * @param account
     * @param id
     */
    public EditIncome(Account account, int id) {
        super(account, id);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String result = account.editIncome((double)value.getValue(), description.getText(), this.getId());
       total.setText(result);
    }
}
