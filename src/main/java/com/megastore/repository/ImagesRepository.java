package com.megastore.repository;

import com.megastore.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepository extends BaseRepository<Images> {
}
