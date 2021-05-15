package com.ljm.cn.service.impl;

import com.ljm.cn.demo.CostTimeInvocationHandler;
import com.ljm.cn.service.IUserService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

/**
 * @author lijms
 * @date 2021/2/28/028 21:16
 */
public class UserService implements IUserService {
    @Override
    public void insert(String name) {
        System.out.println(String.format("用户[name:%s]插入成功!", name));
    }

    public static void main(String[] args) {
        IUserService userService = CostTimeInvocationHandler.createProxy(new UserService(), IUserService.class);
        userService.insert("路人甲Java");

        //获取注解信息，Class对象也有很多的实用方法
        Class<CostTimeInvocationHandler> classInfo = CostTimeInvocationHandler.class;
//        Annotation[] annotations = CostTimeInvocationHandler.class.getAnnotations();
//        classInfo.getTypeParameters()

        BeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(UserService.class).getBeanDefinition();

    }
}
