package com.atguigu.spring.pojo;

import java.util.Arrays;

/**
 * @Auther: yuguo
 * @Date: 2022/11/16 - 11 - 16 - 9:41
 * @Description: com.atguigu.spring.pojo
 * @version: 1.0
 */
public class Student {
    private Integer sid;
    private String sname;
    private Integer age;
    private String gender;
    private Double score;
    private Clazz clazz;
    private String[] hobby;

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", clazz=" + clazz +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    public Student() {
    }

    public Integer getSid() {
        return sid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(Integer sid, String sname, String gender, Integer age) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.gender = gender;
    }
    public Student(Integer sid, String sname,String gender,Double score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
        this.gender = gender;
    }

}
