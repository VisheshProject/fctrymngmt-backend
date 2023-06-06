package com.fctrymngmnt.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "product_raw_material_mapping")
public class ProductRawMaterialMapping {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	int id;
	
	@OneToOne(cascade = CascadeType.ALL)       
	@JoinColumn(name = "product_id")
	Product product;
	
	@OneToOne(cascade = CascadeType.ALL)       
	@JoinColumn(name = "raw_material_id")
	RawMaterial rawMaterial;
	
	
    @Column(name = "weight_req")
	double weightReqd;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public RawMaterial getRawMaterial() {
		return rawMaterial;
	}
	public void setRawMaterialType(RawMaterial rawMaterial) {
		this.rawMaterial = rawMaterial;
	}
	
	public double getWeightReqd() {
		return weightReqd;
	}
	public void setWeightReqd(double weightReqd) {
		this.weightReqd = weightReqd;
	}

	
}
