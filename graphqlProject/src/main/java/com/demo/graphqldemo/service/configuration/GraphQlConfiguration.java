package com.demo.graphqldemo.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.demo.graphqldemo.service.query.AllGraphqlQuery;

// Annotate the class with @Configuration and define the bean which contains the service method call. 
@Configuration
public class GraphQlConfiguration {

	
	@Bean
	public AllGraphqlQuery allGraphqlQuery() {
		
		return new AllGraphqlQuery();
	}
	
}
