/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import src.Account;

/**
 *
 * @author jpr70
 */
public class Transactions extends javax.swing.JPanel {
    Account account;
    private JPanel panel;
    private JScrollPane scrollPanel;
    protected JTable table;
    protected JLabel title;

    /**
     * Creates new form Incomes
     * @param account
     */
    public Transactions(Account account) {
        this.account = account;
        initComponents();
    }
    
    /**
     * Layout Config
     */
    @SuppressWarnings("unchecked")
    protected void initComponents() {
        panel = new JPanel();
        scrollPanel = new JScrollPane();
        table = new JTable();
        title = new JLabel();
        title.setFont(new java.awt.Font("Noto Sans", 0, 18));

        table.getTableHeader().setReorderingAllowed(false);
        scrollPanel.setViewportView(table);

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.DEFAULT_SIZE)
                    .addComponent(title))
                .addContainerGap(18,javax.swing.GroupLayout.DEFAULT_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(scrollPanel, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}
