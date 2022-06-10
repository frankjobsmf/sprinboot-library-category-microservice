package com.library.categorymicroservice.Controller;


import com.library.categorymicroservice.Entity.Category;
import com.library.categorymicroservice.Repository.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private ICategory iCategory;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAll(){
        return iCategory.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category getCategoryById(@PathVariable Long id){
        return iCategory.getCategoryById(id);
    }




    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCategory(@RequestBody Category category){
        iCategory.saveCategory(category);
        return;

    }

}
