package com.lombok.Entity;

import java.util.Objects;

import org.apache.tomcat.util.buf.UEncoder;

public class UserEntity {
	
	private int user_id;
	private String name;
	private String address;
	public UserEntity(int user_id, String name, String address) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.address = address;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserEntity [user_id=" + user_id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, name, user_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name) && user_id == other.user_id;
	}
	
	public static void main(String[] args) {
        UserEntity ue = new UserEntity();
        ue.setUser_id(1);
        ue.setName("Snehal");
        ue.setAddress("Bhadrak");
        System.out.println(ue);
    }
}
