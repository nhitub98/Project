//package com.example.demoproject.entities;
//
//import jakarta.persistence.*;
//
//@Table(name = "cart_items")
//public class CartItem {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
//    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "shopping_cart_id")
//    private ShoppingCart cart;
//
//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
//    private Product product;
//    private int quantity;
//    private double unitPrice;
//}
//
