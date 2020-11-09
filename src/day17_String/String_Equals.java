package day17_String;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class String_Equals {
    public static void main(String[] args) {
        String string = "jira";
        String string2 = new String("jira");

        System.out.println(string == string2);// false
        System.out.println(string.equals(string2));// true

        System.out.println(string.equals("Jira"));
        System.out.println(string.equalsIgnoreCase("Jira"));
    }
}
