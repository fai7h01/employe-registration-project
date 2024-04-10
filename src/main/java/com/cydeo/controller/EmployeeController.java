package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model){

        model.addAttribute("employee",new Employee());
        model.addAttribute("stateList", DataGenerator.getAllStates());

        return "/employee/employee-create";
    }

    @PostMapping("/insert")
    public String employee(@ModelAttribute("employee") Employee employee){



        return "redirect:/employee/register";
    }

}
