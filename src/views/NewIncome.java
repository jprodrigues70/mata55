/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author jpr70
 */
public final class NewIncome extends NewTransaction {

    /**
     * Creates new form NewExpense
     */
    public NewIncome() {
        super();
    }

    @Override
    void initComponents() {
        super.initComponents();
        value.setText("Digite o valor da Receita");
        description.setText("De onde veio esse valor?");
    }
}
