package com.mattvoget.tsspring;

import com.mattvoget.tsspring.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.mattvoget.tsspring.config.WebAppConfig;

@SpringBootApplication
@Import({WebAppConfig.class, WebSecurityConfig.class})
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
}
