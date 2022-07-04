package com.nadav.coupons.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Company")
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name",nullable = false,unique = true)
    private String name;

    @Column(name = "phoneNumber",nullable = false)
    private String phoneNumber;

    @Column (name = "address",nullable = false)
    private String address;

    @OneToMany(mappedBy = "company")
    private List<CouponEntity> couponEntities;

    public CompanyEntity() {
    }

    public CompanyEntity(String name, String phoneNumber, String address, List<CouponEntity> couponEntities) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.couponEntities = couponEntities;
    }

    public CompanyEntity(int id, String name, String phoneNumber, String address, List<CouponEntity> couponEntities) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.couponEntities = couponEntities;
    }

    public CompanyEntity(int id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CouponEntity> getCouponEntities() {
        return couponEntities;
    }

    public void setCouponEntities(List<CouponEntity> couponEntities) {
        this.couponEntities = couponEntities;
    }

    @Override
    public String toString() {
        return "CompanyEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", couponEntities=" + couponEntities +
                '}';
    }
}
