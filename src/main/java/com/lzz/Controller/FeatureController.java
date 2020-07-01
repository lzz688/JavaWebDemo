package com.lzz.Controller;


import com.lzz.Service.InfoService;
import com.lzz.Service.impl.InfoServiceimpl;
import com.lzz.model.Gonggao;
import com.lzz.model.Holiday;
import com.lzz.model.Manager;
import com.lzz.model.worktext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FeatureController {

    @Autowired
    private InfoService infoService;

    //存储发布的新公告
    @PostMapping("/storage")
    @ResponseBody
    public String gonggao(@RequestParam(value = "data") String data){
        try {
            infoService.insertgginfo(data);
            return "新增公告成功";
        }catch (Exception e){
            return "新增公告失败";
        }

    }

    //查询历史公告
    @RequestMapping("/ggaocontent")
    @ResponseBody
    public List<Gonggao> gonggao(){
        List<Gonggao> getgginfo = infoService.getgginfo();
        return getgginfo;
    }

    //查询员工信息
    @RequestMapping("/querymanager")
    @ResponseBody
    public Map<Object, Object> managerinfo(){
        Map<Object, Object> getdata = infoService.getdata();
        return getdata;
    }

    //删除员工信息
    @PostMapping("/deletemanager")
    @ResponseBody
    public String deletemanager(@RequestParam(value = "id") String id){
        try {
            infoService.deletemanagerindo(id);
            return "删除成功";
        }catch (Exception e){
            return "删除失败";
        }
    }

    //存储新增的请假申请
    @PostMapping("/holiday")
    @ResponseBody
    public String getholidaydata(HttpServletRequest request){
        try {
            String anumber = request.getParameter("anumber");
            String bname = request.getParameter("bname");
            String stime = request.getParameter("cstime");
            String ztime = request.getParameter("detime");
            String etype = request.getParameter("etype");
            String freason = request.getParameter("freason");
            infoService.insertholiday(anumber, bname, stime, ztime, etype, freason);
            return "提交成功";
        }catch (Exception e){
            return "提交失败";
        }
    }

    //假期审批
    @PostMapping("/result")
    @ResponseBody
    public String result(HttpServletRequest request){
        try {
            String id = request.getParameter("id");
            String gresult = request.getParameter("gresult");
            String hresultreason = request.getParameter("hresultreason");
            infoService.insertresultholiday(id, gresult, hresultreason);
            return "审批成功";
        }catch (Exception e){
            return "审批失败";
        }
    }

    //查询历史请假信息
    @RequestMapping("/queryholiday")
    @ResponseBody
    public Map<Object, Object> getholiday(){
        Map<Object, Object> getdata = infoService.getholidaydata();
        return getdata;
    }

    //查询某条请假详情
    @RequestMapping("/queryholidaydata")
    @ResponseBody
    public List<Holiday> getholidaydata(@RequestParam(value = "id") String id){
        List<Holiday> queryapproveresult = infoService.queryapproveresult(id);
        return queryapproveresult;
    }

    //删除历史请假信息
    @PostMapping("/deleteholiady")
    @ResponseBody
    public String deleteholiady(@RequestParam(value = "id") String id){
        try {
            infoService.deleteholiday(id);
            return "删除成功";
        }catch (Exception e){
            return "删除失败";
        }
    }

    //存储提交的日志
    @RequestMapping("/worktextin")
    @ResponseBody
    public String worktext(HttpServletRequest request){
        try {
            String anumber = request.getParameter("anumber");
            String bname = request.getParameter("bname");
            String wancheng = request.getParameter("wancheng");
            String xietiao = request.getParameter("xietiao");
            infoService.insertworktext(anumber, bname, wancheng, xietiao);
            return "提交成功";
        }catch (Exception e){
            return "提交失败";
        }
    }

    //查询历史日志
    @RequestMapping("/queryworktext")
    @ResponseBody
    public Map<Object, Object> queryworktext(){
        Map<Object, Object> queryworktext = infoService.getworktextdata();
        return queryworktext;
    }

    //查询历史日志详情
    @RequestMapping("/queryworktextdata")
    @ResponseBody
    public List<worktext> queryworktextdata(@RequestParam(value = "id") String id){
        List<worktext> textinfo = infoService.textinfo(id);
        return textinfo;
    }

    //删除历史日志信息
    @RequestMapping("/deleteworktext")
    @ResponseBody
    public String deleteworktext(@RequestParam(value = "id") String id){
        try {
            infoService.deleteworktext(id);
            return "删除成功";
        }catch (Exception e){
            return "删除失败";
        }
    }
}
