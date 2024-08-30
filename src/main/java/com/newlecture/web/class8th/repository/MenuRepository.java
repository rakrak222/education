package com.newlecture.web.class8th.repository;

import com.newlecture.web.class8th.entity.Menu;
import com.newlecture.web.class8th.entity.MenuView;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface MenuRepository {

//    List<Menu> findAll();
//    List<Menu> findAll(Integer CategoryId);

    List<MenuView> findAll(Integer categoryId, String query);
}
