public class Employee extends Person implements EmployeeInterface {

    public Employee(EmployeeInfo employeeInfo) {
        super(employeeInfo.employeeName(), employeeInfo.jobDescription());
        this.employeeAge = employeeInfo.employeeAge();
        this.salary = employeeInfo.salary();
    }

    @Override
    public void printEmployeeInfo() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description: " + jobDescription);
    }

    @Override
    public double calculateAnnualsalary() {
        return salary * 12;
    }

    @Override
    public void applyRaise(double raisePercentage) {
        salary += (salary * raisePercentage / 100);
    }

    private static record EmployeeInfo(String employeeName, int employeeAge, double salary, String jobDescription) {
    }
}
