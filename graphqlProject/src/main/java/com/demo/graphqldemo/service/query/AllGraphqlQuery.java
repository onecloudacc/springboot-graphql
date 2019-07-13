package com.demo.graphqldemo.service.query;

import org.springframework.beans.factory.annotation.Autowired;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphqldemo.service.NameService;
import com.demo.graphqldemo.service.DTO.DataModelDTO;

// Implement the GraphQLQueryResolver
public class AllGraphqlQuery implements GraphQLQueryResolver {

	@Autowired
	 private NameService nameService;
	
	// The method name defined here should be same across the files : query.graphql,AllGraphqlQuery.java and service class.
	public DataModelDTO fetchName(String id) {
		return nameService.fetchName(id);
	}
	
	
	 
	
}
