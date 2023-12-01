package com.product.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.product.model.ImageModel;
import com.product.repo.ProductInfoRepo;

@Service
public class ProductInfoImpl  implements ProductInfoService{
	
	@Autowired
	private ProductInfoRepo productInfoRepo;
	
	@Override
	public ImageModel saveAllImages(MultipartFile[] fileList) throws IOException {
		
		for(MultipartFile file:fileList) {
			System.out.println(file.getResource().toString());
			System.out.println(file.getName());
			System.out.println(file.getBytes());
			ImageModel img=new 
					ImageModel(file.getName(),file.getBytes());
			productInfoRepo.save(img);
			
		}
		
		// TODO Auto-generated method stub
		return null;
	}

}
