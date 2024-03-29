package com.gdu.mybatisexample.dao;

import com.gdu.mybatisexample.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    int insertStudent(StudentDto student);
    int updateStudent(StudentDto student);
    int deleteStudent(StudentDto student);
    int getStudentByAve(double begin, double end);
    List<StudentDto> getAllStudentList(Map<String,Object> params);


}
