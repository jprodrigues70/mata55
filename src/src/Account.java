/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jpr70
 */
public class Account {
    private final List <Income> incomes;
    private final List <Expense> expenses;
    
    public Account() {
        this.incomes = new ArrayList <>();        
        this.expenses = new ArrayList <>();
    }
    
    public String addIncome(double value, String description) {
        Income income = new Income(value, description);
        this.incomes.add(income);
        return ("Saldo Atual:" + this.totalBalance());
    }
    
    public String addExpense(double value, String description) {
        Expense expense = new Expense(value, description);
        this.expenses.add(expense);
        return ("Saldo Atual:" + this.totalBalance());
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
        return -sum;
    }
    
}
