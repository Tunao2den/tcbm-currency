package com.tcbmcurrency.tcbmcurrency;

import com.tcbmcurrency.tcbmcurrency.mapper.XmlToObjectMapper;
import com.tcbmcurrency.tcbmcurrency.service.FillObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TcbmCurrencyApplication {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public FillObject fillObject(){
		return new FillObject();
	}

	public static void main(String[] args) {
		SpringApplication.run(TcbmCurrencyApplication.class, args);

	}

}
