package com.inuvens.ivendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inuvens.ivendas.dto.SaleDTO;
import com.inuvens.ivendas.dto.SaleSuccessDTO;
import com.inuvens.ivendas.dto.SaleSumDTO;
import com.inuvens.ivendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
		
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll( Pageable pageable ){
		Page<SaleDTO> page = service.findAll( pageable );
		return ResponseEntity.ok(page);	
	}
	
	@GetMapping(value="/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller (){
		List<SaleSumDTO> list = service.amountGroupBySeller( );
		return ResponseEntity.ok(list);	
	}
	
	
	@GetMapping(value ="/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller(){
		List<SaleSuccessDTO> list = service.successGroupBySeller( );
		return ResponseEntity.ok(list);	
	}
	

}
