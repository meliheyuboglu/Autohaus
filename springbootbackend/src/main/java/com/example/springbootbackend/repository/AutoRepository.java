package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<Auto, Long> {


}