package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class KatrinSi {
    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>(Arrays.asList(new Offer(), new Offer(), new Offer()));


        offers.get(0).setInfo("California", "SDET", "CapitalOne", 120_000, true, true, false, false);
        offers.get(1).setInfo("Virginia", "PO", "Google", 150_000, true, false, false, true);
        offers.get(2).setInfo("Virginia", "SDET", "Apple", 115_000, true, false, false, true);

        /*for(int i = 0; i < offers.size();i++){
            offers.get(i).getInfo();
        }
         */


        System.out.println("======================");
        for (Offer each : offers) {
            if (each.location.equalsIgnoreCase("virginia")) {
                each.getInfo();
            }

        }
        ArrayList<Offer> localOffers = new ArrayList<>(offers);
        localOffers.removeIf(p -> !p.location.equalsIgnoreCase("virginia"));
        System.out.println("VA offers: "+ localOffers.size());

        System.out.println("=====================");

        ArrayList<Offer> SDEToffers = new ArrayList<>(offers);
        SDEToffers.removeIf(p ->!p.jobTitle.equalsIgnoreCase("sdet"));
        System.out.println("SDET offers: "+SDEToffers.size());

        System.out.println("======================");

        ArrayList<Offer> goodOffers = new ArrayList<>(offers);
        goodOffers.removeIf(p->p.salary<120000);
        System.out.println("Offers with >= 120000K: "+goodOffers.size());

        ArrayList<Offer> fullTime = new ArrayList<>(offers);
        fullTime.removeIf(p-> !p.isFullTime );
        System.out.println("Full time offers: "+fullTime.size());

    }
}
