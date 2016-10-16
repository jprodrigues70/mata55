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
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import src.Account;
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
     JSpinner value;
    private JLabel valueLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    JSpinner  spinner;
    Account account;

    /**
     * Creates new form NewTransaction
     */
    public NewTransaction(Account account) {
        //setLayout(new CardLayout());
        this.account = account;
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
        
        //value = new JFormattedTextField();
        SpinnerModel model = new SpinnerNumberModel(9.9, 0, 15, 0.1);     
        value = new JSpinner(model);
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
