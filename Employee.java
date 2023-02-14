package Consultation110223_home_work;

public class Employee {
        // //в) Сотрудник (с полями ФИО, Должность, Оклад, Отдел).

        private String nameSurname;
        private String jobTitle;
        private double salary;
        private String DepartmentName;


        public Employee(String nameSurname, String jobTitle, double salary, String departmentName) {
            this.nameSurname = nameSurname;
            this.jobTitle = jobTitle;
            this.salary = salary;
            this.DepartmentName = departmentName;
        }

    public Employee() {

    }

    public String getNameSurname() {
            return nameSurname;
        }

        public void setNameSurname(String nameSurname) {
            this.nameSurname = nameSurname;
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

        public String getDepartmentName() {
            return DepartmentName;
        }

        public void setDepartmentName(String departmentName) {
            DepartmentName = departmentName;
        }
    }




