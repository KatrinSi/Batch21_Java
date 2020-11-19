package Replit;

import com.sun.tools.javac.code.Attribute;

import java.util.*;

public class Replit_129 {
    public static void main(String[] args) {
        System.out.println("-----EXAMPLE RUN ---------");
        String[] numbers = {"zero", "one", "two", "three", "four"};
        System.out.println(Arrays.toString(getWithE(numbers)));

    }

    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        int count = 0;
        String[] fewValues = new String[count];
        String temp = "";
        for (int i = 0; i < arr.length; i++) {//"zero", "one", "two", "three", "four"
            if (arr[i].contains("e")) {
                count++;
                temp += arr[i]+" ";
            }
        }
        fewValues = temp.split(" ");
        System.out.println(fewValues.length);

        //YOUR CODE ENDS HERE -----------------------

        return fewValues;

    }
}
/*
Given a String array arr with the following elements
["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter "e" in them

You need to know how many element contain "e" and create array accordingly

Values in fewValues array need to be["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"]
fewValues -> ["be",  "lel", "oreo"]

arr -> ["e", "hey", "bye", "furey", "spoon"]
fewValues ->["e", "hey", "bye", "furey"]
 */