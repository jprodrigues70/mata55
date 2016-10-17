/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import src.Account;

/**
 *
 * @author jpr70
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {
        setTitle("BuyBeans");

        final Account account = new Account();
        final JPanel myHome = new Home(account);
        
        final Menu menu = new Menu();

        /**
         * Listen menu action to load a specific page
         */
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JPanel panelSwitch = null;
                if ( e.getSource() == menu.newIncome ) {
                    panelSwitch = new NewIncome(account);
                }
                if ( e.getSource() == menu.newExpense ){
                    panelSwitch = new NewExpense(account);
                }
                if ( e.getSource() == menu.incomesList ){
                    panelSwitch = new Incomes(account, getContentPane());
                }
                if ( e.getSource() == menu.expensesList ){
                    panelSwitch = new Expenses(account, getContentPane());
                }
                if ( e.getSource() == menu.homePage ) {
                    panelSwitch = new Home(account);
                }

                getContentPane().removeAll();

                getContentPane().add( panelSwitch );

                revalidate();
                repaint();
            }
        };
        
        /**
         * Call menu initializer
         */
        setJMenuBar(menu.init(actionListener));
        /**
         * Defines the first app page
         */
        add( myHome );
        
        /**
         * Defines what happens when app is closed
         */
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        pack();
    }
}
