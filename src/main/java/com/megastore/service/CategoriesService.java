package com.megastore.service;

import com.megastore.model.Categories;
import com.megastore.repository.CategoriesRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriesService {

//    @Autowired
    private CategoriesRepository categoriesRepository;

    @Transactional(readOnly = true)
    public List<Categories> findAll(){
        List<Categories> showAllCategories = categoriesRepository.findAll();
        return showAllCategories;
    }

    @Transactional
    public Categories saveCategory(Categories category) {
        Categories savedCategory = categoriesRepository.saveAndFlush(category);
        return savedCategory;
    }
}
