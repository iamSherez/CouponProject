package com.nadav.coupons.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    private long id;

    @Column(name = "address")
    private String address;

    @Column(name = "amount_of_children")
    private int amountOfChildren;

    @OneToMany(mappedBy = "customer")
    private List<PurchaseDetailsEntity> purchaseDetailsEntityList;

    public CustomerEntity() {
    }

    public CustomerEntity(String address, int amountOfChildren, List<PurchaseDetailsEntity> purchaseDetailsEntityList) {
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.purchaseDetailsEntityList = purchaseDetailsEntityList;
    }

    public CustomerEntity(long id, String address, int amountOfChildren, List<PurchaseDetailsEntity> purchaseDetailsEntityList) {
        this.id = id;
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.purchaseDetailsEntityList = purchaseDetailsEntityList;
    }

    public CustomerEntity(long id, String address, int amountOfChildren) {
        this.id = id;
        this.address = address;
        this.amountOfChildren = amountOfChildren;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public List<PurchaseDetailsEntity> getPurchaseDetailsEntityList() {
        return purchaseDetailsEntityList;
    }

    public void setPurchaseDetailsEntityList(List<PurchaseDetailsEntity> purchaseDetailsEntityList) {
        this.purchaseDetailsEntityList = purchaseDetailsEntityList;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", amountOfChildren=" + amountOfChildren +
                ", purchaseDetailsEntityList=" + purchaseDetailsEntityList +
                '}';
    }
}
