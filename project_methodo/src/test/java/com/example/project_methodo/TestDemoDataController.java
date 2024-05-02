package com.example.project_methodo;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.project_methodo.Entities.Student;
import com.example.project_methodo.Repository.StudentRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TestDemoDataController {
    @Autowired
    private StudentRepository studentRepo;

    @Test
    @Order(2)
    public void testGetOneStudent() {
        Student student = studentRepo.getOneStudentByName("Kévin");    // findByName 
        assertThat(student.getName()).isEqualTo("Kévin");
    }

    @Test
    @Order(1)
    public void testCreateStudent() {
        Student student = studentRepo.save(new Student("Kévin", 21));
        assertThat(student.getId()).isGreaterThan(0);
    }

    @Test
    @Order(5)
    public void testDeleteStudent() {
        // TODO 
        Student student = studentRepo.deleteStudent(1);
        assertThat(student);
    }

    @Test
    @Order(3)
    public void testGetStudents() {
        Student[] students = studentRepo.getAllStudents();    // findByName 
        assertThat(students.length).isGreaterThan(0);
    }

    @Test
    @Order(4)
    // TODO
    public void testUpdateStudent() {

    }

}
