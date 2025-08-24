package com.abhayit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhayit.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
