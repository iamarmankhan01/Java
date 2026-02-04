package com.app.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class B {

	public static void main(String[] args) {
      List<Employee> employee =Arrays.asList(
    		  new Employee(1,"Saif",35200),
    		  new Employee(2,"Atif",30000),
    		  new Employee(3,"Kaif",52000)
    		  );
      Map<Integer, List<Employee>> newVal = 
    		  employee.stream().collect(Collectors.groupingBy(e->e.getSalary()));
      
      newVal.forEach((salary,empList)->{
    	  System.out.println("Salary -> "+salary);
    	  empList.forEach(emp-> System.out.println(emp.getName()));
      });
      
	}
}
