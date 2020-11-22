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
import org.joda.time.*;

public class Course {
    private String courseName;
    private Module[] modules;
    private DateTime startDate;
    private DateTime endDate;
    

    public Course(String courseName, Module[] modules, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
        
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}

