package com.systemsinmotion.orgchart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Creates an Entity (Table) for Job Title
@Entity
@Table(name = "JOB_TITLE")
public class JobTitle implements java.io.Serializable {
	
	// Serialization Seems Broken
	// Declare variables for Job Title Table
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	
	// Getters and Setters:
	
	// ID Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	// NAME Column
	@Column(name = "NAME", length = 50, nullable = false)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
