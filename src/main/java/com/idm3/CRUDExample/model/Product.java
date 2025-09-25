package com.idm3.CRUDExample.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_Id")
  private long productId;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "product_description")
  private String productDescription;

  @Column(name = "stock_quantity")
  private long stockQuantity;

  @Column(name = "whole_sale_price")
  private double wholeSalePrice;

  @Column(name = "list_price")
  private double listPrice;

  @Column(name = "product_image")
  private String productImage;

}
