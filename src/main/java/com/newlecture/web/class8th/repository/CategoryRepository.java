package com.newlecture.web.class8th.repository;

import com.newlecture.web.class8th.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryRepository {
    List<Category> findAll();
}
