package com.example.demo.repository;

import com.example.demo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Regis Michael
 * @since 2025-10-24
 */

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {}