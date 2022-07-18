package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="schlorship")
public class Schlorship implements Serializable {
	@Id
	@Column(name="schlorship_id")
	private Long schlorshipId;
	@Column(name="schlorship_name")
	private String schlorshipName;
	
	@OneToOne(mappedBy = "schlorship")
	private Student student;

	public Long getSchlorshipId() {
		return schlorshipId;
	}

	public void setSchlorshipId(Long schlorshipId) {
		this.schlorshipId = schlorshipId;
	}

	public String getSchlorshipName() {
		return schlorshipName;
	}

	public void setSchlorshipName(String schlorshipName) {
		this.schlorshipName = schlorshipName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Schlorship [schlorshipId=" + schlorshipId + ", schlorshipName=" + schlorshipName + "]";
	}
	

}

