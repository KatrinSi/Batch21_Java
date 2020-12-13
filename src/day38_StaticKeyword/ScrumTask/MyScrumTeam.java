package day38_StaticKeyword.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {


        Tester tester1 = new Tester();
        tester1.setInfo("Muhtar", "a123", "Tester", "Cybertek", 150000, 'M');
        Tester tester2 = new Tester();
        tester2.setInfo("Asiya", "a124", "Tester", "Cybertek", 130000, 'F');
        Tester tester3 = new Tester();
        tester3.setInfo("Saim", "a125", "Tester", "Cybertek", 1400000, 'M');

        Developers developer1 = new Developers();
        developer1.setInfo("Tima", "a126", "Developer", "Bank of America", 170000, 'M');
        Developers developer2 = new Developers();
        developer2.setInfo("Daniel", "a127", "Senior developer", "Cybertek", 2600000, 'M');
        Developers developer3 = new Developers();
        developer3.setInfo("Lenny", "a128", "Developer", "Bank of America", 1900000, 'M');
        Developers developer4 = new Developers();
        developer4.setInfo("Senya", "a129", "Developer", "Bank of America", 170000, 'M');

        Tester[] testers = {tester2, tester3};

        ScrumTeam scrumTeam1 = new ScrumTeam();
        scrumTeam1.hireTester(tester1);
        scrumTeam1.hireTester(testers);
        scrumTeam1.setInfo("Elvira", "Yalcin", "Marvan");

        Developers[] developers = {developer1, developer2};
        scrumTeam1.hireDeveloper(developers);
        scrumTeam1.hireDeveloper(developer3);
        scrumTeam1.hireDeveloper(developer4);

        // System.out.println(scrumTeam1);

        /*for (Developers each : scrumTeam1.developersTeam) {
            System.out.println(each);
        }

        for (Tester each:scrumTeam1.testersTeam){
            System.out.println(each);
        }

         */
        ScrumTeam scrumTeam2 = new ScrumTeam();
        Tester tester4 = new Tester();
        Tester tester5 = new Tester();
        Developers developer5 = new Developers();
        Developers developer6 = new Developers();

        tester4.setInfo("Asuman", "GR-24", "SDET", "Javaholics", 170000, 'F');
        tester5.setInfo("Ercan", "GR-24", "SDET", "Javaholics", 170000, 'M');

        developer5.setInfo("Shardae", "GR-24", "Full-Stack Developer", "Javaholics", 170000, 'F');
        developer6.setInfo("ALtynai", "GR-24", "Full-Stack Developer", "Javaholics", 180000, 'F');

        scrumTeam2.hireDeveloper(developer5);
        scrumTeam2.hireDeveloper(developer6);

        scrumTeam2.hireTester(tester4);
        scrumTeam2.hireTester(tester5);

        scrumTeam2.setInfo("Svetlana", "Daniel", "Maysa");

        System.out.println(scrumTeam1);
        System.out.println(scrumTeam2);

        System.out.println("=====================================");
        ScrumTeam[] scrums = {scrumTeam1, scrumTeam2};

        for (ScrumTeam eachScrum : scrums) {
            for (Tester eachTester : eachScrum.testersTeam) {
                System.out.println(eachTester.name + ": $" + eachTester.salary);
            }
        }
        System.out.println("====================================");
        for (ScrumTeam eachScrum : scrums) {
            for (Developers eachDeveloper : eachScrum.developersTeam) {
                System.out.println(eachDeveloper.name + ": $" + eachDeveloper.salary);
            }
        }
        System.out.println("====================================");

        int countDev = 0;
        int countTest = 0;

        for (ScrumTeam each : scrums) {
            countTest += each.testersTeam.size();
            countDev += each.developersTeam.size();
        }

        System.out.println("total devs: " + countDev);
        System.out.println("total test: " + countTest);


        //scrumTeam1.fireDeveloper("a128");
        //System.out.println(scrumTeam1);


        scrums[0].SM = "Aihaiti";
        scrums[1].SM = "Aysel";
        System.out.println(scrums[0].SM);
        System.out.println(scrums[1].SM);
        System.out.println("=========================");

        ArrayList<ScrumTeam> scrumList = new ArrayList<>();
        scrumList.addAll(Arrays.asList(scrums));
        System.out.println(scrumList);

        for (int i = 0; i < scrumList.size(); i++) {
            ScrumTeam eachTeam = scrumList.get(i);
            for (int j = 0; j < eachTeam.testersTeam.size(); j++) { // testers
                Tester eachTester = eachTeam.testersTeam.get(j);
                System.out.println(eachTester.name+": "+eachTester.salary);
            }
            for (int k = 0; k < eachTeam.developersTeam.size();k++){  // developers
                Developers eachDeveloper = eachTeam.developersTeam.get(k);
                System.out.println(eachDeveloper.name+": "+ eachDeveloper.salary);
            }
        }



    }

}
