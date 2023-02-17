package Consultation110223_home_work;
//Сотрудник по контракту
public class ContractEmployee extends Employee{

    private int term;
    public ContractEmployee(int term, String name, Department department) {
        super(name, department);
        this.term = term;
    }
}
