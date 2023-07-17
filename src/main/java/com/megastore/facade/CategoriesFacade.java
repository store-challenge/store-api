package com.megastore.facade;

import com.megastore.data.dto.CategoriesDto;

import java.util.Collection;

public interface CategoriesFacade {
    Collection<CategoriesDto> findAll();


}
