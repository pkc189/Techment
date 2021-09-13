package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long>{

}
