package com.xwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.xwq.custom.StatusEndPoint;

/**
 * 也可通过SSH监控和管理应用，主要依赖Remote Shell
 * 依赖添加好后启动应用时控制台会打印SSH访问的密码
 * 
 * 主机：localhost
 * 端口：2000
 * 账号：user
 * 密码：见控制台
 * 
 * @author WQXia
 * @date 2017-04-07 17:03:11
 * @version 1.0
 */
@SpringBootApplication
public class MySpringBootActuatorApplication {

	/**
	 * 注册端点的bean
	 * @return
	 */
	@Bean
	public Endpoint<String> status() {
		return new StatusEndPoint();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootActuatorApplication.class, args);
	}
}
