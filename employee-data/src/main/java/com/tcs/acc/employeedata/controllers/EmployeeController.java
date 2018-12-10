package com.tcs.acc.employeedata.controllers;

import com.tcs.acc.employeedata.models.Employee;
import com.tcs.acc.employeedata.repository.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@RequestMapping("/employee")
    public String employee(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee";
	}
       
	@RequestMapping("/create")
        public String create(Model model) {
            return "createemp";
        }
	
	@RequestMapping("/save")
    public String save(@RequestParam String id, @RequestParam String name, @RequestParam String bill_start_date, @RequestParam String designation,
    		@RequestParam String type, @RequestParam String location, @RequestParam String city, @RequestParam String grade,
    		@RequestParam String mobilenum, @RequestParam String won) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setBill_Start_date(bill_start_date);
        employee.setDesignation(designation);
        employee.setType(type);
        employee.setLocation(location);
        employee.setCity(city);
        employee.setGrade(grade);
        employee.setMob_Num(mobilenum);
        employee.setWON(won);
        employeeRepository.save(employee);

        return "redirect:/showemp/" + employee.getId();
    }
	
	@RequestMapping("/showemp/{id}")
    public String show(@PathVariable String id, Model model) {
        model.addAttribute("employee", employeeRepository.findById(id));
        return "showemp";
    }
	
	@RequestMapping("/delete")
    public String delete(@RequestParam String id) {
       Employee employee = employeeRepository.findById(id).orElse(null);
        employeeRepository.delete(employee);

        return "redirect:/employee";
    }
	
	@RequestMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("employee", employeeRepository.findById(id));
        return "editemp";
    }
	
	@RequestMapping("/update")
    public String update(@RequestParam String id, @RequestParam String name, @RequestParam String bill_start_date, @RequestParam String designation,
    		@RequestParam String type, @RequestParam String location, @RequestParam String city, @RequestParam String grade,
    		@RequestParam String mobilenum, @RequestParam String won) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        employee.setId(id);
        employee.setName(name);
        employee.setBill_Start_date(bill_start_date);
        employee.setDesignation(designation);
        employee.setType(type);
        employee.setLocation(location);
        employee.setCity(city);
        employee.setGrade(grade);
        employee.setMob_Num(mobilenum);
        employee.setWON(won);
        employeeRepository.save(employee);

        return "redirect:/showemp/" + employee.getId();
    }

    
}
