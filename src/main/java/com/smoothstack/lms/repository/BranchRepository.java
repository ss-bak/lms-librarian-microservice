package com.smoothstack.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.lms.common.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

}
