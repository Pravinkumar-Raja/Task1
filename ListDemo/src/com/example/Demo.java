package com.example;

import java.util.ArrayList;

public class Demo {
	ArrayList<Employee> al;
	
	public ArrayList<Employee> addAndViewAllEmployee()

	{
	al=new ArrayList<Employee>();
	al.add(new Employee(101,"Vijay",45000));
	al.add(new Employee(102,"Karthik",56000));
	al.add(new Employee(103,"Praveen",66000));
	return al;
	}
	public Employee viewEmployeeById(int empid)
	{
	Employee eb=new Employee();
	for(Employee e:al)
	{
	if(e.getEmpid()==empid)
	{
	eb=e;
	}
	}
	return eb;
	
	}
	public static void main(String[] args) {
//		Employee em=new Employee();
//		ArrayList<Employee> a=new ArrayList<Employee>();
//		em.setEmpid(101);
//		em.setEmpname("Pravin");
//		em.setEmpsal(33000);
//		
//		a.add(em);
//		System.out.println(a);
//		for(Employee en: a)
//		{
//			System.out.println(en.getEmpid()+" "+en.getEmpname()+" "+en.getEmpsal());
//		}
//	}

	Demo ld=new Demo();

	ArrayList<Employee> allEmp=ld.addAndViewAllEmployee();

	allEmp.forEach(e->{System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getEmpsal());});

	Employee emp=ld.viewEmployeeById(102);

	System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getEmpsal());

}
}
