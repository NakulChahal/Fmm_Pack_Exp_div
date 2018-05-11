package com.hellokoding.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Repositories.TableMainRepository;


@EnableJpaRepositories(basePackageClasses =TableMainRepository.class)
//@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@SpringBootApplication

public class WebApplication {
   
//	@Autowired
//	 private TableMainRepository tableMainRepositort;

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

