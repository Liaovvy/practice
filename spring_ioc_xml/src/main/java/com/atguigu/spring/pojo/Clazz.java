package com.atguigu.spring.pojo;

import java.util.List;

/**
 * @Auther: yuguo
 * @Date: 2022/11/16 - 11 - 16 - 16:28
 * @Description: com.atguigu.spring.pojo
 * @version: 1.0
 */
public class Clazz {
    private Integer cid;
    private String cname;
    List<Student> students;

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", students=" + students +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}
