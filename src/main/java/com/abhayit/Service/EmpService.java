package com.abhayit.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhayit.Entity.Address;
import com.abhayit.Entity.Employee;
import com.abhayit.Repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository emprepo;
	
	
	public void meth1()
	{
		System.out.println("Hello");
	Employee e= new Employee();
	e.setEmpName("sujataha");
	e.setEmpSalary(1000.00);
	
	
	 Address a1 =new Address();
	 a1.setCity("bihar");
	 a1.setCountry("India");
	 a1.setState("Maharashtra");
	 a1.setEmp(e);
	 
	 Address a2 =new Address();
	 a2.setCity("pune");
	 a2.setCountry("Teleangana");
	 a2.setState("hyderabad");
	 a2.setEmp(e);
	 
	 //setting addresses to employee
	 List<Address> addrList = Arrays.asList(a1,a2);
	 e.setAddr(addrList);
	 
	 emprepo.save(e);
	 
	 System.out.println("Data Inserted .......");
	 
	}
	public void meth2()
	{
		System.out.println("Delete operation");
		emprepo.deleteById(1);
		System.out.println("Delete Successfully");
		
	}
	public void meth3()
	{
		System.out.println("Retrive Data");
	       emprepo.findById(2);
		
		
		System.out.println("Retrived Successfully");
		
	}
}
