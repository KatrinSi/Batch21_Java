package day12_NestedIf;

public class GroupsOfPersonAge {
    public static void main(String[] args) {
        int age = 121;
        String group = " ";

        if (age < 0 || age > 120) {
            if (age < 2) {
                group = "Infant";
            } else if (age <= 5) {
                group = "Toddler";
            } else if (age <= 9) {
                group = "Kid";
            } else if (age <= 12) {
                group = "Pre-Teen";
            } else if (age <= 17) {
                group = "Teenager";
            } else if (age <= 20) {
                group = "Young Adult";
            } else if (age <= 39) {
                group = "Adult";
            } else if (age <= 49) {
                group = "Young Middle-Aged Adult";
            } else if (age <= 54) {
                group = "Middle-Aged Adult";
            } else if (age <= 64) {
                group = "Very Young Senior Citizen";
            } else if (age <= 74) {
                group = "Young Senior Citizen";
            } else if (age <= 84) {
                group = "Senior Citizen";
            } else if (age >= 85) {
                group = "Old Senior Citizen";
            } else {
                group = "Old Senior Citizen";
            }

            String groupOfAge = (age < 0 || age > 120) ? "invalid entry"
                    : (age < 2) ? "Infant"
                    : (age <= 5) ? "Toddler"
                    : (age <= 9) ? "Kid"
                    : (age <= 12) ? "Pre-Teen"
                    : (age <= 17) ? "Teenager"
                    : (age <= 20) ? "Young Adult"
                    : (age <= 39) ? "Adult"
                    : (age <= 49) ? "Young Middle-Aged Adult"
                    : (age <= 54) ? "Middle-Aged Adult"
                    : (age <= 64) ? "Very Young Senior Citizen"
                    : (age <= 74) ? "Young Senior Citizen"
                    : (age <= 84) ? "Senior Citizen"
                    : "Old Senior Citizen";

            System.out.println(groupOfAge);
        }
    }
}

/*
write a program that can define the age groups of a person
	             age groups are:
	                    infant (< 1 year)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
	                    if age > 120 or less than 0 ==> invalid entry
 */