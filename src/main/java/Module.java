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
public class Module {
    private String moduleName;
    private Student[] students;
    private String id;
   

    public Module(String moduleName, Student[] students,String id) {
        this.moduleName = moduleName;
        this.students = students;
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }



    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    
     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

