package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String patName;
	private String dateTime;
	private String duration;

	public Long id() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String patName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String dateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String duration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}