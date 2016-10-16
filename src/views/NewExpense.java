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
public final class NewExpense extends NewTransaction {

    /**
     * Creates new form NewExpense
     * @param account object that represents user account
     */
    public NewExpense(Account account) {
        super(account);
    }

    @Override
    void initComponents() {
        super.initComponents();
        title.setText("Nova Despesa");
        description.setText("Pra onde foi esse valor?");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String result = account.addExpense((double)value.getValue(), description.getText());
       total.setText(result);
    }
}
