package Controller;

import Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

  private StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  // method to list students and return model and view
  @GetMapping("/students")
  public String listStudents(Model model) {
    model.addAttribute("students", studentService.getAllStudents());
    return "students";
  }

}
