package com.APIweb.course.repositories;

import com.APIweb.course.entities.Category;
import com.APIweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
