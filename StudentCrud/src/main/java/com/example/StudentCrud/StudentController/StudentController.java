package com.example.StudentCrud.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.StudentCrud.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("/index")
	public String viewForm(Model model) {
		model.addAttribute("student", new Student());
		return "index";
	}
	@PostMapping("/result")
	public String viewForm(@ModelAttribute Student student,BindingResult result,Model model)
	{
		model.addAttribute("student", student);
		return "result";
	}

}
