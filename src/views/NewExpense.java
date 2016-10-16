/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import src.Account;
import src.Expense;

/**
 *
 * @author jpr70
 */
public final class NewExpense extends NewTransaction {

    /**
     * Creates new form NewExpense
     */
    public NewExpense(Account account) {
        super(account);
    }

    @Override
    void initComponents() {
        super.initComponents();
        //value.setText("Digite o valor da despesa");
        description.setText("Pra onde foi esse valor?");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       account.addExpense((double)value.getValue(), description.getText());
    }
}
