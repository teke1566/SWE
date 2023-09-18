package eRegistrar.controller;


import eRegistrar.model.Student;
import eRegistrar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/eregistrar")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // Thymeleaf template name (home.html)
    }

    @GetMapping("/list")
    public String listStudents(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "list"; // Thymeleaf template name (list.html)
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add"; // Thymeleaf template name (add.html)
    }

    @PostMapping("/add")
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "redirect:/eregistrar/list";
    }

}
