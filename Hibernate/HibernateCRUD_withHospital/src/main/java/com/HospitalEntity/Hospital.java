package com.HospitalEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="HospitalRecord")
public class Hospital {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Hos_id;
	String name;
	String location;
	long mob_no;
	String email;
	String website;
	String type;
	@Column(name="Pcount")
	int capacity;

	public Hospital() {
		// default constructor

	}

	public Hospital(int hos_id, String name, String location, long mob_no, String email, String website, String type,
			int capacity) {
		// parameterized constructor
		super();
		Hos_id = hos_id;
		this.name = name;
		this.location = location;
		this.mob_no = mob_no;
		this.email = email;
		this.website = website;
		this.type = type;
		this.capacity = capacity;
	}

	// getter and setter methods
	public int getHos_id() {
		return Hos_id;
	}

	public void setHos_id(int hos_id) {
		Hos_id = hos_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override

	// to string method
	public String toString() {
		return "Hospital [Hos_id=" + Hos_id + ", name=" + name + ", location=" + location + ", mob_no=" + mob_no
				+ ", email=" + email + ", website=" + website + ", type=" + type + ", capacity=" + capacity + "]";
	}

}
