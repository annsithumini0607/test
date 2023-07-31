package com.mycompany.bankobj;
public abstract class BankAccount 
{
    private float balance;
    private int accountnumber;
    
    public BankAccount(float balance,int accountnumber)
    {
        this.balance=balance;
        this.accountnumber=accountnumber;
    }

    //setter methods
    
    public void setbalance(float balance) {
        this.balance = balance;
    }

    public void setaccountnumber(int accountnumber) {
        this.accountnumber =accountnumber;
    }
    
    //getters methods

    public float getbalance() {
        return balance;
    }

    public int getaccountnumber() {
        return accountnumber;
    }
    
    public abstract float calculateInterest();
}
