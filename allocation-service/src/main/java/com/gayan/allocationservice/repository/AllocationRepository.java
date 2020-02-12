package com.gayan.allocationservice.repository;

import com.gayan.allocationservice.model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Integer> {

    List<Allocation> findByEmpId(Integer id);
}
