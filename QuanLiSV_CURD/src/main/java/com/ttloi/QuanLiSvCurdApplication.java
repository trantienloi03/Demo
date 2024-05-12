package com.ttloi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ttloi.entity.Student;
import com.ttloi.repository.StudentRepository;

@SpringBootApplication
public class QuanLiSvCurdApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(QuanLiSvCurdApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student st1 = new Student("Tran Le","Thu", "thu@gmail.com");
//		Student st2 = new Student("Tran Xuan","Thanh", "thanh@gmail.com");
//		Student st3 = new Student("Tran Tien","Loi", "loi@gmail.com");
//		studentRepository.save(st1);
//		studentRepository.save(st2);
//		studentRepository.save(st3);
	}
	

}

