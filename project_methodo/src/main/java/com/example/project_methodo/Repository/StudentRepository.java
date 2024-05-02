package com.example.project_methodo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project_methodo.Entities.Student;;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    public Student[] getAllStudents();
    public Student getOneStudentByName(String name);
    public Student createStudent(Student newStudent);
    public Student deleteStudent(Integer studentId);
    public Student updateStudent(Integer studentId);
}
