package com.msr.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author MaiShuRen
 * @version v1.0
 * @date 2020/6/27 10:44
 */
@SpringBootApplication
@MapperScan(basePackages = "com.msr.shardingjdbc.mapper")
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcApplication.class, args);
    }
}
