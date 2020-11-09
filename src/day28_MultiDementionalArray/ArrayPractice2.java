package day28_MultiDementionalArray;

public class ArrayPractice2 {
    public static void main(String[] args) {

        String[]names = {"Erjon", "Lola", "Aamir"};
        //                  0       1        2
        int[]salary = {100_000, 110_000, 120_000};
        //                  0       1       2

        int max = salary[0];
        String nameOfMax = "";

        int min = salary[0];
        String nameOfMin = "";

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]+" : $"+salary[i]);
            if (salary[i]>= max){
                max = salary[i];
                nameOfMax = names[i];
            }
            if (salary[i]<= min){
                min = salary[i];
                nameOfMin = names[i];
            }
        }

        System.out.println(nameOfMax + " has the maximum salary: $"+ max);
        System.out.println(nameOfMin + " has the minimum salary: $"+ min);
    }
}

//John : $100000
/*
who has the max salary
who has the min salary
 */