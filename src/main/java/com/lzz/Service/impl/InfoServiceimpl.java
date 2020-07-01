package com.lzz.Service.impl;

import com.lzz.Dao.InfoMapper;
import com.lzz.Service.InfoService;
import com.lzz.model.Gonggao;
import com.lzz.model.Holiday;
import com.lzz.model.Manager;
import com.lzz.model.worktext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class InfoServiceimpl implements InfoService {

    @Autowired
    InfoMapper infoMapper;

    //查询历史公告
    public List<Gonggao> getgginfo() {
        return infoMapper.getgginfo();
    }

    //插入新公告
    public void insertgginfo(String content) {
        infoMapper.insertinfo(content);
    }

    //查询员工信息
    public List<Manager> getmanagerinfo() {
        List<Manager> managerinfo = infoMapper.getmanagerinfo();
        return managerinfo;
    }

    //拼接表格数据格式
    public Map<Object,Object> getdata() {
        Map<Object,Object> map = new LinkedHashMap<Object, Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",180);
        List<Manager> getmanagerinfo = getmanagerinfo();
        map.put("data",getmanagerinfo);
        List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
        list.add(map);
        return map;
    }

    //插入新员工
    public void insertmanagerinfo(String anumber, String bname, String cpart, String dsex, String eprovince, String fcity, String gtelephone, String hpersonnumber) {
        infoMapper.insertmanagerinfo(anumber,bname,cpart,dsex,eprovince,fcity,gtelephone,hpersonnumber);
    }

    //删除员工信息
    public void deletemanagerindo(String anumber) {
        infoMapper.deletemanagerindo(anumber);
    }

    public List<Manager> getSimplemanagerinfo(String id) {
        List<Manager> simplemanagerinfo = infoMapper.getSimplemanagerinfo(id);
        return simplemanagerinfo;
    }

    //更新员工信息
    public void updatemanagerinfo(String id, String anumbider, String bname, String cpart, String dsex, String eprovince, String fcity, String gtelephone, String hpersonnumber) {
        infoMapper.updatemanagerinfo(id,anumbider,bname,cpart,dsex,eprovince,fcity,gtelephone,hpersonnumber);
    }

    //新增请假信息
    public void insertholiday(String anumber, String bname, String stime, String ztime,String type,String reason) {
        infoMapper.insertholiday(anumber,bname,stime,ztime,type,reason);
    }

    //查询历史请假信息
    public List<Holiday> queryholiday() {
        List<Holiday> queryholiday = infoMapper.queryholiday();
        return queryholiday;
    }

    //请假信息格式
    public Map<Object,Object> getholidaydata() {
        Map<Object,Object> map = new LinkedHashMap<Object, Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",180);
        List<Holiday> queryholiday = queryholiday();
        map.put("data",queryholiday);
        List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
        list.add(map);
        return map;
    }

    public void insertresultholiday(String id, String result, String resultreason) {
        infoMapper.insertresultholiday(id,result,resultreason);
    }

    public List<Holiday> queryapproveresult(String id) {
        List<Holiday> queryapproveresult = infoMapper.queryapproveresult(id);
        return queryapproveresult;
    }

    public void insertworktext(String anumber, String name, String wancheng, String xietiao) {
        infoMapper.insertworktext(anumber,name,wancheng,xietiao);
    }

    public List<worktext> queryworktext() {
        List<worktext> queryworktext = infoMapper.queryworktext();
        return queryworktext;
    }

    //日志信息格式
    public Map<Object,Object> getworktextdata() {
        Map<Object,Object> map = new LinkedHashMap<Object, Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",180);
        List<worktext> queryworktext = queryworktext();
        map.put("data",queryworktext);
        List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
        list.add(map);
        return map;
    }

    public List<worktext> textinfo(String id) {
        List<worktext> textinfo = infoMapper.textinfo(id);
        return textinfo;

    }

    public void deleteworktext(String id) {
        infoMapper.deleteworktext(id);
    }

    public void deleteholiday(String id) {
        infoMapper.deleteholiday(id);
    }

}
