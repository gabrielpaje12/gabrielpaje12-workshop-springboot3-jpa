package com.APIweb.course.repositories;

import com.APIweb.course.entities.Category;
import com.APIweb.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
