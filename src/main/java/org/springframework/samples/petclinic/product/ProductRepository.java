package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.petclinic.user.User;



public interface ProductRepository extends  CrudRepository<Product, Integer>{
    List<Product> findAll();
//    List<ProductType> findAllProductTypes();
    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);
    @Query("SELECT productType FROM ProductType productType")
    List<ProductType> findAllProductTypes();
    @Query("SELECT DISTINCT productType FROM ProductType productType WHERE productType.name LIKE :name%")
    ProductType getProductType(String name);
    @Query("SELECT DISTINCT product FROM Product product WHERE product.price <= :price")
    List<Product> getProductsCheaperThan(double price);
}
