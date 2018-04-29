package com.sh.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by sh on 18/4/28.
 */
@SpringBootApplication
@MapperScan("com.sh.springboot.dao")
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	/*
	 * @Autowired private ServiceWaiCeng s;
	 * 
	 * @RequestMapping("/") String home() throws Exception {
	 * System.out.println("controller 正常执行"); s.insertWaiCeng();;
	 * 
	 * return " 正常返回Hello World!"; }
	 */
}
