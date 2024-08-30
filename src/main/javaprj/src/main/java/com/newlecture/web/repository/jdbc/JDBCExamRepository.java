package com.newlecture.web.repository.jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.newlecture.web.entity.Exam;
import com.newlecture.web.repository.Repository;

public class JDBCExamRepository implements Repository<Exam>{

	
	@Override
	public List<Exam> findAll() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		List<Exam> list = new ArrayList<>();
		return list;
	}

	@Override
	public int save(Exam t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Exam t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
