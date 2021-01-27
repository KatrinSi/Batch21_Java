package OfficeHours.Practice_12_23_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private ProductOwner PO;//HAS A
    private BusinessAnalyst BA;//HAS A
    private ScrumMaster SM;//HAS A

    public ArrayList<Tester> testers = new ArrayList<>();//HAS A
    public ArrayList<Developer> developers = new ArrayList<>();//HAS A

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
    }

    public void addTesters(Tester tester) {
        testers.add(tester);
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(String ID){
        testers.removeIf(p->p.ID.equals(ID));
    }
    public void removeDeveloper(String ID){
        developers.removeIf(p->p.ID.equals(ID));
    }

    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBA() {
        return BA;
    }

    public void setBA(BusinessAnalyst BA) {
        this.BA = BA;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
