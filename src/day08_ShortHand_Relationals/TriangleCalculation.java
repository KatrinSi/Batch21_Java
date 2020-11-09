package day08_ShortHand_Relationals;

public class TriangleCalculation {
    public static void main(String[] args) {
        int angle1 = 30;
        int angle2 = 30;
        int angle3 = 90;
        int sum = angle1+angle2+angle3; //my version: int sum = 160 (any number (wrong or right))

       boolean isValid = sum == 150;   //boolean isValid = sum == angle1+angle2+angle3;

        System.out.println("The triangle is valid: "+isValid);
    }
}
/*write a program that can check if the the given triangle is valid
            angle1 = 30
            angle2 = 30
            angle = 90
            sum = 150
            isValid
        output:
            The triangle is valid: false

 */
