package day28_MultiDementionalArray;

public class ArrayPractice2_AverageSalary {
    public static void main(String[] args) {

        double[] salary = {100_000.5, 110_000.5, 120_000.5};
        double sum = 0;

        double max = salary[0];
        double min = salary[0];

        for (double each: salary){
            sum+= each;
            if (each > max ){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }


        double average = sum/salary.length; //!!!! AVERAGE SALARY!!!!
        System.out.println("The average salary is: "+average);
        System.out.println("The maximum salary is: "+max);
        System.out.println("The minimum salary is: "+min);
    }
}
