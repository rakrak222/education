package com.newlecture.web.class8th.controller;

import com.newlecture.web.class8th.entity.Category;

import com.newlecture.web.class8th.entity.MenuView;
import com.newlecture.web.class8th.service.CategoryService;
import com.newlecture.web.class8th.service.MenuService;
import com.newlecture.web.class8th.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

@RequestMapping("/menu")
@Controller
public class MenuController {

    @Autowired
    private MenuService service;
    @Autowired
    private CategoryService categoryService;



    @GetMapping("/list")
    public String list(
            @RequestParam(value = "c", required = false) Integer categoryId,
            @RequestParam(value = "q", required = false) String query,
            Model model
    ) throws SQLException, ClassNotFoundException {
        List<Category> categories = categoryService.getList();
//        List<Menu> menus = service.getMenuByCategory();
        List<MenuView> menus = service.getList(categoryId,query);


        model.addAttribute("categories", categories);
        model.addAttribute("menus", menus);


        return "menu/list";
    }

//    public String coffeeList(
//            Model model
//    ){
//        List<Category> categories = categoryService.getList();
//    }


}