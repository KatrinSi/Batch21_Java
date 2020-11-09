package day06_ArithmeticOperations;

public class AboutMySelf {
    public static void main(String[] args) {
        //String firstName = "Ekaterina", lastName = "Simakina", fullName = firstName+" "+lastName;
        String firstName = "Ekaterina";
        String lastName = "Simakina";
        String fullName = firstName+" "+lastName;
        String from = "Russia";
        String favoriteBook = "Data Structure in Java";
        String favoriteShow = "Game of Throne";

        System.out.println("Full name is: "+ fullName);
        System.out.println("From: "+ from);
        System.out.println("Favorite book is: \""+ favoriteBook+"\"");
        System.out.println("Favorite show is: "+ "\""+favoriteShow+"\""); //quote " \" "

    }

}
/*
 AboutMyself
    variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow
    output:
        Full name is: YourFullName
        From: YourCountryName
        Favorite boos is: "YourFavovoriteBook"
        Favorite Show is: "YourFavoriteShow"

 */