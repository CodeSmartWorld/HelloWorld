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
		// TODO �Զ����ɵķ������
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
		System.out.println("�������û�����:");
		name=CMUtility.readString(8);
	}
	public String getName(){
		return name;
	}
	public void setGender(){
		System.out.println("�������û��Ա�:");
		gender=CMUtility.readChar(1);
	}
	public char getGender(){
		return gender;
	}
	public void setAge(){
		System.out.println("�������û�����:");
		age=CMUtility.readInt(4);
	}
	public int getAge(){
		return age;
	}
	public void setPhone(){
		System.out.println("�������û��ֻ�:");
		phone=CMUtility.readString(13);
	}
	public String getPhone(){
		return phone;
	}
	public void setEmail(){
		System.out.println("�������û�Email:");
		email=CMUtility.readString(20);
	}
	public String getEmail(){
		return email;
	}
}
