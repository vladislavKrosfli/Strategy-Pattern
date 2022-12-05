import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Testing {
    Map<String, Strategy> list_of_people = new HashMap<String, Strategy>();

    @Before public void create_list_of_people(){
        ManagerCalculate mc1 = new ManagerCalculate();
        list_of_people.put("Nastya", mc1);
        CourierCalculate cc = new CourierCalculate();
        list_of_people.put("Vasya",cc);
        LogistCalculate lc = new LogistCalculate();
        list_of_people.put("Dmitry", lc);
        ManagerCalculate mc2 = new ManagerCalculate();
        list_of_people.put("Valeria", mc2);
    }

    @Test
    public void first_test(){
        create_list_of_people();
        Salary sal1 = new Salary("Dmitry", 5);
        sal1.setListOfPeople(list_of_people);
        Assert.assertEquals(5*90, sal1.executeSalary() ,0);
    }

    @Test
    public void second_test(){
        create_list_of_people();
        Salary sal2 = new Salary("Nastya", 10);
        sal2.setListOfPeople(list_of_people);
        Assert.assertEquals(7*100+3*100*0.2, sal2.executeSalary() ,0);
    }

    @Test
    public void third_test(){
        create_list_of_people();
        Salary sal3 = new Salary("Valeria", 5);
        sal3.setListOfPeople(list_of_people);
        Assert.assertEquals(5*100, sal3.executeSalary() ,0);
    }

    @Test
    public void fourth_test(){
        create_list_of_people();
        Salary sal4 = new Salary("Vasya", 1);;
        sal4.setListOfPeople(list_of_people);
        Assert.assertEquals(0.9*115, sal4.executeSalary() ,0);
    }

    @Test
    public void fifth_test(){
        create_list_of_people();
        Salary sal5 = new Salary("Vasya", 5);
        sal5.setListOfPeople(list_of_people);
        Assert.assertEquals(5*115, sal5.executeSalary() ,0);
    }
}
