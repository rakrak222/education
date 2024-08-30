package com.newlecture.web.class8th.service;
import com.newlecture.web.class8th.entity.MenuView;
import com.newlecture.web.class8th.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMenuService implements MenuService {

    @Autowired
    private MenuRepository repository;

    @Override
    public List<MenuView> getList()
    {
        List<MenuView> menus = getList(null,null);
        return menus;
    }

    @Override
    public List<MenuView> getList(Integer categoryId) {
        List<MenuView> menus = getList(categoryId,null);
        return menus;
    }

    @Override
    public List<MenuView> getList(Integer categoryId, String query) {
        List<MenuView> menus = repository.findAll(categoryId,query);
        return menus;
    }
}
