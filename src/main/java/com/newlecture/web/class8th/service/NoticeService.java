package com.newlecture.web.class8th.service;

import java.sql.SQLException;
import java.util.List;

import com.newlecture.web.class8th.entity.Notice;

public interface NoticeService {
  
    public List<Notice> getList() throws SQLException, ClassNotFoundException;
 
}
