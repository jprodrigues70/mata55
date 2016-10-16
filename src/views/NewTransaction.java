/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import src.Expense;

/**
 *
 * @author jpr70
 */
public class NewTransaction extends javax.swing.JPanel implements ActionListener {
    private JLabel DateLabel;
    private JFormattedTextField date;
    JTextField description;
    private JLabel descriptionLabel;
    private JButton send;
    JFormattedTextField value;
    private JLabel valueLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;

    /**
     * Creates new form NewTransaction
     */
    public NewTransaction() {
        //setLayout(new CardLayout());
        initComponents();
    }

    void initComponents() {
        
        description = new JTextField();
        date = new JFormattedTextField();
        valueLabel = new JLabel();
        descriptionLabel = new JLabel();
        DateLabel = new JLabel();
        send = new JButton("Salvar");
        send.addActionListener(this);
        
        value = new JFormattedTextField();
        
        date.setText("date");
        valueLabel.setText("Valor");
        descriptionLabel.setText("Descrição");
        DateLabel.setText("Data");

        send.setActionCommand("send");
        
        add(valueLabel);
        add(value);
        add(descriptionLabel);
        add(description);
        add(DateLabel);
        add(date);
        add(send);
    }

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(value.getText());
       // Expense expense = new Expense((float) value.getValue(), description.getText());
    }
}
