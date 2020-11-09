package day28_MultiDementionalArray;

public class ArrayPractice4 {
    public static void main(String[] args) {

        String[]names = {"Erjon", "Lola", "Aamir", "Oguzhan", "Aibek", "Elvin"};
        //                  0       1        2          3       4           5
        int[]salary = {100_000, 110_000, 120_000, 100_000, 110_000, 120_000};
        //                  0       1       2           3       4       5

        int max = salary[0];

        for ( int each : salary){
            if(each > max){
                max = each;
            }

        }
        System.out.println("Maximum salary: $"+ max);

        for(int i = 0; i < salary.length; i++){
            if (max == salary[i]){
                System.out.println(names[i]);
            }
        }

    }
}
