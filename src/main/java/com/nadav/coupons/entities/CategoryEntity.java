package com.nadav.coupons.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "categoryName", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<CouponEntity> coupons;

    public CategoryEntity() {
    }

    public CategoryEntity(int id, String name, List<CouponEntity> coupons) {
        this.id = id;
        this.name = name;
        this.coupons = coupons;
    }

    public CategoryEntity(String name) {
        this.name = name;
    }

    public CategoryEntity(String name, List<CouponEntity> coupons) {
        this.name = name;
        this.coupons = coupons;

    }

    public CategoryEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CouponEntity> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<CouponEntity> coupons) {
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coupons=" + coupons +
                '}';
    }
}

