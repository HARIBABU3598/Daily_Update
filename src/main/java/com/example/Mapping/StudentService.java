package com.example.Mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sRepo;
	
	public void post(Student data) {
		sRepo.save(data);
	}
	
	public List<Student> get(){
		sRepo.findAll();
		return null;
	}
	public void put(Long id,Student data) {
		Student ExistingData=sRepo.findById(id).orElse(null);
		
		if(ExistingData!=null) {
			ExistingData.setSname(data.getSname());
			ExistingData.setSlevel(data.getSlevel());
			
			sRepo.save(ExistingData);
		}
	}
	
	public void delete(Long id) {
		sRepo.deleteById(id);
	}
}
