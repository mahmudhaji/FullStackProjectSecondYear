package com.example.demo.repository;

import com.example.demo.mode.Court;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourtRepo extends JpaRepository<Court,Integer> {
}
