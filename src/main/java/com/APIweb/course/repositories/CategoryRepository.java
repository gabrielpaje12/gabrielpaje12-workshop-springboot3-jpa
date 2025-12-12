package com.APIweb.course.repositories;

import com.APIweb.course.entities.Category;
import com.APIweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CategoryRepository extends JpaRepository<Category,Long> {

}
