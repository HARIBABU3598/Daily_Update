package com.example.OneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachService {
	
	@Autowired
	private CoachRepo repo;
	@Autowired
	private StudentRepo repos;
	
	public List<CoachModel> get(){
		return repo.findAll();
	}
	
	public CoachModel post(CoachModel data) {
		return repo.save(data);
	}
	
	
	public CoachModel put(Long id,CoachModel data) {
		CoachModel existing=repo.findById(id).orElse(null);
		
		if(existing!=null) {
			existing.setName(data.getName());
			repo.save(existing);
		}
		return null;
	}
	
	public CoachModel delete(Long id) {
		repo.deleteById(id);
		return null;
	}
	public List<StudentModel> getStudent(){
		return repos.findAll();
	}
	
	public void postStudent(StudentModel data) {
		repos.save(data);
	}
	
	public StudentModel putStudent(Long id,StudentModel data) {
		StudentModel existing=repos.findById(id).orElse(null);
		if(existing!=null) {
			existing.setName(data.getName());
			repos.save(existing);
		}
		return null;
	}
	public void deleteStudent(Long id) {
		repos.deleteById(id);
	}
	
	public List<StudentModel> getStudentsByCoachId(Long coachId) {
        CoachModel coach = repo.findById(coachId)
                .orElseThrow(() -> new RuntimeException("Coach not found with id: " + coachId));
        return coach.getStudentList();
    }
	
}
