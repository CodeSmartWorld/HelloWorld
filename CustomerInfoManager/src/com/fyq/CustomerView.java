package com.fyq;

import java.io.IOException;

public class CustomerView {
	CustomerList cl=new CustomerList();
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		CustomerView c1=new CustomerView();
		c1.MainMenu();
	}
	public void MainMenu() throws IOException{
		boolean flag=true;
		do{
		System.out.println("-------�ͻ���Ϣ����ϵͳ-------");
		System.out.println("\t1��ӿͻ�");
		System.out.println("\t2�޸Ŀͻ�");
		System.out.println("\t3ɾ���ͻ�");
		System.out.println("\t4�ͻ��б�");
		System.out.println("\t5��        ��\n");
		System.out.println("\t��ѡ��1-5��");
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
				System.out.println("1 ��ӿͻ���Ϣ");
				addCustomer();
				break;
			}
		case '2':
		{
			System.out.println("�޸Ŀͻ���Ϣ");
			modifyCustomer(CMUtility.readInt(4));
			break;
		}
		case '3':
		{
			System.out.println("ɾ���ͻ���Ϣ");
			deleteCustomer(CMUtility.readInt(4));
			break;
		}
		case '4':
		{
			System.out.println("�ͻ��б�");
			getCustomerList();
			break;
		}
		case '5':
		{
			System.out.println("5�˳�ϵͳ");
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
