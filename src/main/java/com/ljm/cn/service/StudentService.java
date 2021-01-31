package com.ljm.cn.service;

import com.ljm.cn.domain.StudentEnt;
import com.ljm.cn.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentDao;

    public void saveStudent(List<String> list){

        List<StudentEnt> all = studentDao.findByCid(list);

        for(StudentEnt stu:all){
            System.out.println(stu.getSname());
        }



    }


}
