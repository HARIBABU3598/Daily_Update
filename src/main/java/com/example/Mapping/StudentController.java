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
public class StudentController {

		@Autowired
		private StudentService sService;
		
		@PostMapping("/postStudent")
		public String post(@RequestBody Student data) {
			sService.post(data);
			return "Posted Successfully";
		}
		
		@GetMapping("/getStudent")
		public List<Student> get(){
			return sService.get();
		}
		
		@PutMapping("/putStudent/{id}")
		public String put(@PathVariable Long id,@RequestBody Student data) {
			sService.put(id, data);
			return "Updated Successfully";
		}
		
		@DeleteMapping("/deleteStudent/{id}")
		public String delete(@PathVariable Long id) {
			sService.delete(id);
			return "Deleted Successfully";
		}
}
