package com.campus.service;

import com.campus.dto.CategoryDTO;
import com.campus.dto.CategoryPageQueryDTO;
import com.campus.entity.Category;
import com.campus.result.PageResult;

import java.util.List;

public interface CategoryService {
    PageResult<Category> getCategoryList(CategoryPageQueryDTO categoryPageQueryDTO);

    boolean addCategory(CategoryDTO categoryDTO);

    boolean updateCategory(CategoryDTO categoryDTO);

    boolean delCategory(Long id);

    Category getCategoryById(Long id);

    int getCategoryByName(String categoryName);

    boolean changeCategoryStatus(Long id, Integer status);

    List<Category> listCategoryByType(Integer type);

    List<Category> listAllCategory();
}
