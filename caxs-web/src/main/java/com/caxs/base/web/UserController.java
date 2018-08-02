package com.caxs.base.web;


import com.caxs.base.domain.SUsr;
import com.caxs.base.service.ISUsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lenovo on 2018/8/2.
 */
@Controller
@RequestMapping("/base/static")
public class UserController {
   @Autowired
   ISUsrService userService;

    @RequestMapping("/login")
    public String login(SUsr user, HttpServletRequest request){
        boolean loginType = userService.getUser(user.getUsrName(),user.getUsrPassword());
                if(loginType){
                    request.setAttribute("user",user);
                    return "success";
                }else {
                    request.setAttribute("message","用户名密码错误");
                    return "error";
                }
    }
}
