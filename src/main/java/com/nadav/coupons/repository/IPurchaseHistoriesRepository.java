package com.nadav.coupons.repository;

import com.nadav.coupons.entities.PurchaseDetailsEntity;
import org.springframework.data.repository.CrudRepository;

public interface IPurchaseHistoriesRepository extends CrudRepository<PurchaseDetailsEntity,Long> {
}
