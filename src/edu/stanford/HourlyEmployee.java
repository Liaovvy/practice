package edu.stanford;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 18:28
 * @Description: edu.stanford
 * @version: 1.0
 */
public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name) {
        super(name);
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHourlyWorked(double hourlyWorked) {
        this.hourlyWorked = hourlyWorked;
    }

    @Override
    public double getPay() {
        return hourlyRate * hourlyWorked;
    }
    private double hourlyRate;
    private double hourlyWorked;
}
