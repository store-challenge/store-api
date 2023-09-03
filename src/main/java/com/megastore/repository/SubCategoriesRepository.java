package com.megastore.repository;

import com.megastore.model.SubCategories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoriesRepository extends BaseRepository<SubCategories> {

    List<SubCategories> findSubCategoriesByCategories_Id(long categoryId);
}
