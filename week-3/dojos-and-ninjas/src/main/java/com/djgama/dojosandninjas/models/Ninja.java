package com.djgama.dojosandninjas.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name="ninjas")
public class Ninja {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull (message = "Firstname cannot be empty")
	@Size(min = 0, max = 200, message = "Firstname cannot be empty")
	private String firstNname;


	@NotNull (message = "Lastname cannot be empty")
	@Size(min = 0, max = 200, message = "Lastname cannot be empty")
	private String lastName;

	@NotNull (message = "Age cannot be empty")
	@Min(value = 0, message = "Age must be greater than zero")
	private Integer age;

	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "dojo_id")
	private Dojo dojo;

//	Empty Constructor
	public Ninja() {
	}

//	Create Constructor
	public Ninja(String firstNname, String lastName, Integer age, Dojo dojo) {
		this.firstNname = firstNname;
		this.lastName = lastName;
		this.age = age;
		this.dojo = dojo;
	}

//	Update Constructor
	public Ninja(Long id, String firstNname, String lastName, Integer age, Dojo dojo) {
		this.id = id;
		this.firstNname = firstNname;
		this.lastName = lastName;
		this.age = age;
		this.dojo = dojo;
	}

	//	Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstNname() {
		return firstNname;
	}

	public void setFirstNname(String firstNname) {
		this.firstNname = firstNname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Dojo getDojo() {
		return dojo;
	}

	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}

	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
}
