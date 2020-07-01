package com.lzz.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class loginController {

    @RequestMapping("/register")
    public String register(HttpServletRequest request){
        System.out.println("收到了注册请求");
        String exampleInputusername2 = request.getParameter("exampleInputusername2");
        String exampleInputPassword2 = request.getParameter("exampleInputPassword2");
        String exampleInputuserage2 = request.getParameter("exampleInputuserage2");
        String sex = request.getParameter("sex");
        String exampleInputtelephone2 = request.getParameter("exampleInputtelephone2");
        String exampleInputaddress2 = request.getParameter("exampleInputaddress2");
        System.out.println(exampleInputusername2);
        return null;
    }
}
