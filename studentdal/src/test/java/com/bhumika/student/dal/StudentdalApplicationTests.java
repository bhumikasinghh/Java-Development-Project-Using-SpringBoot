package com.bhumika.student.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import com.bhumika.student.dal.entities.Student;
import com.bhumika.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent()
	{
		Student student=new Student();
		student.setName("john");
		student.setCourse("Java Web Course");
		student.setFee(30d);
		studentRepository.save(student);	
	}

	@Test
	public void testfindStudentById()
	{
		Student student=studentRepository.findById(3l).get();
		System.out.println(student);
		
		
	}
	@Test
	public void testUpdateStudent()
	{
	Student student=studentRepository.findById(3l).get();
		student.setFee(40d);
		System.out.println(student);
		studentRepository.save(student);
		
	}
	@Test
	public void testDeleteStudent()
	{
		studentRepository.deleteById(1l);
		studentRepository.deleteById(2l);
		
	}
	
}
