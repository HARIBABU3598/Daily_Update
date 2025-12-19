package com.example.OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="coach")
public class CoachModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<StudentModel> getStudentList() {
		return studentList;
	}



	public void setStudentList(List<StudentModel> studentList) {
		this.studentList = studentList;
	}



	@OneToMany(mappedBy = "coach")
	private List<StudentModel> studentList;


}
