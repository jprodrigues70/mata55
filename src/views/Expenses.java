/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import src.Account;

/**
 *
 * @author jpr70
 */
public class Expenses extends Transactions {
    /**
     * Creates new form NewExpense
     * @param account object that represents user account
     */
    public Expenses(Account account) {
        super(account);
    }

    @Override
    protected void initComponents() {
        super.initComponents();


        title.setText("Despesas");
        table.setModel(new javax.swing.table.DefaultTableModel(
            account.getExpensesList(),
            new String [] {
                "Descrição", "Valor", "ação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }
}
