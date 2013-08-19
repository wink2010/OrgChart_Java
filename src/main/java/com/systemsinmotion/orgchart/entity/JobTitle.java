package com.systemsinmotion.orgchart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table (name = "JOB_TITLE")
public class JobTitle {
	
	private int id;
	private String name;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@OneToMany (mappedBy="job_title_id")
	@Column (name = "ID", nullable = false, unique = true)
	public int getId() {
		return id;
	}
	
	@Column (name = "NAME", nullable = false, length = 50)
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
