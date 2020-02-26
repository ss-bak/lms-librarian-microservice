package com.smoothstack.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.lms.common.model.Borrower;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {

}
