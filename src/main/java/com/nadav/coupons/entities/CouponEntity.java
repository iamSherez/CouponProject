package com.nadav.coupons.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "coupons")
public class CouponEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "title", nullable = false)
        private String title;

        @Column(name = "description")
        private String description;

        @Column(name = "creation_date", nullable = false)
        private Date creationDate;

        @Column(name = "expiration_date", nullable = false)
        private Date expirationDate;

        @Column(name = "amount_in_stock", nullable = false)
        private int amountInStock;

        @Column(name = "price", nullable = false)
        private float price;

        @Column(name = "image_file_name")
        private String imageFileName;

        @ManyToOne()
        @JoinColumn(name = "category_id")
        private CategoryEntity category;

        @ManyToOne()
        @JoinColumn(name = "company_id")
        private CompanyEntity company;

        @OneToMany(mappedBy = "coupon")
        private List<PurchaseDetailsEntity> purchaseDetailsEntityList;

        public CouponEntity() {
        }

        public CouponEntity(String title, String description, Date creationDate, Date expirationDate, int amountInStock, float price, String imageFileName, CategoryEntity category, CompanyEntity company, List<PurchaseDetailsEntity> purchaseDetailsEntityList) {
                this.title = title;
                this.description = description;
                this.creationDate = creationDate;
                this.expirationDate = expirationDate;
                this.amountInStock = amountInStock;
                this.price = price;
                this.imageFileName = imageFileName;
                this.category = category;
                this.company = company;
                this.purchaseDetailsEntityList = purchaseDetailsEntityList;
        }

        public CouponEntity(long id, String title, String description, Date creationDate, Date expirationDate, int amountInStock, float price, String imageFileName, CategoryEntity category, CompanyEntity company, List<PurchaseDetailsEntity> purchaseDetailsEntityList) {
                this.id = id;
                this.title = title;
                this.description = description;
                this.creationDate = creationDate;
                this.expirationDate = expirationDate;
                this.amountInStock = amountInStock;
                this.price = price;
                this.imageFileName = imageFileName;
                this.category = category;
                this.company = company;
                this.purchaseDetailsEntityList = purchaseDetailsEntityList;
        }

        public CouponEntity(long id, String title, String description, Date creationDate, Date expirationDate, int amountInStock, float price, String imageFileName) {
                this.id = id;
                this.title = title;
                this.description = description;
                this.creationDate = creationDate;
                this.expirationDate = expirationDate;
                this.amountInStock = amountInStock;
                this.price = price;
                this.imageFileName = imageFileName;
        }

        @Override
        public String toString() {
                return "CouponEntity{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", description='" + description + '\'' +
                        ", creationDate=" + creationDate +
                        ", expirationDate=" + expirationDate +
                        ", amountInStock=" + amountInStock +
                        ", price=" + price +
                        ", imageFileName='" + imageFileName + '\'' +
                        ", category=" + category +
                        ", company=" + company +
                        ", purchaseDetailsEntityList=" + purchaseDetailsEntityList +
                        '}';
        }
}