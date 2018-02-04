package com.lm.datainput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lm.datainput.mapper")
public class DatainputApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatainputApplication.class, args);
	}
}
