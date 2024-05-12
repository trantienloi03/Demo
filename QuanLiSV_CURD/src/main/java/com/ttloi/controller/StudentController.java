package com.ttloi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ttloi.entity.Student;
import com.ttloi.service.StudentService;



@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.selectAll());
		return"students";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		//tao sinnh vien
		Student st = new Student();
		model.addAttribute("student", st);
		return"create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student st) {
		studentService.saveStudent(st);
		return"redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return"edit_student";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student st, Model model) {
		
		// gán lại data cho sinh viên có id trùng với st trong model
		Student existing =studentService.getStudentById(id);
		existing.setId(id);
		existing.setFirstName(st.getFirstName());
		existing.setLastName(st.getLastName());
		existing.setEmail(st.getEmail());
		
		studentService.updateStudent(existing);
		return"redirect:/students";
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentByid(id);
		return"redirect:/students";
	}

}
