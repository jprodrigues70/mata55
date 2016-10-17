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
    
    protected JMenuItem newExpense;  
    protected JMenuItem expensesList;    
    protected JMenuItem incomesList;
    protected JMenuItem newIncome;
    
    protected JMenuItem homePage;


    Menu() {
    }

    /**
     * Navigation menu config
     * @param actionListener
     * @return
     */
    public JMenuBar init(ActionListener actionListener) {

        menu = new JMenuBar();
        
        homePage = new JMenuItem("Início");  
        
        expenses = new JMenu("Despesas");
        expensesList = new JMenuItem("Exibir");   
        newExpense = new JMenuItem("Nova Despesa");

        incomes = new JMenu("Receitas");
        incomesList = new JMenuItem("Exibir");        
        newIncome = new JMenuItem("Nova Receita");
        
        expensesList.addActionListener( actionListener );
        newExpense.addActionListener( actionListener );
        expenses.add(expensesList);        
        expenses.add(newExpense);
        
        
        incomesList.addActionListener( actionListener );
        newIncome.addActionListener( actionListener );
        incomes.add(incomesList);        
        incomes.add(newIncome);
        
        homePage.addActionListener( actionListener );
        
        menu.add(homePage);
        
        menu.add(incomes);

        menu.add(expenses);

        return menu;
    }
}
