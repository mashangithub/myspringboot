package com.ljm.cn.controller;

import com.ljm.cn.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijms
 * @date 2021/2/27/027 9:05
 */
@RestController
public class BaseController {

    @Autowired
    StudentService studentService;

    /**
     * 根据学号查询学生信息
     * @param sid 学号
     * @return
     */
    @RequestMapping(value = "/api/getStuInfo", method = RequestMethod.GET)
    public String getStuInfo(String sid) {
        return studentService.getNameBySid(Long.valueOf(sid));
    }

}
