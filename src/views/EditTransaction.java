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
import src.Expense;
import src.Income;

/**
 *
 * @author jpr70
 */
public abstract class EditTransaction extends JPanel implements ActionListener {
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
    
    private JButton delete;


    Account account;
    private Income income;
    private Expense expense;

    private int id;

    /**
     * Creates new form NewExpense
     * @param account
     * @param id
     * @param type
     */
    public EditTransaction(Account account, int id, int type) {
        this.account = account;
        this.id = id;
        verifyType(type);
        initComponents();
    }

    public int getId(){
        return this.id;
    }

    public void verifyType(int type) {
        if (type == 1) {
            this.income = this.account.getIncome(id);
            this.expense = null;
        } else {
            this.expense = this.account.getExpense(id);
            this.income = null;
        }
    }

    void initComponents() {
        description = new JTextField();
        if (this.income != null) {
            description.setText(this.income.getDescription());
        } else {
            description.setText(this.expense.getDescription());
        }

        valueLabel = new JLabel("Valor");
        descriptionLabel = new JLabel("Descrição");
        dateLabel = new JLabel("Data");
        
        send = new JButton("Salvar");        
        delete = new JButton("Excluir");

        send.addActionListener(this);
        delete.addActionListener(this);

        send.setActionCommand("send");       
        delete.setActionCommand("delete");


        double max = 999999999;
        SpinnerModel model = null;
        if (this.income != null) {
            model = new SpinnerNumberModel(this.income.getValue(), 0, max, 0.01);
        } else {
            model = new SpinnerNumberModel(this.expense.getValue(), 0, max, 0.01);
        }

        value = new JSpinner(model);


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
                    .addComponent(delete)
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
                .addComponent(delete)


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
