package day41_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Marufjon" , "Temirov", 1234);

        System.out.println(account1.getAccountHolder());
        System.out.println(account1.getBalance()+100);
        account1.deposit(3000);
        account1.availableBalance();
        System.out.println(BankAccount.bankName);
        account1.withdraw(200);
        account1.availableBalance();




    }
}
