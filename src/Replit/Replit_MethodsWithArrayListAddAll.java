package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Replit_MethodsWithArrayListAddAll {
    public static void main(String[] args) {

        ArrayList<Boolean>list = new ArrayList<>(Arrays.asList(true, false, false));
        repeatAL(list);

    }

    public static void repeatAL(ArrayList<Boolean> r1) {

            r1.addAll(r1);
    }
}
