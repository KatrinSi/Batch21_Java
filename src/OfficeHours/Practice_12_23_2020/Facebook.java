package OfficeHours.Practice_12_23_2020;

public class Facebook {
    public static void main(String[] args) {

        ProductOwner PO = new ProductOwner("Muhtar", "234", 'M', 180000, true);
        BusinessAnalyst BA = new BusinessAnalyst("Ayse", "123", 'F', 170000, true);
        ScrumMaster SM = new ScrumMaster("Aysel", "1234", 'F', 160000, true);

        System.out.println(BA);

    }
}
