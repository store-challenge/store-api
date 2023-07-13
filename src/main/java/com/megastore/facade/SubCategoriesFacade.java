package com.megastore.facade;

import com.megastore.dto.SubCategoriesDto;

import java.util.Collection;

public interface SubCategoriesFacade {
    Collection<SubCategoriesDto> findAll();
}
