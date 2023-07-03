package com.register.student.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.register.student.entity.Student;
import com.register.student.service.StudentService;
import com.register.student.util.MappingConstants;

@RestController
@RequestMapping(value=MappingConstants.student)
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@Autowired
	ObjectMapper mapper;
	
	//method to register the student.
	@PostMapping(value=MappingConstants.save)
	public Student registerStudent(@RequestParam("file") MultipartFile file,
			@RequestParam("studentDetails") String studentDetails) throws IOException {
		//used the @RequestParam and get the student deatails as string,then converted the string into object using ObjectMapper. 
		
		//Converting string into object
		Student student=mapper.readValue(studentDetails, Student.class);
		return studentService.registerStudent(file, student);
	}
}
