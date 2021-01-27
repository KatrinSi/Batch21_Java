package Replit;

public class Replit_228_OOP9_GasTank {

        public double amount = 0.4, capacity;

        public Replit_228_OOP9_GasTank(double capacity){
            this.capacity = capacity;
        }
        /*
        A method named addGas that accepts a parameter of type double. The value of the amount instance variable is increased by the value of the parameter. However, if the value of amount is increased beyond the value of capacity, amount is set to capacity.
        */
        public void addGas(double value){
            amount += value;
            if (amount > capacity){
                amount = capacity;
            }
        }
        /*
        A method named useGas that accepts a parameter of type double. The value of the amount instance variable is decreased by the value of the parameter. However, if the value of amount is decreased below 0, amount is set to 0.
        */
        public void useGas(double value){
            amount-= value;
            if (amount < 0){
                amount = 0;
            }
        }
        /*
        A method named isEmpty that accepts no parameters. isEmpty returns a boolean value: true if the value of amount is less than 0.1, and false otherwise.
        */
        public boolean isEmpty(){
            if(amount < 0.1){
                return true;
            }else{
                return false;
            }
        }
        /*
        A method named isFull that accepts no parameters. isFull returns a boolean value: true if the value of amount is greater than capacity-0.1, and false otherwise.
        */
        public boolean isFull(){
            if(amount > 0.1){
                return true;
            }else{
                return false;
            }
        }
        /*
        A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.
        */
        public double getGasLevel(){
            return amount;
        }
        /*
        A method named fillUp that accepts no parameters.
        fillUp increases amount to capacity and returns
        the difference between the value of capacity and
        the original value of amount (that is, the amount of gas that is needed to fill the tank to capacity).
        */
        public double fillUp(){
            double temp = amount;
            amount = capacity;
            return capacity-temp;
        }

    @Override
    public String toString() {
        return "Replit_228_OOP9_GasTank{" +
                "amount=" + amount +
                ", capacity=" + capacity +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Replit_228_OOP9_GasTank obj = new Replit_228_OOP9_GasTank(3);
        System.out.println(obj.fillUp());
        System.out.println(obj);
    }

}