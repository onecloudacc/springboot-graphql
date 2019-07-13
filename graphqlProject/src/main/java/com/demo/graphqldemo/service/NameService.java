package com.demo.graphqldemo.service;

import com.demo.graphqldemo.service.DTO.DataModelDTO;

public interface NameService {
	public DataModelDTO fetchName(String id);
}
