/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author jpr70
 */
interface AccountBase {    
    /**
     * 
     * @param id 
     * @return Income
     */
    public Income getIncome(int id);
    
    /**
     * 
     * @param id
     * @return Expense
     */
    public Expense getExpense(int id);
    
    /**
     * 
     * @param id 
     * @return void
     */
    public void deleteExpense(int id);
    
    /**
     * 
     * @param id 
     * @return void
     */
    public void deleteIncome(int id);

    /**
     * 
     * @param value double
     * @param description String
     * @return String
     */
    public String addIncome(double value, String description);

    /**
     * 
     * @param value double
     * @param description String
     * @return String
     */
    public String addExpense(double value, String description);
    
    /**
     * 
     * @param value double
     * @param description String
     * @param id int
     * @return String
     */
    public String editIncome(double value, String description, int id);
    
    /**
     * 
     * @param value double
     * @param description String
     * @param id int
     * @return String
     */
    public String editExpense(double value, String description, int id);
    
    /**
     * 
     * @return Matrix with {income.description, income.value, text}
     */
    public Object[][] getIncomesList();
    
    /**
     * 
     * @return Matrix with {expense.description, expense.value, text}
     */
    public Object[][] getExpensesList();
    
    /**
     * 
     * @return float that represents Total incomes - Total expenses
     */
    public float totalBalance();

}
