package Replit;

public class Replit_225 {
    private int channel = 1, volumeLevel = 1;
    private boolean on = false;
    private String brand = "undefined";

    public Replit_225() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public Replit_225(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (isOn() && volumeLevel >= 1 && volumeLevel <= 6) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (isOn() && channel >= 1 && channel <= 119) {
            this.channel = channel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        if (isOn() && channel <= 119) {
            channel += 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void channelDown() {
        if (isOn() && channel >= 2) {
            channel -= 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void volumeUp() {
        if (isOn() && volumeLevel <= 6) {
            volumeLevel += 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void volumeDown() {
        if (isOn() && volumeLevel >= 2) {
            volumeLevel -= 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public boolean isOn() {
        if (on) {
            return true;
        } else {
            return false;
        }
    }

    public void turnOn() {
        if (on) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }

    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }
    }




    /*
Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
Volume can be only in the range between 1 and 7. You may change volume only if TV is on.
Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level".
Create isOn() method that will check tv status.
 */


    public static void main(String[] args) {
        Replit_225 tv = new Replit_225();
        tv.isOn();
        tv.turnOn();
        tv.channelUp();
        tv.channelUp();


    }
}