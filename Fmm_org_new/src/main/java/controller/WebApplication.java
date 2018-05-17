package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Repositories.TableMainRepository;


@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses =TableMainRepository.class)
public class WebApplication {
  



    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

