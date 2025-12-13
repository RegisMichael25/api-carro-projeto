package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
//    @Query("SELECT c FROM Cliente c WHERE c.id LIKE %:id%")
//    Optional<Cliente> findByIdR(Long id);
}
