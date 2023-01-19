package Service.impl;

import Entity.Student;
import Repository.StudentRepository;
import Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  private StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }
}
