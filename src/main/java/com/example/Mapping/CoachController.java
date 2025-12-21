package com.example.Mapping;

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
@RequestMapping("/api")
public class CoachController {
	
	@Autowired
	private CoachService cService;
	
	@PostMapping("/postCoach")
	public Coach post(@RequestBody Coach data) {
		return cService.post(data);
	}
	
	@GetMapping("/getCoach")
	public List<Coach> get(){
		return cService.get();
	}
	
	@PutMapping("/putCoach/{id}")
		public Coach put(@PathVariable Long id,@RequestBody Coach data) {
			return cService.put(id,data);
		}
	
	@DeleteMapping("/deleteCoach/{id}")
	public void delete(@PathVariable Long id) {
		cService.delete(id);
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudent(@PathVariable Long id) {
		return cService.getStudent(id);
	}
}
