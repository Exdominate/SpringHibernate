/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfirstproject;

/**
 *
 * @author emergency
 */
public class User {
    private Integer userid;
    private String name;
    private String surname;
    private String position;
    private Double salary;

    public User() {
    }

    public User(Integer userid, String name, String surname, String position, Double salary) {
        this.userid = userid;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }        

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }                
}
