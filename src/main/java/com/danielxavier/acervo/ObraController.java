package com.danielxavier.acervo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
