package com.ljm.cn.dao;

import com.ljm.cn.App;
import com.ljm.cn.domain.StudentEnt;
import com.ljm.cn.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * @author lijms
 * @date 2021/3/21/021 10:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestStuDao {

    @Autowired
    private StudentRepository studentDao;

    @Test
    public void test() {
        Optional<StudentEnt> byId = studentDao.findById(1004L);
        if (byId.isPresent()) {
            String sname = byId.get().getSname();
            System.out.println(sname);
        }

    }


}
