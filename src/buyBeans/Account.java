/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyBeans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpr70
 */
public class Account {
    private final List <Income> incomes;
    private final List <Expense> expenses;
    
    Account() {
        this.incomes = new ArrayList <>();        
        this.expenses = new ArrayList <>();
    }
    
    public void addIncome() {
        Income income = new Income();
        this.incomes.add(income);
    }
    
    public float sumTotalIncomes() {
        float sum = 0;
        for (Income income : this.incomes) {
            sum += income.getValue();
        }
        return sum;
    }
    
    public float totalBalance() {
        return sumTotalIncomes() - sumTotalExpenses();
    }
    
    public float sumTotalExpenses() {
        float sum = 0;
        for (Expense expense : this.expenses) {
            sum += expense.getValue();
        }
        return sum;
    }
    
}
