package day30_ReturnMethods;

public class WarmUpTask5_FormattedFullName {
    public static void main(String[] args) {
        formattedFullName("cYbErTeK", "SCHOOL");
    }

    //                                      "cYbErTeK", "SCHOOL"
    public static void formattedFullName(String first, String last) {
        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase(); //"Cybertek"
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();// School

        String fullName = first + " " + last;
        System.out.println(fullName);
    }
}


/*
 5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"

 */