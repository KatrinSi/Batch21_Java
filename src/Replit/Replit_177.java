package Replit;

public class Replit_177 {
    public boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3)
    {
        boolean isTrue = false;

        if (!(available == true||gift == true)){

            if ((ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) ||
                    (ingredient1 == 3 && ingredient2 == 1 && ingredient3 ==  2)){
                isTrue = true;
            }
        }
        return isTrue;

    }
}
