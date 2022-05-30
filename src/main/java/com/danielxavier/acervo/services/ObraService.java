package com.danielxavier.acervo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danielxavier.acervo.dto.AutorDTO;
import com.danielxavier.acervo.dto.ObraDTO;
import com.danielxavier.acervo.entities.Autor;
import com.danielxavier.acervo.entities.Obra;
import com.danielxavier.acervo.repositories.AutorRepository;
import com.danielxavier.acervo.repositories.ObraRepository;
import com.danielxavier.acervo.services.exceptions.ResourceNotFoundException;

@Service
public class ObraService {
	
	@Autowired
	private ObraRepository repository;
	
	@Autowired
	private AutorRepository autorRepository;
	
	@Transactional(readOnly = true)
	public ObraDTO findById(Long id) {
		Obra entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Obra não encontrada!"));
		
		return new ObraDTO(entity, entity.getAutores());
	}
	
	@Transactional
	public ObraDTO insert(ObraDTO dto) {
		Obra entity = new Obra();
		
		entity.setNome(dto.getNome());
		entity.setDataPublicacao(dto.getDataPublicacao());
		entity.setDescricao(dto.getDescricao());
				
		entity.getAutores().clear();
		
		for (AutorDTO x : dto.getAutores()) {
			Autor autor = autorRepository.getById(x.getId());
			entity.getAutores().add(autor);
		}
		
		entity = repository.save(entity);
		return  new ObraDTO(entity);
	}
}
