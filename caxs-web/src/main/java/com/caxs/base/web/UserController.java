package com.caxs.base.web;


import com.caxs.base.domain.User;
import com.caxs.base.service.IUserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2018/8/2.
 */
@Controller
@RequestMapping("/user")
@Scope("prototype")
public class UserController {
   @Autowired
    IUserService userService;

    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request){
        boolean loginType = userService.getUser(user.getUserName(),user.getPassWord());
                if(loginType){
                    request.setAttribute("user",user);
                    return "success";
                }else {
                    request.setAttribute("message","用户名密码错误");
                    return "error";
                }
    }
}
