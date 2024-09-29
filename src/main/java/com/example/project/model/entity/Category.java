package com.example.project.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name="description")
    private String description;
    @JsonIgnore
    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    Set<Product> product;

}
