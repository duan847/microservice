package com.duan.microservice.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RefreshScope
// 实现更新配置不用重启服务
// 		1、添加maven依赖
// 				<dependency>
// 					<groupId>org.springframework.boot</groupId>
// 					<artifactId>spring-boot-starter-actuator</artifactId>
// 				</dependency>
// 		2、## 刷新时，关闭安全验证
//			application.yml添加
// 							  management:
//   						     security:
//		   					        enabled: false
// 		3、客户端启动类添加@RefreshScope
// 		4、修改git中的配置
// 		5、post调用http://ip:port/refresh
public class MicroserviceConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigClientApplication.class, args);
	}

	@Value("${url1}")
	String eurekaUrl ;

	@RequestMapping(value = "/hi")
	public String hi(){
		return eurekaUrl;
	}
}
