package day38_StaticKeyword.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersTeam = new ArrayList<>();
    public ArrayList<Developers> developersTeam = new ArrayList<>();

    public static boolean hasSprint = true, hasMeetings = true;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void hireTester(Tester tester) {
        testersTeam.add(tester);
    }

    public void fireTester(String ID) {
        testersTeam.removeIf(p -> p.ID.equals(ID));
    }

    public void hireDeveloper(Developers developer) {
        developersTeam.add(developer);
    }

    public void fireDeveloper(String ID) {
        developersTeam.removeIf(p -> p.ID.equals(ID));
    }

    public void hireTester(Tester[] testers) {
        testersTeam.addAll(Arrays.asList(testers));
    }
    public void hireDeveloper(Developers[] developers){
        developersTeam.addAll(Arrays.asList(developers));
    }



   public String toString(){
        return "PO: "+ PO+ ", BA: "+BA+", SM: "+SM+", Total number of testers: "
                +testersTeam.size()+", Total number of developers: "+developersTeam.size();
   }
}
