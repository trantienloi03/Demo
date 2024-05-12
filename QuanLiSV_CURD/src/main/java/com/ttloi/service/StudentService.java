package com.ttloi.service;

import java.util.List;

import com.ttloi.entity.Student;

public interface StudentService {
	public List<Student> selectAll();
	public Student saveStudent(Student student);
	public Student getStudentById(Long id);
	public Student updateStudent(Student st);
	public void deleteStudentByid(Long id);
}
