package com.example.Mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachService {
	
	@Autowired
	private CoachRepository cRepo;

	public Coach post(Coach data) {
		
		return cRepo.save(data);
	}

	public List<Coach> get() {
		
		return cRepo.findAll();
	}

	public Coach put(Long id, Coach data) {
		
		Coach ExistingData=cRepo.findById(id).orElse(null);
		
		if(ExistingData!=null) {
			ExistingData.setName(data.getName());
			ExistingData.setClubName(data.getClubName());
			
			cRepo.save(ExistingData);
		}
		return null;
	}

	public void delete(Long id) {
		
		cRepo.deleteById(id);
	}
	
	public Student getStudent(Long id){
		Coach coach=cRepo.findById(id).orElse(null);
		if(coach!=null) {
			return coach.getStudent();
		}
		return null;
	}

}
