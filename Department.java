package Consultation110223_home_work;

public class Department {
    // Отдел (с полями Название, Количество сотрудников, Фирма)

    private String departmentName;

    ;
    private int numbersOfEmployees;
    private Company company;

    public Department(String departmentName, int numbersOfEmployees, Company company) {
        this.departmentName = departmentName;
        this.numbersOfEmployees = numbersOfEmployees;
        this.company = company;
    }
    public Department(String departmentName, Company company) {
        this.departmentName = departmentName;
        this.company = company;
    }


    public Department() {

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumbersOfEmployees() {
        return numbersOfEmployees;
    }

    public void setNumbersOfEmployees(int numbersOfEmployees) {
        this.numbersOfEmployees = numbersOfEmployees;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}