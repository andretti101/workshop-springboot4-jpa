package com.andretti101.course.services;

import com.andretti101.course.entities.Product;
import com.andretti101.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
