package com.campus.service;

import com.campus.dto.EmployeeDTO;
import com.campus.dto.EmployeeLoginDTO;
import com.campus.dto.EmployeePageQueryDTO;
import com.campus.entity.Employee;
import com.campus.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    boolean save(EmployeeDTO employeeDTO);

    PageResult<Employee> listEmployee(EmployeePageQueryDTO employeePageQueryDTO);

    void changeEmployeeStatus(Integer status, Long id);


    Employee getEmployeeById(Long id);

    void updateEmployee(EmployeeDTO employeeDTO);
}
