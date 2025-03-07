
package com.CarEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carrecord")
public class Car {
	@Id // for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="model")
	private String name;
	private String color;
	private long price;
	private String company;
	private String features;
	private int speed;

	public Car() {

	}

	public Car(int id, String name, String color, long price, String company, String features, int speed) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
		this.company = company;
		this.features = features;
		this.speed = speed;
	}

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", company=" + company
				+ ", features=" + features + ", speed=" + speed + "]";
	}

}
