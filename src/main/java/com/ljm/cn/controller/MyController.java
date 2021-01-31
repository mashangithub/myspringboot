package com.ljm.cn.controller;

import com.alibaba.fastjson.JSONObject;
import com.ljm.cn.model.Student;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//@ControllerAdvice
@RestController
@RequestMapping("/my")
public class MyController {


    @GetMapping("/get1")
    public String getData(@RequestParam(name = "id",required = false) String id){

        if(StringUtils.isEmpty(id)){
//            throw new RuntimeException("id is NULL");
        }

        String info = "你好，收到信息，id:"+id;

        return info;

    }

    //用户登录成功获取到cookie信息，再访问其他接口获取到列表
    @RequestMapping(value="/login", method = RequestMethod.POST)
    @ApiOperation(value="登录接口, 成功后获取cookies信息", httpMethod = "POST")
    public String login(@RequestBody Student stu){

//        return stu.getName()+"---"+stu.getId();
        return "**********";

    }

    @RequestMapping(value = "/demo",method = RequestMethod.POST)
    public String demo(HttpServletRequest req){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
            StringBuffer sb=new StringBuffer();
            String s=null;
            while((s=br.readLine())!=null){
                sb.append(s);
            }
            JSONObject jsonObject = JSONObject.parseObject(sb.toString());
            String name = jsonObject.getString("name");
            String age = jsonObject.getString("age");
            System.out.println("name:"+name+" age:"+age);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "server response";
    }

    @RequestMapping(value = "/demo1",method = RequestMethod.POST)
    public HttpServletResponse demo1(HttpServletRequest req,HttpServletResponse resp){

//        req.setCharacterEncoding("");
//        req.getContextPath()

        //这个就是获得数组值
        String[] parameterValues = req.getParameterValues("");


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(req.getInputStream()));
            StringBuffer sb=new StringBuffer();
            String s=null;
            while((s=br.readLine())!=null){
                sb.append(s);
            }
            JSONObject jsonObject = JSONObject.parseObject(sb.toString());
            String name = jsonObject.getString("name");
            String age = jsonObject.getString("age");
            System.out.println("name:"+name+" age:"+age);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //一切都是封装，万变不离其踪
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();


        return response;
    }

}
