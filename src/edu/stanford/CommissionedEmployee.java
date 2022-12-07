package edu.stanford;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 18:32
 * @Description: edu.stanford
 * @version: 1.0
 */
public class CommissionedEmployee extends Employee {

    protected CommissionedEmployee(String name) {
        super(name);
    }

    @Override
    public double getPay() {
        return BaseSalary + CommissionRate * SalesVolume;
    }

    public void setBaseSalary(double baseSalary) {
        BaseSalary = baseSalary;
    }

    public void setCommissionRate(double commissionRate) {
        CommissionRate = commissionRate;
    }

    public void setSalesVolume(double salesVolume) {
        SalesVolume = salesVolume;
    }

    private double BaseSalary;
    private double CommissionRate;
    private double SalesVolume;
}
