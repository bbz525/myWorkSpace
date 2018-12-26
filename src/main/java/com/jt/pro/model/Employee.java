package com.jt.pro.model;

import com.jt.pro.common.SexEnum;

import java.util.Date;
import java.util.List;

public class Employee {
    private int id;
    private String realName;
    private SexEnum sex;
    private Date birthday;
    private String mobile;
    private String email;
    private  String postion;
    private  String note;
    private WorkCard workCard;
    private List<EmployeeTask> employeeTask;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealNAME(String realName) {
        this.realName = realName;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public WorkCard getWorkCard() {
        return workCard;
    }

    public void setWorkCard(WorkCard workCard) {
        this.workCard = workCard;
    }

    public List<EmployeeTask> getEmployeeTask() {
        return employeeTask;
    }

    public void setEmployeeTask(List<EmployeeTask> employeeTask) {
        this.employeeTask = employeeTask;
    }
}
