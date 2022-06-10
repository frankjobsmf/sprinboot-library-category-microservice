package com.library.categorymicroservice.Dao;

import com.library.categorymicroservice.Entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDAO extends CrudRepository<Category, Long> {
}
