	package com.example.Mapping;
	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
	@Entity
	@Table(name="Student")
	public class Student {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		private String Sname;
		private String Slevel;
		
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id=id;
		}
		
		public String getSname() {
			return Sname;
		}
		
		public void setSname(String Sname) {
			this.Sname=Sname;
		}
		
		public String getSlevel() {
			return Slevel;
		}
		
		public void setSlevel(String Slevel) {
			this.Slevel=Slevel;
		}
	}
