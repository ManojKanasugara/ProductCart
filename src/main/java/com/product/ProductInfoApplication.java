package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.controller.ProductInfoController;

@SpringBootApplication
public class ProductInfoApplication 
implements CommandLineRunner{
	
//	@Autowired
//	private ProductInfoRepo productInfoRepo; 

	public static void main(String[] args) {
		SpringApplication.run(ProductInfoApplication.class, args);
	}

	@Autowired
	private ProductInfoController productInfoController;
	@Override
	public void run(String... args) throws Exception {
		 String image1="/Users/priyanka/Downloads/download.jpeg";
		 String image2="/Users/priyanka/Downloads/20211022_082555.jpg";
		
//		 productInfoRepo.save(image1);
//		 productInfoRepo.save(image2);
		//productInfoController.uploadImages(null);
		// TODO Auto-generated method stub
		
	}

}
