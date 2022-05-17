package com.jobiak.mongodbspring.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Setter
@Getter
public class Customer {

	@Id
	public String id;
	public String firstName;
	public String lastName;
	/*
	 * public Customer() { super(); // TODO Auto-generated constructor stub } public
	 * Customer(String id, String firstName, String lastName) { super(); this.id =
	 * id; this.firstName = firstName; this.lastName = lastName; } public String
	 * getId() { return id; } public void setId(String id) { this.id = id; } public
	 * String getFirstName() { return firstName; } public void setFirstName(String
	 * firstName) { this.firstName = firstName; } public String getLastName() {
	 * return lastName; } public void setLastName(String lastName) { this.lastName =
	 * lastName; }
	 * 
	 * @Override public String toString() { return "Customer [id=" + id +
	 * ", firstName=" + firstName + ", lastName=" + lastName + "]"; }
	 */
	
}
