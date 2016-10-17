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
    private java.awt.Container App;
    /**
     * Creates new form NewExpense
     * @param account
     * @param id
     */
    public EditExpense(Account account, int id, java.awt.Container App) {
        super(account, id, 2);
        this.App = App;
        title.setText("Editar Despesa");
    }
    
    /**
     * Indify the next step. Delete or Update/Create
     * @param e event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String result;
        switch (e.getActionCommand()) {
            case "send":
                result = account.editExpense((double)value.getValue(), description.getText(), this.getId());
                /**
                 * Atualiza o total na página de edição, e na de criação
                 */
                total.setText(result);
                break;
            case "delete":
                account.deleteExpense(this.getId());
                this.App.removeAll();
                this.App.add(new Expenses(account, this.App));
                this.App.revalidate();
                this.App.repaint();
                break;
        }
    }
}
