package com.smoothstack.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.lms.common.model.BookLibraryBranch;
import com.smoothstack.lms.common.model.Copies;

@Repository
public interface CopiesRepository extends JpaRepository<Copies, BookLibraryBranch> {

}
