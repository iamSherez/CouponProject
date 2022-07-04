package com.nadav.coupons.repository;

import com.nadav.coupons.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICustomersRepository extends CrudRepository<CustomerEntity,Long> {
}
