package com.product.controller;

import java.io.IOException;

import java.util.Base64;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.product.model.ProductInfo;
import com.product.repo.ProductInfoRepo;
import com.product.service.ProductInfoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping(value = "/product", method = RequestMethod.PUT)
public class ProductInfoController {

	@Autowired
	private ProductInfoService productInfoService;

	@Autowired
	private ProductInfoRepo repo;

	@PostMapping(value = "/upload")
	public void uploadImages(@RequestParam("file") MultipartFile[] fileList) throws IOException{
		productInfoService.saveAllImages(fileList);
	}

	@PutMapping("/findbyid/{id}")
	public Optional<ProductInfo> findById(@PathVariable("id") Long productId) {
		return productInfoService.findById(productId);
	}

	@GetMapping(value = "/getimage")
	public ResponseEntity<String> getImage() {

		return ResponseEntity.ok(Base64.getEncoder().encodeToString((repo.findAll().get(0).getData())));
	}

	@DeleteMapping("/deletebyid/{id}")
	public String delete(@PathVariable("id") Long productId) {
		productInfoService.deleteById(productId);
		 return "Deleted Successfully";
	}

	@PutMapping("/update/{id}")
	public String updateProduct(@PathVariable("id") Long productId) {
		 ProductInfoRepo.updateProduct(productId);
		 return "Updated";
	}
	
	
	@PutMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfo saveProductInfo(@RequestBody ProductInfo product) {
		return productInfoService.saveProduct(product);
	}

}
