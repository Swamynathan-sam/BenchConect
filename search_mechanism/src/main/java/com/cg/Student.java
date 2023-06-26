package com.cg;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import javax.persistence.Id;
import javax.persistance.GeneratedValue;
import javax.persistance.GenerationType;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rollNo")
	private int rollNo;
	@Column(name = "name")
	private String name;
	@Column(name = "subjects")
	private int subjects;
	@Column(name = "scores")
	private int scores;
	@Column(name = "totalPercentage")
	private int totalPercentage;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubjects() {
		return subjects;
	}
	public void setSubjects(int subjects) {
		this.subjects = subjects;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public int getTotalPercentage() {
		return totalPercentage;
	}
	public void setTotalPercentage(int totalPercentage) {
		this.totalPercentage = totalPercentage;
	}
	
	public Student() {
		
	}
}
