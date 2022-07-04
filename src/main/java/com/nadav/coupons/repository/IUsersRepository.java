package com.nadav.coupons.repository;

import com.nadav.coupons.entities.PurchaseDetailsEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUsersRepository extends CrudRepository<PurchaseDetailsEntity,Long> {

}
