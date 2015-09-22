package com.ssm.mvc.service;

import com.ssm.mvc.mapper.EmpMapper;
import com.ssm.mvc.model.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by YUSIN on 9/22/15.
 */
@Service
public class EmpService {

    @Resource
    private EmpMapper empMapper;

    public List<Employee> findAllEmp(){

        List<Employee> employeeList = empMapper.selectAllEmp();

        for(Employee employee : employeeList){
            System.out.println(employee);
        }

        return employeeList;
    }
}
