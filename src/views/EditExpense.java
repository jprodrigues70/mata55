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
public final class EditExpense extends EditTransaction {
    private int id;
    /**
     * Creates new form NewExpense
     * @param account
     * @param id
     */
    public EditExpense(Account account, int id) {
        super(account, id, 2);
        title.setText("Editar Despesa");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "send") {
            String result = account.editExpense((double)value.getValue(), description.getText(), this.getId());
            total.setText(result);
        } else if(e.getActionCommand() == "delete") {
            account.deleteExpense(this.getId());
        }
    }
}
