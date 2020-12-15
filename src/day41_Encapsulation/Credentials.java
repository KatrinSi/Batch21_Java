package day41_Encapsulation;

import day20_ForLoop.StringReverse;

public class Credentials {

    private String userName = "cybertek";//data is hiden
    private double password = 1234;

    public String getUserName() {//read only
        return userName;
    }

    public double getPassword() {//read only
        return password;
    }

    public void setUserName(String userName) {
       /* if(userName.length() < 8){//example
            return;
        }
        */
        this.userName = userName;
    }
    public void setPassword(double password){
        this.password = password;
    }


}
