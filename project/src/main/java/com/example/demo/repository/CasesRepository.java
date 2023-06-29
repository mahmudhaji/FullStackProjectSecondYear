package com.example.demo.repository;

import com.example.demo.mode.Cases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasesRepository extends JpaRepository<Cases,Integer> {
}
