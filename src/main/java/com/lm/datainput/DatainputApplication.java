package com.lm.datainput;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lm.datainput.mapper")
public class DatainputApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatainputApplication.class, args);
	}
}
