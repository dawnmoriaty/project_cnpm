package com.example.project.model.dto.request;

import com.example.project.model.entity.Product;
import lombok.*;

import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CategoryRequest {
    private String categoryName;
    private String description;
    Set<Product> product;
}
