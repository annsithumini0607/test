package com.mycompany.bankobj;

public class SavingAccount extends BankAccount 
{
    public SavingAccount(int accountnumber,float balance) 
    {
        super( balance,accountnumber);
    }
    
    @Override
    public float calculateInterest() 
    {
        return getbalance() * 0.12f;
    }
}
