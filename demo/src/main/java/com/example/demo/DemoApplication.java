package com.example.demo;

import com.example.demo.model.Staff;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log= LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}


	@Bean
	public CommandLineRunner run(RestTemplate template) throws Exception{
		return args->{
			log.info("start clr application");
			ResponseEntity<List<Staff>> staffs=template.exchange("http://localhost:7008/staff", HttpMethod.GET, null, new ParameterizedTypeReference<List<Staff>>() {
			});
			staffs.getBody().forEach(staff->{log.info(staff.toString());});
			log.info("finish clr application");
		};

	}

}
