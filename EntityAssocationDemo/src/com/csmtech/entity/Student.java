package com.csmtech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="student")
public class Student implements Serializable {
	@Id
	@Column(name="roll_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long rollNo;
	@Column(name="student_name")
private String name;
	@Column(name="email")
private String email;
	@Column(name="doa")
private Date doa;
	@Column(name="branch_id")
private Long branchId;
	
	@OneToOne
	@JoinColumn(name="schlorship_id")
private Schlorship schlorship;

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDoa() {
		return doa;
	}

	public void setDoa(Date doa) {
		this.doa = doa;
	}

	public Long getBranchId() {
		return branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public Schlorship getSchlorship() {
		return schlorship;
	}

	public void setSchlorship(Schlorship schlorship) {
		this.schlorship = schlorship;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", doa=" + doa + ", branchId="
				+ branchId + ", schlorship=" + schlorship + "]";
	}

	
	 

}
