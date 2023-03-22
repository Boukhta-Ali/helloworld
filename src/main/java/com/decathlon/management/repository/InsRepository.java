package com.decathlon.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decathlon.management.entity.Institution;

@Repository
public interface InsRepository extends JpaRepository<Institution, Long> {
}
