package com.megastore.service;

import com.megastore.model.SubCategories;
import com.megastore.repository.SubCategoriesRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubCategoriesService {


//    @Autowired
    private SubCategoriesRepository subCategoriesRepository;

    @Transactional(readOnly = true)
    public List<SubCategories> findAll(){
        List<SubCategories> showAllSubCategories = subCategoriesRepository.findAll();
        return showAllSubCategories;
    }
}
