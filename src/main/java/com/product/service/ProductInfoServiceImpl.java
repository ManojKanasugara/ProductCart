package com.product.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.product.model.ImageModel;
import com.product.model.ProductInfo;
import com.product.repo.ImageRepo;
import com.product.repo.ProductInfoRepo;

import jakarta.transaction.Transactional;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	private ProductInfoRepo productInfoRepo;

	@Autowired
	private ImageRepo imageRepo;

	@Override
	public ImageModel saveAllImages(MultipartFile[] fileList) throws IOException {

		for (MultipartFile file : fileList) {
			System.out.println(file.getResource().toString());
			System.out.println(file.getName());
			System.out.println(file.getBytes());
			ImageModel img = new ImageModel(file.getName(), file.getBytes());
			// productInfoRepo.save(img);

		}

		// TODO Auto-generated method stub
		return null;
	}

	public ProductInfo saveProduct(ProductInfo product) {
		// image save
		// PF setImage
		//offerptice
		//a
		//p/setof(a);
		
		if(product.getOfferPrice()==0.0) {
			float offervalue=product.getActualPrice()*product.getOffer()/100;
			product.setOfferPrice(product.getActualPrice()-offervalue);
		}
	

		ProductInfo p = productInfoRepo.save(product);
		//List<ImageModel> imageList = product.getImageList();
		//product.setImageList(imageList);
		for (ImageModel img : product.getImageList()) {
			img.setProduct(p);
			imageRepo.save(img);

		}
		// product.getImageList().stream().forEach(x ->
		// System.out.println(x.getName()));
		return p;
	}

	public void store() throws Exception {
		ProductInfo product1 = new ProductInfo("HeadPhone", 3500, 9500, 6000, true, "2", "Electronics");
		ProductInfo product2 = new ProductInfo("SoftTouch", 110, 355, 225, true, "1", "Fresh");
		// save a couple of customers

		String image1 = "/Users/priyanka/Downloads/download.jpeg";
		String image2 = "/Users/priyanka/Downloads/download.jpeg";
		String image3 = "/Users/priyanka/Downloads/download.jpeg";
		String image4 = "/Users/priyanka/Downloads/download.jpeg";

		image1.getBytes("HeadPhone");
		image2.getBytes("HeadPhone");
		image3.getBytes("SoftTouch");

		productInfoRepo.save(product1);
		productInfoRepo.save(product2);

	}

	public Optional<ProductInfo> findById(Long productId) {
		return productInfoRepo.findById(productId);
	}

	@Override
	public void deleteById(Long productId) {
		 productInfoRepo.deleteById(productId);
	}

	

	
}
