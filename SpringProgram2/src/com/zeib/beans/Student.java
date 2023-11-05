package com.zeib.beans;

public class Student {
private String name;
private int id;
private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void display() {
	System.out.println(name);
	System.out.println(id);
	System.out.println(email);
}
}
