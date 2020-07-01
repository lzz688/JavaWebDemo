package com.lzz.model;


public class Manager {
    private String id;
    private String anumber;
    private String bname;
    private String cpart;
    private String dsex;
    private String eprovince;
    private String fcity;
    private String gtelephone;
    private String hpersonnumber;
    private String itime;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAnumber() {
        return anumber;
    }
    public void setAnumber(String anumber) {
        this.anumber = anumber;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public String getCpart() {
        return cpart;
    }
    public void setCpart(String cpart) {
        this.cpart = cpart;
    }
    public String getDsex() {
        return dsex;
    }
    public void setDsex(String dsex) {
        this.dsex = dsex;
    }
    public String getEprovince() {
        return eprovince;
    }
    public void setEprovince(String eprovince) {
        this.eprovince = eprovince;
    }
    public String getFcity() {
        return fcity;
    }
    public void setFcity(String fcity) {
        this.fcity = fcity;
    }
    public String getGtelephone() {
        return gtelephone;
    }
    public void setGtelephone(String gtelephone) {
        this.gtelephone = gtelephone;
    }
    public String getHpersonnumber() {
        return hpersonnumber;
    }
    public void setHpersonnumber(String hpersonnumber) {
        this.hpersonnumber = hpersonnumber;
    }
    public String getItime() {
        return itime;
    }
    public void setItime(String itime) {
        this.itime = itime;
    }
    public Manager(String id, String anumber, String bname, String cpart, String dsex, String eprovince, String fcity, String gtelephone, String hpersonnumber, String itime) {
        this.id = id;
        this.anumber = anumber;
        this.bname = bname;
        this.cpart = cpart;
        this.dsex = dsex;
        this.eprovince = eprovince;
        this.fcity = fcity;
        this.gtelephone = gtelephone;
        this.hpersonnumber = hpersonnumber;
        this.itime = itime;
    }
    public Manager() {
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", anumber='" + anumber + '\'' +
                ", bname='" + bname + '\'' +
                ", cpart='" + cpart + '\'' +
                ", dsex='" + dsex + '\'' +
                ", eprovince='" + eprovince + '\'' +
                ", fcity='" + fcity + '\'' +
                ", gtelephone='" + gtelephone + '\'' +
                ", hpersonnumber='" + hpersonnumber + '\'' +
                ", itime='" + itime + '\'' +
                '}';
    }
}
