package com.product.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.product.repo.ProductInfoRepo;
import com.product.service.ProductInfoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ProductInfoController {
	
	
	@Autowired
	private ProductInfoService productInfoService;
	
	@Autowired
	private ProductInfoRepo repo;
	@PostMapping(value="/upload")
	public void uploadImages(@RequestParam("file") MultipartFile[] fileList) throws IOException {
		
		String name="manoj";
		productInfoService.saveAllImages(fileList);
	}
	
	@GetMapping(value="/getimage")
	public ResponseEntity<String> getImage() {
		
		return ResponseEntity.ok(Base64.getEncoder().encodeToString((repo.findAll().get(0).getData())));
	}

}
