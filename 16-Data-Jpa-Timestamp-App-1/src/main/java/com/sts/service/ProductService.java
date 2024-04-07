package com.sts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.entity.Product;
import com.sts.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo ProductRepo;
	
	public void saveProduct() {
		
		
		Product p=new Product();
		p.setPid(212);
		p.setName("HHD");
		p.setPrice(4016.20);
		
		ProductRepo.save(p);
		System.err.println("Produce is saved");
	}
	
	
	
}
