package com.example.worldline.worldline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.worldline.worldline.entity.Forms;

@Repository
public interface FormRepository extends JpaRepository<Forms,Integer> {
    
}
