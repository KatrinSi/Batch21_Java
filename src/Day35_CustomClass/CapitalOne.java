package Day35_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();
        acct1.setInfo("Katrin", "123456778");
        acct1.getInfo();

        acct1.deposit(1000000);
        acct1.withdraw(50000);
        acct1.deposit(100000);
        acct1.showBalance();

        BankAccount acct2 = new BankAccount();
        acct2.setInfo("Marwan", "35562847");
        acct2.deposit(1000000);

        System.out.print("Dear Marwan, " );
        acct2.showBalance();
    }
}

