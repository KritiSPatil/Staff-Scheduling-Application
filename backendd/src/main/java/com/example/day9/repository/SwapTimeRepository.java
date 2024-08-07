package com.example.day9.repository;

import com.example.day9.model.SwapTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwapTimeRepository extends JpaRepository<SwapTime, Long> {
}
