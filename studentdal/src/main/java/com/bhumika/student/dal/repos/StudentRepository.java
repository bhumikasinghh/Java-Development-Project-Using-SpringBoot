package com.bhumika.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.bhumika.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
