package com.ljm.cn.service.impl;

import com.ljm.cn.domain.StudentEnt;
import com.ljm.cn.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    //Qualifier可以用来做限定符使用，就是一个接口的多个实现类，选择其中的那个实现类
//    @Qualifier("studentRepository")
    @Autowired(required = false)
    StudentRepository studentDao;

    public void saveStudent(List<String> list) {
        List<StudentEnt> all = studentDao.findByCid(list);
        for (StudentEnt stu : all) {
            System.out.println(stu.getSname());
        }
    }

    /**
     * 根据学生id查询学生姓名
     * @param sid
     * @return
     */
    public String getNameBySid(long sid) {
        Optional<StudentEnt> student = studentDao.findById(sid);
        if (student.isPresent()) {
            return student.get().getSname();
        } else {
            return null;
        }
    }

}
