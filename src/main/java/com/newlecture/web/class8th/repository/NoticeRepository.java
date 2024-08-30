package com.newlecture.web.class8th.repository;

import org.springframework.stereotype.Repository;

import com.newlecture.web.class8th.entity.Notice;

import java.sql.SQLException;
import java.util.List;


public interface NoticeRepository<T> {
  
  List<T> findAll() throws SQLException, ClassNotFoundException;

  
}
