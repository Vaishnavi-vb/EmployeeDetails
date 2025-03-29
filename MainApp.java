package com.pro;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	
	public static void main(String args[]) {
		List<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee(1,"Virat",30000);
		Employee e2=new Employee(2,"Rohit",40000);
		Employee e3=new Employee(3,"Shubham",50000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		for(Employee obj:list) {
			obj.displayDetail();	
		}
		
		
		
	}

}
