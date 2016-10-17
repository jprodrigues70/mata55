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
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import src.Account;
import src.Income;

/**
 *
 * @author jpr70
 */
public abstract class NewTransaction extends JPanel implements ActionListener {
    protected JLabel title;
    protected JLabel total;

    private JLabel dateLabel;
    private JFormattedTextField date;

    private JLabel descriptionLabel;
    protected JTextField description;

    private JLabel valueLabel;
    protected JSpinner value;

    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    protected JSpinner spinner;

    private JButton send;

    Account account;
    private Income income;

    /**
     * Creates new form NewTransaction
     * @param account
     */
    public NewTransaction(Account account) {
        //setLayout(new CardLayout());
        this.account = account;
        initComponents();
    }

    void initComponents() {
        description = new JTextField();
        date = new JFormattedTextField("date");
        valueLabel = new JLabel("Valor");
        descriptionLabel = new JLabel("Descrição");
        dateLabel = new JLabel("Data");
        send = new JButton("Salvar");
        send.addActionListener(this);

        double max = 999999999;
        SpinnerModel model = new SpinnerNumberModel(0, 0, max, 0.01);
        value = new JSpinner(model);

        send.setActionCommand("send");

        total = new JLabel("Saldo Atual:" + account.totalBalance());
        title = new JLabel("title");

        title.setFont(new java.awt.Font("Noto Sans", 0, 18));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(total)
                    .addComponent(valueLabel)
                    .addComponent(descriptionLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(value)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.DEFAULT_SIZE)
                        .addComponent(send)))
                    .addContainerGap(69,javax.swing.GroupLayout.DEFAULT_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title)
                .addComponent(total)

                .addGap(18, 18, 18)
                .addComponent(valueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(descriptionLabel)
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(send)
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Não suportado..");
    }
}
