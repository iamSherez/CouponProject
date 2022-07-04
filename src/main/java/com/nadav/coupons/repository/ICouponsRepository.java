package com.nadav.coupons.repository;

import com.nadav.coupons.entities.CouponEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICouponsRepository extends CrudRepository<CouponEntity,Long> {


}
