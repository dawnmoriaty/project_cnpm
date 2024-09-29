package com.example.project.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="uuid")
    private UUID productId;
    @Column(name="product_name")
    private String productName;
    @Column(name="description")
    private String description;
    @Column(name="quantity")
    private Integer quantity;
    @Column(name="size")
    private Integer size;
    @Column(name="color")
    private String color;
    @Column(name="image")
    private String image;
    @Column(name="price")
    private Double price;
    @Column(name="status")
    private String status;
    @Column(name="date_in")
    private Date dateIn;
    @Column(name = "date_out")
    private Date dateOut;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    Category category;

}
