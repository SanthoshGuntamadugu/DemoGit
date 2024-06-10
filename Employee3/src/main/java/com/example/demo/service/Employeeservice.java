package com.example.demo.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.Employeerepository;

@Service
public class Employeeservice 
{
	@Autowired
	private Employeerepository employeeRepository;
	
	public EmployeeEntity saveEmployee(String name, String address, int pincode,Long mobileNumber,MultipartFile file)throws IOException{
		EmployeeEntity emp=new EmployeeEntity();
		emp.setName(name);
		emp.setAddress(address);
		emp.setPincode(pincode);
		emp.setMobilenumber(mobileNumber);
		emp.setPdfDocument(file.getBytes());
		return employeeRepository.save(emp);
	}

}
