package com.lzz.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Holiday {
    private String id;
    private String anumber;
    private String bname;
    private String cstime;
    private String detime;
    private String etype;
    private String gresult;
    private String freason;

}
