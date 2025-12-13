package com.example.demo.repository;

import com.example.demo.model.EstoquePeca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoquePecasRepository extends JpaRepository<EstoquePeca, Long> {}
