package com.ssm.mvc.mapper;

import com.ssm.mvc.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by YUSIN on 9/22/15.
 */
@Repository
public interface EmpMapper {
    List<Employee> selectAllEmp();
}
