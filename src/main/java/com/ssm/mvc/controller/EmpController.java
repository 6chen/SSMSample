package com.ssm.mvc.controller;

import com.ssm.mvc.model.Employee;
import com.ssm.mvc.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by YUSIN on 9/22/15.
 */
@Controller
@RequestMapping("/emplist")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping(method = RequestMethod.GET)
    public String printAllEmp(ModelMap modelMap){
        List<Employee> empList = empService.findAllEmp();
        modelMap.addAttribute("empList", empList);
        return "showemp";
    }
}
