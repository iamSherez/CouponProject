package com.nadav.coupons.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchase_history")
public class PurchaseDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "amount_of_coupons", nullable = false)
    private int amountOfCoupons;

    @Column(name = "purchase_date",nullable = false)
    private Date purchaseDate;

    @ManyToOne()
    @JoinColumn(name = "coupon_id")
    private CouponEntity coupon;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    protected CustomerEntity customer;

    public PurchaseDetailsEntity() {
    }

    public PurchaseDetailsEntity(int amountOfCoupons, Date purchaseDate, CouponEntity coupon, CustomerEntity customer) {
        this.amountOfCoupons = amountOfCoupons;
        this.purchaseDate = purchaseDate;
        this.coupon = coupon;
        this.customer = customer;
    }

    public PurchaseDetailsEntity(long id, int amountOfCoupons, Date purchaseDate, CouponEntity coupon, CustomerEntity customer) {
        this.id = id;
        this.amountOfCoupons = amountOfCoupons;
        this.purchaseDate = purchaseDate;
        this.coupon = coupon;
        this.customer = customer;
    }

    public PurchaseDetailsEntity(long id, int amountOfCoupons, Date purchaseDate) {
        this.id = id;
        this.amountOfCoupons = amountOfCoupons;
        this.purchaseDate = purchaseDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAmountOfCoupons() {
        return amountOfCoupons;
    }

    public void setAmountOfCoupons(int amountOfCoupons) {
        this.amountOfCoupons = amountOfCoupons;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public CouponEntity getCoupon() {
        return coupon;
    }

    public void setCoupon(CouponEntity coupon) {
        this.coupon = coupon;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "PurchaseDetailsEntity{" +
                "id=" + id +
                ", amountOfCoupons=" + amountOfCoupons +
                ", purchaseDate=" + purchaseDate +
                ", coupon=" + coupon +
                ", customer=" + customer +
                '}';
    }
}