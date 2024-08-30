package com.newlecture.web.class8th.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.class8th.entity.Notice;
import com.newlecture.web.class8th.repository.NoticeRepository;

@Service
public class DefaultNoticeService implements NoticeService{

  @Autowired
  private NoticeRepository repository;

  @Override
  public List<Notice> getList() throws SQLException, ClassNotFoundException {
    return repository.findAll();

  }

  
}
