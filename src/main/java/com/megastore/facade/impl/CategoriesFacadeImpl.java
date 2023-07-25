package com.megastore.facade.impl;

import com.megastore.data.dto.CategoriesDto;
import com.megastore.facade.CategoriesFacade;
import com.megastore.service.CategoriesService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoriesFacadeImpl implements CategoriesFacade {

    private final CategoriesService categoriesService;

    public CategoriesFacadeImpl(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @Override
    public Collection<CategoriesDto> findAll() {
        return categoriesService.findAll().stream().map(CategoriesDto::new).toList();
    }
}
