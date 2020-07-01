package com.lzz.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/Ditu")
    public String Ditu(){
        return "Ditu";
    }

    @RequestMapping("/Leavepage")
    public String Leavepage(){
        return "/Leave/Leavepage";
    }

    @RequestMapping("/worktext")
    public String worktext(){
        return "/worktext/worktext";
    }

    @RequestMapping("/History")
    public String History(){
        return "/announce/History";
    }

    @RequestMapping("/managerinfo")
    public String managerinfo(){
        return "/manager/managerinfo";
    }

    @RequestMapping("/Leavemanage")
    public String Leavemanage(){
        return "/Leave/Leavemanage";
    }

    @RequestMapping("/worktextmanager")
    public String worktextmanager(){
        return "/worktext/worktextmanager";
    }

    @RequestMapping("/announcement")
    public String announcement(){
        return "/announce/announcement";
    }

    @RequestMapping("/holidayApprove")
    public String holidayApprove(){
        return "/Leave/holidayApprove";
    }

    @RequestMapping("/ApproveInfo")
    public String ApproveInfo(){
        return "/Leave/ApproveInfo";
    }

    @RequestMapping("/worktextinfo")
    public String worktextinfo(){
        return "/worktext/worktextinfo";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
