package com.atguigu.atcrowdfunding.manger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan("com.atguigu.**.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class AtcrowdfundingBootManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtcrowdfundingBootManagerServiceApplication.class, args);
	}
}
