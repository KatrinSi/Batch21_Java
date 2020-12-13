package day40_Constructor;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Employee {
    public String name, jobTitle, ID;
    public double salary;

    public Employee (String name){
        this.name = name;
    }
    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

}
