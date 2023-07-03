package com.register.student.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	
	private String studentName;
	
	private String emailId;
	
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Image image;

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, String emailId, String address, Image image) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
		this.address = address;
		this.image = image;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", emailId=" + emailId
				+ ", address=" + address + ", image=" + image + "]";
	}
	
	
}
