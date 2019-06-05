package com.gaozhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 项目启动方法
 * @author Administrator
 *
 */
@SpringBootApplication
@MapperScan(value = {"com.fc.test.mapper","com.gaozhi.mapper"})
public class SpringbootStart {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootStart.class, args);
        System.out.println("=================================");
        System.out.println("=============启动成功===============");
        System.out.println("=================================");
    }
}
