package com.fyq;

import java.util.Scanner;

public class CMUtility {
	static Scanner sn=new Scanner(System.in);
	
	public static String readString(int limit){
		String str=readKeyBoard(limit,false);
		return str;
	}
	
	public static char readChar(int limit){
		while(true){
		String str=readKeyBoard(limit,false);
		char gender=str.charAt(0);
		if(gender=='��'||gender=='Ů')
		return gender;
		System.out.println("�Ա�ѡ���������������");
		
		}
	}
	
	public static char readMenuSelection(){
		char c;
		while(true){
		c=readKeyBoard(4,true).charAt(0);
		System.out.println(c);
		if(c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5')
		{
			System.out.println("ѡ���������������ѡ��");
			continue;
		}
		break;
		}
		return c;
	}
	
	public static int readInt(int limit){
		while(true){
		String str=readKeyBoard(limit,false);
		int age=Integer.parseInt(str.trim());
		if(age>0&&age<130)
			return age;
		System.out.print("����������䲻��ȷ�����������룺");
		}
	}
	
	public static String readKeyBoard(int limit,boolean blankReturn){
		String line="";
		while(sn.hasNextLine()){
			line=sn.nextLine();
			if(line.length()==0){
				if(blankReturn)
					return line;
				else
					continue;
			}
			if(line.length()<1||line.length()>limit){
				System.out.println("���볤�ȣ�������" + limit + "���������������룺");
				continue;
			}
			break;
		}
		return line;
	}
}

