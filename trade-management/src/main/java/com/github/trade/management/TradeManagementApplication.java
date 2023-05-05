package com.github.trade.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.github"})
@MapperScan({"com.github.trade.goods.db.mappers"})
@SpringBootApplication
public class TradeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeManagementApplication.class, args);
    }

}
