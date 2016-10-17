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
    
    /**
     * Indify the next step. Delete or Update/Create
     * @param e event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String result;
        if(e.getActionCommand() == "send") {
            result = account.editExpense((double)value.getValue(), description.getText(), this.getId());
            /**
             * Atualiza o total na página de edição, e na de criação
             */
            total.setText(result);
        } else if(e.getActionCommand() == "delete") {
            account.deleteExpense(this.getId());
        }
    }
}
