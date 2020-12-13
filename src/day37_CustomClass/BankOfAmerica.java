package day37_CustomClass;

public class BankOfAmerica {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Ayse", "Bank of America", "QA", "A123", "F", 40, 60);

        double totalTax = employee1.calculateTax(0.05, 0.22);

        System.out.println("Total Tax: "+totalTax);

        System.out.println("Salary After tax: "+ (employee1.salary - totalTax) );
    }
}
