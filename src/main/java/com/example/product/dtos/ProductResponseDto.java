package com.example.product.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
