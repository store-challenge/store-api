package com.megastore.service.impl;

import com.megastore.model.SubCategories;
import com.megastore.repository.SubCategoriesRepository;
import com.megastore.service.SubCategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoriesServiceImpl implements SubCategoriesService {

    private final SubCategoriesRepository subCategoriesRepository;

    public SubCategoriesServiceImpl(SubCategoriesRepository subCategoriesRepository) {
        this.subCategoriesRepository = subCategoriesRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<SubCategories> findById(Long id) {
        return subCategoriesRepository.findById(id);
    }
    @Override
    @Transactional(readOnly = true)
    public List<SubCategories> findAll(){
        return subCategoriesRepository.findAll();
    }
}
