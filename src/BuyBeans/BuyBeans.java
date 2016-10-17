/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuyBeans;

import javax.swing.UIManager;
import views.App;
import views.NewExpense;

/**
 *
 * @author jpr70
 */
public class BuyBeans {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (
            ClassNotFoundException
            | InstantiationException
            | IllegalAccessException
            | javax.swing.UnsupportedLookAndFeelException ex
        ) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the App*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    
}
