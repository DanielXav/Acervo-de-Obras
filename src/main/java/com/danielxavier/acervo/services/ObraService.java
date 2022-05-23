package com.danielxavier.acervo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danielxavier.acervo.dto.ObraDTO;
import com.danielxavier.acervo.entities.Obra;
import com.danielxavier.acervo.repositories.ObraRepository;
import com.danielxavier.acervo.services.exceptions.ResourceNotFoundException;

@Service
public class ObraService {
	
	@Autowired
	private ObraRepository repository;
	
	@Transactional(readOnly = true)
	public ObraDTO findById(Long id) {
		Obra entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Obra não encontrada!"));
		
		return new ObraDTO(entity, entity.getAutores());
	}
}
