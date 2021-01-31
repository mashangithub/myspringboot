package com.ljm.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Hello world!
 *
 */
@ServletComponentScan
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        //开启Spring的配置，加载整个数据
        SpringApplication application = new SpringApplication(App.class);
        application.run(args);
    }
}
