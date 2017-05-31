package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;

@SpringBootApplication
// your Entity project
@EntityScan(basePackages = {"com.spring.Models"} )
//your Repository
@EnableJpaRepositories(basePackages = {"com.spring.DAO"})
public class NeilApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeilApplication.class, args);
	}
	
	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {    
	    return new EmbeddedServletContainerCustomizer(){        
	        @Override        
	         public void customize(ConfigurableEmbeddedServletContainer container) {            
	            container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/error/400.html"));            
	            container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500.html"));            
	            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html"));        
	        }    
	    };
	}
	
	
}
