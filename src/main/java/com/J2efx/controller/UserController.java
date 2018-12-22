package com.J2efx.controller;

import com.J2efx.models.User;
import com.J2efx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class UserController {
    @Resource
    UserService userService;
    @RequestMapping("/test")
    public String test(Model model){
        List<User> list = userService.getAllUsers();
        model.addAttribute("list",list);
        return "test";
    }
}
