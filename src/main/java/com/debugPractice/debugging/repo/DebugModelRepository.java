package com.debugPractice.debugging.repo;

import com.debugPractice.debugging.model.DebugModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DebugModelRepository extends JpaRepository<DebugModel, Integer> {
    Optional<DebugModel> findByEmpName(String empName);
}
