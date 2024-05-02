package com.example.project_methodo.Entities;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(length = 64, unique = true, nullable = false)
    private String name;
     
    private Integer age;
     
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
 
    public Student() {
    }
 
    // getters and setters are not shown for brevity...
 
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setage(Integer age) {
		this.age = age;
	} 
}    