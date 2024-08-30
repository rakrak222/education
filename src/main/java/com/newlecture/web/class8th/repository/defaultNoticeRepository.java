package com.newlecture.web.class8th.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.newlecture.web.class8th.entity.Notice;

//@Repository
public class defaultNoticeRepository implements NoticeRepository<Notice>{

  
  @Override
  public List<Notice> findAll() {
    List<Notice> list = new ArrayList<>();

//    list.add(new Notice("1","자바","wwww"));
//    list.add(new Notice("2","스프링","cwqqw"));
//    list.add(new Notice("3","wqcqw","wwww"));
//    list.add(new Notice("4","wqcqw","wwww"));

    return list;
    
  }
  
}

