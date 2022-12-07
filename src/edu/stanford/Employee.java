package edu.stanford;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 18:26
 * @Description: edu.stanford
 * @version: 1.0
 */
public abstract class Employee {
    protected Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract double getPay();

    private String name ; //
}
