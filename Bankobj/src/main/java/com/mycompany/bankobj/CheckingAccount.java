package com.mycompany.bankobj;
public class CheckingAccount extends BankAccount
{
    public CheckingAccount(int accountnumber,float balance) 
    {
        super(balance,accountnumber);
    }
    
    @Override
    
    public float calculateInterest() 
    {
        return (float) (getbalance()*0.02);  
    }
}


