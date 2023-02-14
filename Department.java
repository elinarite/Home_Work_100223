package Consultation110223_home_work;

public class Department {
    // Отдел (с полями Название, Количество сотрудников, Фирма)

    private String departmentName;
    private int numbersOfEmployees;
    private String CompanyNameWithDepartment;

    public Department(String departmentName, int numbersOfEmployees, String companyNameWithDepartment) {
        this.departmentName = departmentName;
        this.numbersOfEmployees = numbersOfEmployees;
        CompanyNameWithDepartment = companyNameWithDepartment;
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

    public String getCompanyNameWithDepartment() {
        return CompanyNameWithDepartment;
    }

    public void setCompanyNameWithDepartment(String companyNameWithDepartment) {
        CompanyNameWithDepartment = companyNameWithDepartment;
    }
}