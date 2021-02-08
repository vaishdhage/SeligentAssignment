package com.assignment.pojos;

import javax.persistence.*;


@Entity
@Table(name="product_table")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id")
	private int Id;
	@Column(name="name")
	private String Name;
	@Column(name="description")
	private String Description;
	@Column(name="price")
	private double Price;
	@Column(name="seller")
	private String Seller;
	@Column(name="location")
	private String Location;
	
	public Product() {
		System.out.println("in product default constr");
	}

	public Product(String name, String description, double price, String seller, String location) {
		super();
		Name = name;
		Description = description;
		Price = price;
		Seller = seller;
		Location = location;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	
	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	
	public String getSeller() {
		return Seller;
	}

	public void setSeller(String seller) {
		Seller = seller;
	}

	
	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", Description=" + Description + ", Price=" + Price
				+ ", Seller=" + Seller + ", Location=" + Location + "]";
	}

	
	

}
