package day13_SwitchStatement;

public class SwitchStatement2 {
        public static void main(String[] args) {

            String browser = "";
            String message = " Browser Is Selected";

            switch (browser){
                case "Chrome":
                    message = browser + message;
                    break;
                case "Firefox":
                    message = browser + message;
                    break;
                case "Opera":
                    message = browser + message;
                    break;
                case "Safari":
                    message = browser + message;
                    break;
                case "Edge":
                    message = browser + message;
                    break;
                case "Ie":
                    message = browser + message;
                    break;
                default:
                    message = "Invalid Input";
            }

            System.out.println(message);
        }
    }

