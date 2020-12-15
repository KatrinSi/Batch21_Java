package day41_Encapsulation;

public class BankAccount {
    public final static String bankName = "Bank of America";
    public String firstName, lastName;

    private String accountHolder;
    private double balance;
    private int accountNumber;

    public BankAccount(String firstName, String lastName, int accountNumber) {
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName;
        setAccountHolder(firstName, lastName);
        setAccountNumber(accountNumber);
    }

    public String getAccountHolder() { //firstName + lastName
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accountHolder = firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double deposit) {
        if (deposit < 0) {
            System.out.println("Invalid amount");
            return;
        }
        System.out.println("Depositing " + deposit + " to the account number " + accountNumber);
        setBalance(balance + deposit);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing $" + amount + " from account number " + accountNumber);
        setBalance(balance - amount);
    }

    public void availableBalance(){
        System.out.println("The available balance for account number "+getAccountNumber()+ " is $"+getBalance());
    }
}
