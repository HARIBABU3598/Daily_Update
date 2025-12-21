package com.example.OneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coach")
public class CoachController {
	
	@Autowired
	private CoachService service;
	
	@GetMapping("/get")
	public List<CoachModel> get(){
		return service.get();

	}
	@PostMapping("/post")
	public void post(@RequestBody CoachModel data) {
		service.post(data);
	}
	@PutMapping("/put/{id}")
	public void put(@PathVariable Long id,@RequestBody CoachModel data) {
		service.put(id, data);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
	@GetMapping("/getStudent")
	public List<StudentModel> getStudent(){
		return service.getStudent();
	}
	
	@PostMapping("/postStudent")
	public String postStudent(@RequestBody StudentModel data) {
		service.postStudent(data);
		return "Posted Successfully";
	}
	
	@PutMapping("/putStudent/{id}")
	public String putStudent(@PathVariable Long id,@RequestBody StudentModel data) {
		service.putStudent(id, data);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "Delete Successfully";
	}
	
	
	@GetMapping("/students/{id}")
    public List<StudentModel> getStudentsByCoach(@PathVariable Long id) {
        return service.getStudentsByCoachId(id);
    }
}
	
	
