package com.lzz.Dao;

import com.lzz.model.Gonggao;
import com.lzz.model.Holiday;
import com.lzz.model.Manager;
import com.lzz.model.worktext;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoMapper {
    //查询历史公告
    List<Gonggao> getgginfo();
    //存储新发布的公告
    void insertinfo(@Param("info") String content);
    //查询员工信息
    List<Manager> getmanagerinfo();
    //插入新员工信息
    void insertmanagerinfo(@Param("number") String anumbider, @Param("name") String bname, @Param("part") String cpart, @Param("sex") String dsex, @Param("province") String eprovince, @Param("city") String fcity, @Param("telephone") String gtelephone, @Param("personnumber") String hpersonnumber);
    //删除员工
    void deletemanagerindo(@Param("number") String anumber);
    //查询单一员工的信息
    List<Manager> getSimplemanagerinfo(String id);
    //更新员工信息
    void updatemanagerinfo(@Param("id") String id, @Param("number") String anumbider, @Param("name") String bname, @Param("part") String cpart, @Param("sex") String dsex, @Param("province") String eprovince, @Param("city") String fcity, @Param("telephone") String gtelephone, @Param("personnumber") String hpersonnumber);
    //新增请假信息
    void insertholiday(@Param("number") String anumber, @Param("name") String bname, @Param("stime") String stime, @Param("ztime") String ztime, @Param("type") String type, @Param("reason") String reason);
    //查询历史请假信息
    List<Holiday> queryholiday();
    //假期审批
    void insertresultholiday(@Param("id") String id, @Param("result") String result, @Param("resultreason") String resultreason);
    //审批结果查询
    List<Holiday> queryapproveresult(@Param("id") String id);
    //新增日志
    void insertworktext(@Param("number") String anumber, @Param("name") String name, @Param("wanchengwork") String wancheng, @Param("xietiaowork") String xietiao);
    //查询历史日志
    List<worktext> queryworktext();
    //查询日志详细信息
    List<worktext> textinfo(@Param("id") String id);
    //删除历史工作日志
    void deleteworktext(@Param("id") String id);
    //删除历史请假信息
    void deleteholiday(@Param("id") String id);
}
