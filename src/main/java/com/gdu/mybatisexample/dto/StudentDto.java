package com.gdu.mybatisexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDto {
    private int studentNo;
    private String name;
    private double kor;
    private double eng;
    private double math;
    private double ave;
    private String mark;
}
