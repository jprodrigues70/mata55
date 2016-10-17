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
    private final java.awt.Container App;
    /**
     * Creates new form NewExpense
     * @param account
     * @param id
     * @param App
     */
    public EditIncome(Account account, int id, java.awt.Container App) {
        super(account, id, 1);
        this.App = App;
        title.setText("Editar Receita");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "send":
                String result = account.editIncome((double)value.getValue(), description.getText(), this.getId());
                /**
                 * Atualiza o total na página de edição, e na de criação
                 */
                total.setText(result);
                break;
            case "delete":
                account.deleteIncome(this.getId());
                this.App.removeAll();
                this.App.add(new Incomes(account, this.App));
                this.App.revalidate();
                this.App.repaint();
                
                break;
        }
    }
}
