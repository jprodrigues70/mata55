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
    
    /**
     * 
     * @return Matrix with {income.description, income.value, text}
     */
    public Object[][] getIncomesList() {
        int size = this.incomes.size();
        
        Object[][] ob = new Object[size][3];
        int i = 0;
        for (Income income : this.incomes) {
            ob[i][0] = this.incomes.get(i).getDescription();
            ob[i][1] = "R$ " + this.incomes.get(i).getValue();
            ob[i][2] = "Editar";
            i++;
        }
        return ob;
    }
    
    /**
     * 
     * @return Matrix with {expense.description, expense.value, text}
     */
    public Object[][] getExpensesList() {
        int size = this.expenses.size();
        
        String[] description = new String[3];
        String[][] ob = new String[size][3];
        int i = 0;
        for (Expense expense : this.expenses) {
            ob[i][0] = expense.getDescription();
            ob[i][1] = "R$ " + expense.getValue();
            ob[i][2] = "";
            i++;
        }
        return ob;
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
