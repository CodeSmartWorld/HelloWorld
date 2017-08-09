package com.fyq;

public class Customer {
	private String name;
	private char gender;
	private int age;
	private String phone;
	private String email;
	Customer(){
		innit();
	}
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "name:"+name+"gender:"+gender+"age:"+age+"phone:"+phone+"email"+email;
	}

	public void innit(){
		setName();
		setGender();
		setAge();
		setPhone();
		setEmail();
	}
	public void setName(){
		System.out.println("请输入用户姓名:");
		name=CMUtility.readString(8);
	}
	public String getName(){
		return name;
	}
	public void setGender(){
		System.out.println("请输入用户性别:");
		gender=CMUtility.readChar(1);
	}
	public char getGender(){
		return gender;
	}
	public void setAge(){
		System.out.println("请输入用户年龄:");
		age=CMUtility.readInt(4);
	}
	public int getAge(){
		return age;
	}
	public void setPhone(){
		System.out.println("请输入用户手机:");
		phone=CMUtility.readString(13);
	}
	public String getPhone(){
		return phone;
	}
	public void setEmail(){
		System.out.println("请输入用户Email:");
		email=CMUtility.readString(20);
	}
	public String getEmail(){
		return email;
	}
}
