package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
	private ProductRepository pr;
	
	@Transactional(readOnly = true)
    public List<Product> getAllProducts(){
        return pr.findAll();
    }
	
	@Transactional(readOnly = true)
    public List<ProductType> getAllProductTypes(){
        return pr.findAllProductTypes();
    }
	
	@Transactional(readOnly = true)
    public List<Product> getProductsCheaperThan(double price) {
        return pr.getProductsCheaperThan(price);
    }
	@Transactional(readOnly = true)
    public ProductType getProductType(String typeName) {
        return pr.getProductType(typeName);
    }
	@Transactional(readOnly = true)
    public Product save(Product p){
        return pr.save(p);       
    }
	
	@Autowired
	public ProductService(ProductRepository pr) {
		super();
		this.pr = pr;
	}
    
    
}
