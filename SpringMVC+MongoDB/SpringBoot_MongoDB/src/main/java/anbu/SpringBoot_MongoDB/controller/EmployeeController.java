package anbu.SpringBoot_MongoDB.controller;

import anbu.SpringBoot_MongoDB.model.Employee;
import anbu.SpringBoot_MongoDB.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    // Landing page to show form
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "index";
    }

    // Submit form
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        repository.save(employee);
        return "redirect:/displayAll";
    }
    // Display all employees
    @GetMapping("/displayAll")
    @ResponseBody
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Display employee by ID
    @GetMapping("/display/{id}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable String id) {
        Optional<Employee> employee = repository.findById(id);
        return employee.orElse(null);
    }
}