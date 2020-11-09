package day21_WhileLoops;

import com.sun.tools.doclets.internal.toolkit.SerializedFormWriter;

public class SubstringMethodPractice {
    public static void main(String[] args) {

        String email = "John_Daniel@BofA.com";
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");
        String lastName = email.substring(0, indexOf_);

        String firstName = email.substring(indexOf_+1, indexOfAt);

        String domain = email.substring(indexOfAt + 1, email.lastIndexOf("."));



        System.out.println("lastName: "+lastName);
        System.out.println("firstName: "+firstName);
        System.out.println("fullName: "+lastName+ " "+ firstName);
        System.out.println("domain: "+ domain);




    }

}


/*


lastName_firstName@company.com
 */