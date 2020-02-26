package com.smoothstack.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.lms.common.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
