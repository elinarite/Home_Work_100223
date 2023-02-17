package Consultation110223_home_work;

public class Employee {
    // //в) Сотрудник (с полями ФИО, Должность, Оклад, Отдел).

    private String name;
    private String jobTitle;
    private double salary;
    private Department department;


    public Employee(String name, String jobTitle, double salary, Department department) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
    }
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }


    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}





