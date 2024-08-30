package com.newlecture.web.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.newlecture.web.entity.Exam;

public interface Repository<T> {

	List<T> findAll() throws FileNotFoundException, IOException;
	int save(T t);
	int update(T t);
	
}
