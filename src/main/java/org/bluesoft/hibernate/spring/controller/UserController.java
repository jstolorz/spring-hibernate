package org.bluesoft.hibernate.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/deptform.html")
    public String initForm(){
        return "dept_form";
    }
}
