package day35_CustomClass;

import java.time.LocalDate;

public class BankAccount {
    public String accountName;
    public String accountNumber;
    public double availableBalance = 0;

    public void setInfo(String acctName,String acctNumber ){
        accountName = acctName;
        accountNumber = acctNumber;
    }
    public void getInfo(){
        System.out.println("============================");
        System.out.println("Date: "+ LocalDate.now());
        System.out.println("Account Name: "+ accountName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Available balance: "+ availableBalance);
        System.out.println("=============================");
    }


    public void deposit(double amount){
        availableBalance+=amount;
    }

    public void withdraw(double amount){
        availableBalance-=amount;
    }

    public void showBalance(){
        System.out.println("As of "+LocalDate.now()+" your available balance is: $"+ availableBalance);
    }
}
/*
3. BankAccount
            Attributes:
                accountName, accountNumber, availableBalance
            Actions:
                setInfo: sets accountName, accountNumber,
                getInfo:
                deposit:
                wihtdraw:
                showBalance:

 */