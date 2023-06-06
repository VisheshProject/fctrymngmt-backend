package com.fctrymngmnt.model;

import java.util.List;

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
@Table(name = "raw_material")
public class RawMaterial {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	int id;
	
	@Column(name = "name")
	String name;
	
	
	@OneToOne(cascade = CascadeType.ALL)       
	@JoinColumn(name = "raw_material_size_id")
	RawMaterialSize rawMaterialSize;
	

	@OneToOne(cascade = CascadeType.ALL)       
	@JoinColumn(name = "raw_material_type_id")
	RawMaterialType rawMaterialType;
	

	@Column(name = "cost")
	double cost;
	
	@Column(name = "shelf_life")
	int shelfLife;
	
	@Column(name = "avlbl_qty")
	double avlblQty;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RawMaterialSize getRawMaterialSize() {
		return rawMaterialSize;
	}
	public void setRawMaterialSize(RawMaterialSize rawMaterialSize) {
		this.rawMaterialSize = rawMaterialSize;
	}
	public RawMaterialType getRawMaterialType() {
		return rawMaterialType;
	}
	public void setRawMaterialType(RawMaterialType rawMaterialType) {
		this.rawMaterialType = rawMaterialType;
	}
	
	
	
	
	
}
