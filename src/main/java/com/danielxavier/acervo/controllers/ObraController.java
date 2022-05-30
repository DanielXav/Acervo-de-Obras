package com.danielxavier.acervo.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.danielxavier.acervo.dto.ObraDTO;
import com.danielxavier.acervo.services.ObraService;

@RestController
@RequestMapping(value = "/obra")
public class ObraController {

	@Autowired
	private ObraService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ObraDTO> findById(@PathVariable Long id){
		ObraDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<ObraDTO> insert(@RequestBody ObraDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
}
