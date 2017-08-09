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
		if(gender=='男'||gender=='女')
		return gender;
		System.out.println("性别选择错误，请重新输入");
		
		}
	}
	
	public static char readMenuSelection(){
		char c;
		while(true){
		c=readKeyBoard(4,true).charAt(0);
		System.out.println(c);
		if(c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5')
		{
			System.out.println("选择错误，请重新输入选择");
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
		System.out.print("您输入的年龄不正确，请重新输入：");
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
				System.out.println("输入长度（不大于" + limit + "）错误，请重新输入：");
				continue;
			}
			break;
		}
		return line;
	}
}

