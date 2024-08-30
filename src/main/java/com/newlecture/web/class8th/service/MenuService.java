package com.newlecture.web.class8th.service;

import com.newlecture.web.class8th.entity.MenuView;

import java.util.List;

public interface MenuService {

    List<MenuView> getList();



    List<MenuView> getList(Integer CategoryId);


    List<MenuView> getList(Integer categoryID, String query);
}
