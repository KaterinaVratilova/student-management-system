package com.example.studentmanagementsystem;

import Entity.Student;
import Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(StudentManagementSystemApplication.class, args);
  }


  private StudentRepository studentRepository;

  @Override
  public void run(String... args) throws Exception {

    /*Student student1 = new Student("Katerina", "Vratilova", "katka@email.cz");
    studentRepository.save(student1);

    Student student2 = new Student("Katka", "Nováková", "novak@gmail.cz");
    studentRepository.save(student2);

    Student student3 = new Student("Petra", "Horáková", "petra@gmail.cz");
    studentRepository.save(student3);*/

  }
}
