package com.biritas.userdept.repositories;

import com.biritas.userdept.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
