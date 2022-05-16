package com.danielxavier.acervo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danielxavier.acervo.entities.Obra;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Long>{

}
