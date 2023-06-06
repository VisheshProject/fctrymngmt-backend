package com.fctrymngmnt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_size")
public class ProductSize {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
   int id;
	@Column(name = "size")
   double Size;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSize() {
	return Size;
}
public void setSize(double size) {
	Size = size;
}
   
}
