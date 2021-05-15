package com.ljm.cn;

import com.ljm.cn.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
//@ServletComponentScan
@SpringBootApplication
//@Import(DatabaseRegister.class)
//@ComponentScan
public class App {
    public static void main( String[] args ) {
        //开启Spring的配置，加载整个数据
//        SpringApplication application = new SpringApplication(App.class);
//        application.run(args);

        //获得SpringBoot的容器
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();

        for(String name:beanDefinitionNames){
            System.out.println(name);
        }

//
        Person bean = run.getBean(Person.class);


    }
}
