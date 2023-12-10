package tu.varna.pms.lab1.domain;

import tu.varna.pms.lab1.interfaces.EmployeePeyroll;

import java.io.Serializable;
import java.util.Random;

public abstract class Employee implements EmployeePeyroll, Serializable {

    private final String firstName;
    private final String lastName;
    private final int yearsOfService;
    private final int salary;

    protected Employee(String firstName, String lastName, int yearsOfService) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfService = yearsOfService;
        this.salary = calculateSallary();
    }
    @Override
    public int calculateSallary() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public int getSalary() {
        return salary;
    }
}
