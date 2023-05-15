package com.pactera.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.pactera.reggie.common.R;
import com.pactera.reggie.entity.Employee;
import com.pactera.reggie.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee){
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)) ;
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername,employee.getUsername());
        Employee emp = employeeService.getOne(queryWrapper);
        if(emp == null){
            return R.error("没有此账户");
        }
        if(!emp.getPassword().equals(password)){
            return R.error("密码错误");
        }
        if(emp.getStatus() == 0){
            return R.error("此用户已被封禁");
        }
        request.getSession().setAttribute("employee",emp.getId());
        return R.success(emp);
    }

    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request){
        request.getSession().removeAttribute("employee");
        return R.success("退出成功");
    }

    @PostMapping
    public R<String> save(HttpServletRequest request,@RequestBody Employee employee){
        log.info("{}",employee);

        employee.setPassword(DigestUtils.md5DigestAsHex(("123456").getBytes(StandardCharsets.UTF_8)));
        employee.setCreateTime(LocalDateTime.now());
        employee.setUpdateTime(LocalDateTime.now());
        employee.setCreateUser((Long)request.getSession().getAttribute("employee"));
        employee.setUpdateUser((Long)request.getSession().getAttribute("employee"));
        employeeService.save(employee);
        return R.success("新增员工成功");
    }
}
