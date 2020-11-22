/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.*;
/**
 *
 * @author sylru 20/11/2020
 * 
 */
public class TestRun {

    @Test
    public void studentNameTest() {
        Student s = new Student();
        s.setAge(26);
        s.setDOB("01/05/1994");
        s.setName("Kevin Pieters");
        s.setId(17509293);

        Assert.assertEquals(s.getUsername(), s.getName() + s.getAge());
    }

}

