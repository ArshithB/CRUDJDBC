package com.crudJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.crudJdbc.dao.EmployeeDao;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My program started...........");
        ApplicationContext context=
        		new ClassPathXmlApplicationContext("com/crudJdbc/configCrud.xml");
        EmployeeDao employeeDao = context.getBean("employeeDao",EmployeeDao.class);
        
        Employee employeeob=new Employee();
        employeeob.setId(111);
        employeeob.setName("New UnknownStudent");
        employeeob.setCity("SomeWhere On the Earth");
        employeeob.setState("Someehere on the Universe");
        employeeob.setPincode(11223344);
        
        int result=employeeDao.insert(employeeob);
        System.out.println("Employee record added " + result);
        
       
        employeeob.setId(111);
        employeeob.setName("New name to student");
        employeeob.setCity("Indore");
        employeeob.setName("Hmm");
        employeeob.setState("Earth");
        employeeob.setPincode(567886);
        int update=employeeDao.change(employeeob);
        System.out.println("Data is been updated "+update);
        
        
        
       int delete=employeeDao.delete(110);
       System.out.println("Record deleted " + delete);
        
       
       Employee employee=employeeDao.getEmployee(108);
       System.out.println(employee);
       System.out.println("------------------------------------------");
        
       List<Employee> employees = employeeDao.getAlEmployee();
       for(Employee display : employees) {
       System.out.println(display);
       }
       System.out.println(" ");
       System.out.println("OUPUT DONE!");
        
      //((AnnotationConfigApplicationContext) context).close();
    }
}
