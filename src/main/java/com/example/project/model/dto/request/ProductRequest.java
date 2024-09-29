package com.example.project.model.dto.request;

import com.example.project.model.entity.Category;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductRequest {
    private String productName;
    private String description;
    private Integer quantity;
    private Integer size;
    private String color;
    private MultipartFile image;
    private Double price;
    private String status;
    private Date dateIn;
    private Date dateOut;
    private Long categoryId;
}
