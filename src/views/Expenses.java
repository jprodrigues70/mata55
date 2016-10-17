/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import src.Account;

/**
 *
 * @author jpr70
 */
public class Expenses extends Transactions {
    java.awt.Container App;
    
    /**
     * Creates new form NewExpense
     * @param account object that represents user account
     */
    Expenses(Account account, java.awt.Container App) {
        super(account);
        this.App = App;
    }

    /**
     * Table Layout Config
     */
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

        table.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                App.removeAll();
                App.add( new EditExpense(account, table.getSelectedRow()) );
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}

        });
    }
}
