/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Container;
import javax.swing.JLabel;
import src.Account;

/**
 *
 * @author jpr70
 */
public class Home extends javax.swing.JPanel {

    private JLabel expenses;
    private JLabel incomes;
    private JLabel msg;
    private JLabel total;
    private JLabel totalExpenses;
    private JLabel totalIncomes;
    private JLabel totalValue;
    private JLabel version;

    /**
     * Creates new form Home
     * @param account
     */
    public Home(Account account) {
        initComponents();
        this.totalValue.setText("R$" + account.totalBalance());
        this.totalExpenses.setText("R$" + account.sumTotalExpenses());        
        this.totalIncomes.setText("R$" + account.sumTotalIncomes());
    }

    Home(Account account, Container App) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        msg = new JLabel("Bem vindo ao BuyBeans");
        version = new JLabel("Alpha 0.0001");
        total = new JLabel("Seu saldo é:");
        totalValue = new JLabel();
        incomes = new JLabel("Você recebeu:");
        totalIncomes = new JLabel();
        expenses = new JLabel("E gastou:");
        totalExpenses = new JLabel();

        msg.setFont(new java.awt.Font("Noto Sans", 0, 18));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(expenses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalExpenses))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(incomes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalIncomes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalValue))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(msg)
                        .addComponent(version)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(version)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total)
                    .addComponent(totalValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incomes)
                    .addComponent(totalIncomes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expenses)
                    .addComponent(totalExpenses))
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }
}
