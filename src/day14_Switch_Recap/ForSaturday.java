package day14_Switch_Recap;

public class ForSaturday {
    public static void main(String[] args) {

        int totalClasses = 21;

        String name = "George";
        int attendance = 0;
        //int absents = amountOfClasses - attendance;
        int percentageAttendance = (attendance * 100) / totalClasses;
        String permissionExam = "";

        if (percentageAttendance >= 0 && percentageAttendance <= 100 || attendance > 0 && attendance > totalClasses) {

            if (percentageAttendance > 75) {
                permissionExam = name + " is allowed to pass an exam. Student's attendance is "
                        + percentageAttendance + "%.";

            } else {
                permissionExam = name + " is not allowed to pass an exam. Student's attendance is "
                        + percentageAttendance + "%.";
            }

        }else{
            System.out.println("Invalid input");

        }
        System.out.println(permissionExam);


    }
}

/*
A student will not be allowed to sit in exam if his/her attendance is less than 75%.
1.  Take following input
2.  Number of classes held
3.  Number of classes attended.
4.  And print percentage of class attended
         Is student is allowed to sit in exam or not.
 */