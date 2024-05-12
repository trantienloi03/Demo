package com.ttloi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ttloi.entity.Student;
import com.ttloi.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		List<Student> lst = studentRepository.findAll();
		return lst;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student st) {
		// TODO Auto-generated method stub
		return studentRepository.save(st);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentByid(Long id) {
		studentRepository.deleteById(id);
		
	}

}
