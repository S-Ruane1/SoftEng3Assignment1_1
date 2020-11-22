/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sylru 20/11/2020
 * 
 */
public class Student {
   
    
    private String name;
    private String DOB;
    private String username;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    
    public String getUsername() {
        this.username = name + age;
        return username;
    }
    public int getAge() {
        return age;
    }


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}

