package Replit;

public class Replit_227_OOP8_ParkingMeter {

    public int timeLeft = 0, maxTime;

    public Replit_227_OOP8_ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int value) {
        if (timeLeft < maxTime) {
            if (value == 25) {
                timeLeft = +30;
            }
        }
        if (timeLeft > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void tick() {
        if (timeLeft > 0) {
            timeLeft--;
        }
    }

    public boolean isExpired() {
        if (timeLeft == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Replit_227_OOP8_ParkingMeter{" +
                "timeLeft=" + timeLeft +
                ", maxTime=" + maxTime +
                '}';
    }

    public static class MainClass {
        public static void main(String[] args) {
            Replit_227_OOP8_ParkingMeter parking = new Replit_227_OOP8_ParkingMeter(1);
            parking.add(25);
            System.out.println(parking);

            System.out.println(parking.add(25));
        }
    }
}

