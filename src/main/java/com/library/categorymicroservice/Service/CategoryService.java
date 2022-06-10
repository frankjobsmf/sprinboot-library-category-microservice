package com.library.categorymicroservice.Service;

import com.library.categorymicroservice.Dao.CategoryDAO;
import com.library.categorymicroservice.Entity.Category;
import com.library.categorymicroservice.Repository.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategory {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<Category> getAll() {

        List<Category> categories = new ArrayList<Category>();

        categories = (List<Category>) categoryDAO.findAll();

        return categories;
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryDAO.findById(id).orElse(null);
    }

    @Override
    public void saveCategory(Category category) {
        categoryDAO.save(category);

        return;
    }
}
