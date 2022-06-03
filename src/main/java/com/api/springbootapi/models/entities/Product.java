package com.api.springbootapi.models.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "tbl_product")
/* @JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
) */
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "Name is required")
    @Column(name="product_name", length=100)
    private String name;

    @NotEmpty(message = "Description is required")
    @Column(name = "product_description", length = 500)
    private String description;

    private String price;

    @ManyToOne
    private Category category;

    @ManyToMany
    @JoinTable(
        name = "tbl_product_supplier",
        joinColumns = @JoinColumn(name="product_id"),
        inverseJoinColumns = @JoinColumn(name="supplier_id"))
    @JsonManagedReference
    private Set<Supplier> supplier;

    public Product() {
    }

    public Product(Long id, String name, String descrption, String price) {
        this.id = id;
        this.name = name;
        this.description = descrption;
        this.price = price;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrption) {
        this.description = descrption;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Supplier> getSupplier() {
        return supplier;
    }

    public void setSupplier(Set<Supplier> supplier) {
        this.supplier = supplier;
    }

    
}
