package com.zxw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;


@SpringBootApplication


public class ResourcePoolApplication {

    public static void main(String[] args) {
        //可以main启动方法设置
//        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));

//        System.out.println(TimeZone.getTimeZone());


//        void started() {
//            TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));}


        SpringApplication.run(ResourcePoolApplication.class, args);
    }

}
