package com.coooldoggy.book;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/**
 * 프로젝트의 메인 클래스
 * @SpringBootApplication : 스프링 부트의 자동 설정, 스프링 Bean 읽기와 설정, 프로젝트의 최상단에 위치해야함
 */
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /**
         * 내장 WAS 실행
         */
        SpringApplication.run(Application.class, args);
    }
}
