package com.megastore.service.impl;

import com.megastore.model.Categories;
import com.megastore.repository.CategoriesRepository;
import com.megastore.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesServiceImpl  implements CategoriesService {

   
    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Categories> findById(Long id) {
        return categoriesRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Categories> findAll(){
        return categoriesRepository.findAll();
    }

    @Transactional
    public Categories saveCategory(Categories category) {
        Categories savedCategory = categoriesRepository.saveAndFlush(category);
        return savedCategory;
    }
}
