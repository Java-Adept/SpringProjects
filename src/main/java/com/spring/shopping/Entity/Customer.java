package com.spring.shopping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String first_name;
	private String last_anme;
	private String email;
	
	
	public Customer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_anme() {
		return last_anme;
	}
	public void setLast_anme(String last_anme) {
		this.last_anme = last_anme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_anme=" + last_anme + ", email=" + email
				+ "]";
	}
	
	
	

}
