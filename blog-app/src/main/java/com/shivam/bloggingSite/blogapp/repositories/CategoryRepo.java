package com.shivam.bloggingSite.blogapp.repositories;

import com.shivam.bloggingSite.blogapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
