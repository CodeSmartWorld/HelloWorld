package com.fyq;

public class CustomerList {
	int total=0;
	private Customer[] cl=new Customer[10];
	//��ӿͻ�
	public void addCustomer(){
		if(total>=10){
			System.out.println("�ͻ��������û�����ʧ��");
			return;
		}
		cl[total++]=new Customer();
		System.out.println("�û������ɹ�"+total);
	}
	//�޸Ŀͻ�
	public void modifyCustomer(int index)
	{
		if(total<=0||total>=10){
			System.out.println("�ͻ�Ϊ�գ�����ɾ��");
			return;
		}
		if(index<0||index>total)
		{
			System.out.println("ѡ��Ķ��󲻴��ڣ�������ѡ��");
			return;
		}
		cl[--index].innit();
		System.out.println("�ͻ�"+index+"ɾ���ɹ�");
	}
	//��ȡ���пͻ��б�
		public Customer[] getCustomerList()
		{
			if(total<=0){
				System.out.println("�޿ͻ�����");
				return null;
			}
			Customer[] cl2=new Customer[total];
			for(int i=0;i<total;i++){
				cl2[i]=cl[i];
			}
			return cl2;
			//System.out.println(cl[--total].toString());
		}
	//ɾ���ͻ�
	public void deleteCustomer(int index)
	{
		if(total<=0||total>=10){
			System.out.println("�ͻ�Ϊ�գ�����ɾ��");
			return;
		}
		if(index>total)
			System.out.println("ɾ���Ķ��󲻴��ڣ�������ѡ��");
		else if(index==total)
		{
			cl[--total]=null;
		}
		else
		{
			for(int i=index-1;i<total;i++){
				cl[i]=cl[i+1];
			}
			cl[--total]=null;
		}
		System.out.println("�ͻ�"+index+"ɾ���ɹ�");
	}
}
