package com.sample.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy1")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Category")
	private String category;
	@Column(name="Sum_assured")
	private int sum_assured;
	@Column(name="Premium")
	private int premium;
	@Column(name="Tenure")
	private int tenure;
	
	
	public Policy() {
		super();
		
	}


//	public Policy( String name, String category, int sum_assured, int premium, int tenure) {
//		super();
//		
//		this.name = name;
//		this.category=category;
//		this.sum_assured = sum_assured;
//		this.premium = premium;
//		this.tenure = tenure;
//	}


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


	


	


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getSum_assured() {
		return sum_assured;
	}


	public void setSum_assured(int sum_assured) {
		this.sum_assured = sum_assured;
	}


	public int getPremium() {
		return premium;
	}


	public void setPremium(int premium) {
		this.premium = premium;
	}


	public int getTenure() {
		return tenure;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}


	






	
}
