package com.zd.back.JY.arch.DTO;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PointDTO {
    private int pointId;
    private int maxPoint;   
    private int usedPoint;  
    private String memId;
    private String grade;
}


