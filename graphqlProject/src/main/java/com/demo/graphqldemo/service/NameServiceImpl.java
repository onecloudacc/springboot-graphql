package com.demo.graphqldemo.service;

import org.springframework.stereotype.Service;

import com.demo.graphqldemo.service.DTO.DataModelDTO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NameServiceImpl implements NameService {

	 public DataModelDTO fetchName(String id) {
		
	System.out.println("tested graphql successfully");
	DataModelDTO dataModelDTO = new  DataModelDTO();
	dataModelDTO.setFirstName("fname");
	dataModelDTO.setLastName("Lname");
	return dataModelDTO;
	}
}
