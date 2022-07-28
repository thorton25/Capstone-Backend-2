package com.capstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.model.Alias;

@Repository
public interface AliasRepository extends JpaRepository<Alias, Long>{
}
