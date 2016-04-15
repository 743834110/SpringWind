package com.baomidou.springwind.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.springwind.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * �û�������ز���
 * </p>
 *
 *
 * @Author Jack
 * @Date 2016/4/15 15:03
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/toUserPage")
    public String toUserPage(Model model){
        return "/user/user";
    }

    @RequestMapping("/getUserList")
    public Page getUserList(HttpServletRequest request, HttpServletResponse response){

        return null;
    }


}
