package com.library.categorymicroservice.Repository;

import com.library.categorymicroservice.Entity.Category;

import java.util.List;

public interface ICategory {

    public List<Category> getAll();

    public Category getCategoryById(Long id);

    public void saveCategory(Category category);
}
