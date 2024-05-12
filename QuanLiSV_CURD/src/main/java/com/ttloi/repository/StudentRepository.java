package com.ttloi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ttloi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
