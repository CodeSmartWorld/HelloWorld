package com.fyq;

import java.io.IOException;

public class CustomerView {
	CustomerList cl=new CustomerList();
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		CustomerView c1=new CustomerView();
		c1.MainMenu();
	}
	public void MainMenu() throws IOException{
		boolean flag=true;
		do{
		System.out.println("-------客户信息管理系统-------");
		System.out.println("\t1添加客户");
		System.out.println("\t2修改客户");
		System.out.println("\t3删除客户");
		System.out.println("\t4客户列表");
		System.out.println("\t5退        出\n");
		System.out.println("\t请选择1-5：");
		MenuSelecNum();
		}
		while(flag);
		
	}
	public void MenuSelecNum() throws IOException{
		
		char key;
		key=CMUtility.readMenuSelection();
		switch (key) {
		case '1':
			{
				System.out.println("1 添加客户信息");
				addCustomer();
				break;
			}
		case '2':
		{
			System.out.println("修改客户信息");
			modifyCustomer(CMUtility.readInt(4));
			break;
		}
		case '3':
		{
			System.out.println("删除客户信息");
			deleteCustomer(CMUtility.readInt(4));
			break;
		}
		case '4':
		{
			System.out.println("客户列表");
			getCustomerList();
			break;
		}
		case '5':
		{
			System.out.println("5退出系统");
			System.exit(0);
			break;
		}
		}
		
		
	
	}
	public void modifyCustomer(int index){
		cl.modifyCustomer(index);
	}
	public void addCustomer(){
		cl.addCustomer();
	}
	public void deleteCustomer(int index){
		cl.deleteCustomer(index);
	}
	public void getCustomerList(){
		for(Customer c:cl.getCustomerList())
		System.out.println(c);
		/*
		if(cl2!=null){
		System.out.println(cl2[0].toString());
		
	}
	*/
		}
}
