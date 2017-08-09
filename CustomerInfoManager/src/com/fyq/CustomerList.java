package com.fyq;

public class CustomerList {
	int total=0;
	private Customer[] cl=new Customer[10];
	//添加客户
	public void addCustomer(){
		if(total>=10){
			System.out.println("客户已满，用户创建失败");
			return;
		}
		cl[total++]=new Customer();
		System.out.println("用户创建成功"+total);
	}
	//修改客户
	public void modifyCustomer(int index)
	{
		if(total<=0||total>=10){
			System.out.println("客户为空，不需删除");
			return;
		}
		if(index<0||index>total)
		{
			System.out.println("选择的对象不存在，请重新选择");
			return;
		}
		cl[--index].innit();
		System.out.println("客户"+index+"删除成功");
	}
	//获取所有客户列表
		public Customer[] getCustomerList()
		{
			if(total<=0){
				System.out.println("无客户存在");
				return null;
			}
			Customer[] cl2=new Customer[total];
			for(int i=0;i<total;i++){
				cl2[i]=cl[i];
			}
			return cl2;
			//System.out.println(cl[--total].toString());
		}
	//删除客户
	public void deleteCustomer(int index)
	{
		if(total<=0||total>=10){
			System.out.println("客户为空，不需删除");
			return;
		}
		if(index>total)
			System.out.println("删除的对象不存在，请重新选择");
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
		System.out.println("客户"+index+"删除成功");
	}
}
