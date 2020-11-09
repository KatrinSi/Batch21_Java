package day12_NestedIf;

public class EqualityOfNumbers {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 3;
        int n3 = 3;

        String result = (n1 == n2 && n1 != n3)? "n1 and n2 are equal"
                       :(n2 == n3 && n2 != n1)? "n2 and n3 are equal"
                       :(n3 == n1 && n3 != n2)? "n3 and n1 are equal"
                       :(n1 == n2 && n1 == n3)? "all equal"
                       : "none of them are equal";
        System.out.println(result);
    }
}

/*
write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	  			if n1 and n2 are equal  => n1&n2 are equal
	   			if n2 and n3 are equal ==> n2&n3 are equal
	   			if n3 and n1 are qual ==>n3&n1 are equal
				if all equal ==> all equal
				if none of them are euqal ==> none of them are equal
 */