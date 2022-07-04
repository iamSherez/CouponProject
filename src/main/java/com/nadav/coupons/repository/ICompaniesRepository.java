package com.nadav.coupons.repository;

import com.nadav.coupons.entities.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICompaniesRepository extends CrudRepository <CompanyEntity,Long> {
}
