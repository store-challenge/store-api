package com.megastore.repository;

import com.megastore.model.SubCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoriesRepository extends BaseRepository<SubCategories> {
}
