package com.nadav.coupons.repository;

import com.nadav.coupons.entities.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriesRepository extends CrudRepository <CategoryEntity,Integer> {



}
