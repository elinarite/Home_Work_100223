package Consultation110223_home_work;

//Штатный сотрудник

public class StaffMember extends Employee{

    private int term;

    public StaffMember(int term, String name, Department department) {
        super(name, department);
        this.term = term;
    }
}
