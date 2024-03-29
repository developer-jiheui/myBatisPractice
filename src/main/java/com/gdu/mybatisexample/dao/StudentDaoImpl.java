package com.gdu.mybatisexample.dao;

import com.gdu.mybatisexample.dto.StudentDto;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class StudentDaoImpl implements StudentDao{

    private SqlSessionFactory factory = null;
    private static StudentDao studentDao = new StudentDaoImpl();

    @Override
    public int insertStudent(StudentDto student) {
        try{
            String resource = "com/gdu/mybatisexample/mybatis-config.xml";
            InputStream in = Resources.getResourceAsStream(resource);
            factory = new SqlSessionFactoryBuilder().build(in);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateStudent(StudentDto student) {
        return 0;
    }

    @Override
    public int deleteStudent(StudentDto student) {
        return 0;
    }

    @Override
    public int getStudentByAve(double begin, double end) {
        return 0;
    }

    @Override
    public List<StudentDto> getAllStudentList(Map<String, Object> params) {
        return null;
    }
}
