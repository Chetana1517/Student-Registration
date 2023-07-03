package com.register.student.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.register.student.entity.Image;
import com.register.student.entity.Student;
import com.register.student.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	//method to save the student record into database.
	public Student registerStudent(MultipartFile file,Student student) throws IOException {
		String fileName=file.getOriginalFilename();
		String fileType=file.getContentType();
		byte[] imageDetails=file.getBytes();
		
		Image image=new Image(fileName,fileType,imageDetails);
		student.setImage(image);
		
		return studentRepository.save(student);
	}
}
