package com.example.myhapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyHapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHapiApplication.class, args);
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public ServletRegistrationBean ServletRegistrationBean() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new FhirRestfulServer(applicationContext), "/*");
        registrationBean.setName("FHIR_SERVER");
        return registrationBean;
    }
}
