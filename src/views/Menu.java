/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jpr70
 */
public final class Menu extends javax.swing.JFrame {
    private JMenu expenses;
    private JMenu incomes;
    private JMenu nav;
    private JMenuBar menu;
    private JMenuItem newExpense;
    JMenuItem newIncome;


    Menu() {
    }

    /**
     *
     * @param actionListener
     * @return
     */
    public JMenuBar init(ActionListener actionListener) {

        menu = new JMenuBar();
        nav = new JMenu();

        expenses = new JMenu();
        newExpense = new JMenuItem();

        incomes = new JMenu();
        newIncome = new JMenuItem();

        newExpense.setText("Nova Despesa");
        newExpense.addActionListener( actionListener );
        expenses.add(newExpense);

        newIncome.setText("Nova Receita");
        newIncome.addActionListener( actionListener );
        incomes.add(newIncome);

        incomes.setText("Receitas");
        menu.add(incomes);

        expenses.setText("Despesas");
        menu.add(expenses);

        return menu;
    }
}
