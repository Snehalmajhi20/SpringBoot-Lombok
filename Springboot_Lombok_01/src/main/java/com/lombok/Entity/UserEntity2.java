package com.lombok.Entity;

import java.util.Objects;

import org.apache.tomcat.util.buf.UEncoder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity2 {
	
	private int user_id;
	private String name;
	private String address;
	
	public static void main(String[] args) {
        UserEntity2 ue = new UserEntity2();
        UserEntity2 ue1 = new UserEntity2(101, "Jagannath","Bhadrak");
        System.out.println(ue1);
        ue.setUser_id(1);
        ue.setName("Snehal");
        ue.setAddress("Bhadrak");
        System.out.println(ue);
    }
}
