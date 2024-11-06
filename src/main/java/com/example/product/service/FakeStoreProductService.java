package com.example.product.service;

import com.example.product.dtos.ProductResponseDto;
import com.example.product.models.Category;
import com.example.product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FakeStoreProductService implements  IProductService {

@Autowired
private RestTemplate restTemplate;
public  Product getProductFromResponseDto(ProductResponseDto productResponseDto){
    Product product = new Product();product.setId(productResponseDto.getId());
   product.setName(productResponseDto.getTitle());
   product.setDescription(productResponseDto.getDescription());
   product.setPrice(productResponseDto.getPrice());
   product.setImage(productResponseDto.getImage());
   product.setCategory(new Category());
   product.getCategory().setName(productResponseDto.getCategory());
   return product;

}

    @Override
    public Product getSingleProduct(Long id) {
        //https://fakestoreapi.com/products/1
        //Resttemplate and hhtp client to interact with another service
        ProductResponseDto responseDto= restTemplate.getForObject("https://fakestoreapi.com/products/"+id, ProductResponseDto.class);
       return getProductFromResponseDto(responseDto);
    }




}
