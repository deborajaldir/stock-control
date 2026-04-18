package com.debora.stock.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

@Schema(description = "Product entity")
@Entity
@Table(name = "products")
public class Product {

    @Schema(description = "Product ID", example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Product name", example = "Laptop Dell")
    @NotBlank(message = "The product name is required.")
    @Column(nullable = false)
    private String name;

    @Schema(description = "Quantity in stock", example = "10")
    @NotNull(message = "Quantity is mandatory.")
    @PositiveOrZero(message = "The quantity cannot be negative.")
    @Column(nullable = false)
    private Integer quantity;

    @Schema(description = "Product price", example = "3500.00")
    @NotNull(message = "Price is mandatory.")
    @DecimalMin(value = "0.01", message = "The price must be greater than zero.")
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Schema(description = "Product category", example = "Electronics")
    @NotBlank(message = "Category is required.")
    @Column(nullable = false)
    private String category;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}