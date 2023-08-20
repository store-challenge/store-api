package com.megastore.facade.impl;

import com.megastore.data.dto.SubCategoriesDto;
import com.megastore.facade.SubCategoriesFacade;
import com.megastore.service.SubCategoriesService;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class SubCategoriesFacadeImpl implements SubCategoriesFacade {

    private final SubCategoriesService subCategoriesService;

    public SubCategoriesFacadeImpl(SubCategoriesService subCategoriesService) {
        this.subCategoriesService = subCategoriesService;
    }

    @Override
    public Collection<SubCategoriesDto> findSubCategoriesByCategories_Id(long catId) {
        return subCategoriesService.findSubCategoriesByCategories_Id(catId).stream().map(SubCategoriesDto::new).toList();
    }
}
