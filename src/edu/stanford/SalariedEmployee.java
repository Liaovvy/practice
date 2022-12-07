package edu.stanford;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 18:35
 * @Description: edu.stanford
 * @version: 1.0
 */
public class SalariedEmployee extends Employee {
    protected SalariedEmployee(String name) {
        super(name);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPay() {
        return salary;
    }
    private double salary;
}
